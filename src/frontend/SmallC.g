grammar SmallC;

options {
output=AST;
}
@header {
package frontend;

import java.io.*;
// import antlr.CommonAST;
// import antlr.collections.AST;
import org.antlr.stringtemplate.StringTemplate;
}
@members
{
    public static void main(String[] args) throws Exception {
        // read in all files from input
        if (args.length > 0) {
            for (int i=0; i<args.length; i++)
                getFiles(new File(args[i]));
        }
    } //main()

    // the logic for this was adapted from http://javadude.com/articles/antlrtut/
    // an ANTLR2.0 tutorial...but had good ideas about testing
    // this handles finding the files and sending them to be parsed
    public static void getFiles(File f) throws Exception {
        // if we found a directory get all the files in that directory and
        // try to parse them
        if (f.isDirectory()) {
            String files[] = f.list();
            for (int i=0; i<files.length; i++) getFiles(new File(f, files[i]));
        }
        // this is a file...parse it
        else if(f.getName().substring(f.getName().length()-2).equals(".c"))
            parseFile(new ANTLRFileStream(f.getAbsolutePath()));
    } //getFiles

    // parses the file
    public static void parseFile(ANTLRFileStream f) throws Exception {
        String name = f.getSourceName();
        System.out.println("Parsing: "+name.substring(name.lastIndexOf("/")+1));

        //construct the objects we need to check this file and construct AST
        SmallCLexer lexer = new SmallCLexer(f);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SmallCParser parser = new SmallCParser(tokens);
        SmallCParser.prog_return r = parser.prog();

        name = name.substring(0,f.getSourceName().length()-2)+ ".txt";
        //write the tree to a file
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter(name));
            out.write(((Tree)r.tree).toStringTree());
            out.close();
        }catch (Exception e) {
            System.out.println("ERROR: "+e);
        }

        System.out.println();
    } //parseFile()
}

@lexer::header {package frontend;}
prog 	   :	includes decls procedure main 
		        -> ^(PROGRAM includes decls procedure main);

includes   :	(INCLUDE s+=STRING)* 
                -> ^(INCL $s*) ;

decls	   :	(id+=typedident SEMI)*
                -> ^(DECL $id*) ;

typedident :	(INT | CHAR)^ IDENT ;

proctype   :	(INT | CHAR)? ;

procdef    :	tp=proctype id=IDENT LPAR ag=args RPAR bd=body
		        -> ^($id ^(TYPE $tp?)  ^(ARGS $ag?) $bd?) ;

procedure  : 	(def+=procdef)*
		        -> ^(PROC ($def+)?) ;

args       :	(typedident (COM! typedident)*)* ; 

body	   :	LCUR de=decls st=stmtlist RCUR 
		        -> ^(BODY $de? $st?) ;

stmtlist   :	stmt* ;

main       :	(MAIN^ LPAR! RPAR! body) ;

lexp 	   :	term ((PLUS | MIN)^ term)* ;

term       :	factor ((FORW | STAR| MOD)^ factor)* ;

factor 	   : 	(LPAR! lexp^ RPAR!) 
                | (MIN? (IDENT | NUMBER | CHARACTER)) 
                | funcall ;

funcall 	:	nm=IDENT LPAR (var1+=IDENT (COM var2+=IDENT)*)* RPAR
                -> ^(CALL $nm? ^(ARGS $var1* $var2*)) ;

expType	   :	(GT | LT | GTE | LTE | NEQ | EQU)^ ;

conditional	: (options {k=1; backtrack=true;}: ELSE stmt)?
		        ->^(ELSE_TO ^(BODY stmt?));

exp 	   :	lexp (expType^ lexp)? ;

stmt	   : LCUR! stmtlist RCUR! 
           | WHILE^ LPAR! exp RPAR! stmt
           //ANTLR parses  this correctly. Adapted from the ANSI C
           //grammer: http://www.antlr.org/grammar/1153358328744/C.g
           | IF LPAR e=exp RPAR s1=stmt c=conditional
		    -> ^(IF_TO $e ^(BODY $s1?) $c?) 
           | id=IDENT EQ le=lexp SEMI
		    -> ^(EQ $id? $le?)
           | READ^ LPAR! IDENT RPAR! SEMI!
           | OUTPUT^ LPAR! IDENT RPAR! SEMI!
           | PRINT^ LPAR! STRING RPAR! SEMI!
           | RETURN^ lexp? SEMI!
           | READC^ LPAR! IDENT RPAR! SEMI!
           | OUTPUTC^ LPAR! IDENT RPAR! SEMI!
           | funcall SEMI!
           ;

//OPERATORS
MOD     :   '%' ;
FORW    :   '/' ;
COM     :   ',' ;
STAR    :   '*' ;
PLUS    :   '+' ;
MIN     :   '-' ;
GT      :   '>' ;
LT      :   '<' ;
LTE     :   '<=' ;
GTE     :   '>=' ;
EQ      :   '=' ;
NEQ     :   '!=' ;
EQU     :   '==' ;
RCUR    :   '}' ;
LCUR    :   '{' ;
RPAR    :   ')' ;
LPAR    :   '(' ;
SEMI    :   ';' ;

//TYPES
INT 	: 	'int' ;
CHAR	:	'char' ;

//RESERVED WORDS
INCLUDE :   '#include' ;
WHILE	:   'while' ;
IF   	:   'if' ;
ELSE 	:   'else' ;
READ	:   'read' ;
OUTPUT  :   'output' ;
PRINT   :   'print' ;
RETURN  :   'return' ;
READC   :   'readc' ;
OUTPUTC :   'outputc' ;
MAIN    :   'main' ;

//AST WORDS
PROGRAM	:  	'PROGRAM' ;
INCL    :   'INCLUDES' ;
IF_TO   :   'IF' ;
ELSE_TO :   'ELSE' ;
DECL	:	'DECL' ;
PROC	:	'PROC' ;
ARGS	:	'ARGS' ;
TYPE	:	'TYPE' ;
BODY	:	'BODY' ;
EXP 	:	'EXP' ;
CALL	:	'CALL' ;

WS  	   :    (' '|'\r'|'\t'|'\u000C'|'\n') {$channel=HIDDEN;};
NUMBER     :	'0'..'9'+ ;
IDENT	   :	('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')* ;
CHARACTER  :	('a'..'z'|'A'..'Z'|'0'..'9'|'['|']'|'\\'|';'|'\''|','|'.'|'/'|'-'|'='|'\t'|'\n'|'`'|' '|'!'|'@'|'#'|'$'|'%'|'^'|'&'|'*'|'('|')'|'_'|'+') ;
STRING	   :  '"' ( ESC_SEQ | ~('\\'|'"') )* '"' ;
ESC_SEQ    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\') ;
COMMENT    :   '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}  ;
