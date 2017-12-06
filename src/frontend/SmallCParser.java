// $ANTLR 3.4 /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g 2012-02-17 11:39:58

package frontend;

import java.io.*;
// import antlr.CommonAST;
// import antlr.collections.AST;
import org.antlr.stringtemplate.StringTemplate;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class SmallCParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ARGS", "BODY", "CALL", "CHAR", "CHARACTER", "COM", "COMMENT", "DECL", "ELSE", "ELSE_TO", "EQ", "EQU", "ESC_SEQ", "EXP", "FORW", "GT", "GTE", "IDENT", "IF", "IF_TO", "INCL", "INCLUDE", "INT", "LCUR", "LPAR", "LT", "LTE", "MAIN", "MIN", "MOD", "NEQ", "NUMBER", "OUTPUT", "OUTPUTC", "PLUS", "PRINT", "PROC", "PROGRAM", "RCUR", "READ", "READC", "RETURN", "RPAR", "SEMI", "STAR", "STRING", "TYPE", "WHILE", "WS"
    };

    public static final int EOF=-1;
    public static final int ARGS=4;
    public static final int BODY=5;
    public static final int CALL=6;
    public static final int CHAR=7;
    public static final int CHARACTER=8;
    public static final int COM=9;
    public static final int COMMENT=10;
    public static final int DECL=11;
    public static final int ELSE=12;
    public static final int ELSE_TO=13;
    public static final int EQ=14;
    public static final int EQU=15;
    public static final int ESC_SEQ=16;
    public static final int EXP=17;
    public static final int FORW=18;
    public static final int GT=19;
    public static final int GTE=20;
    public static final int IDENT=21;
    public static final int IF=22;
    public static final int IF_TO=23;
    public static final int INCL=24;
    public static final int INCLUDE=25;
    public static final int INT=26;
    public static final int LCUR=27;
    public static final int LPAR=28;
    public static final int LT=29;
    public static final int LTE=30;
    public static final int MAIN=31;
    public static final int MIN=32;
    public static final int MOD=33;
    public static final int NEQ=34;
    public static final int NUMBER=35;
    public static final int OUTPUT=36;
    public static final int OUTPUTC=37;
    public static final int PLUS=38;
    public static final int PRINT=39;
    public static final int PROC=40;
    public static final int PROGRAM=41;
    public static final int RCUR=42;
    public static final int READ=43;
    public static final int READC=44;
    public static final int RETURN=45;
    public static final int RPAR=46;
    public static final int SEMI=47;
    public static final int STAR=48;
    public static final int STRING=49;
    public static final int TYPE=50;
    public static final int WHILE=51;
    public static final int WS=52;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public SmallCParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public SmallCParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return SmallCParser.tokenNames; }
    public String getGrammarFileName() { return "/afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g"; }


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


    public static class prog_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "prog"
    // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:65:1: prog : includes decls procedure main -> ^( PROGRAM includes decls procedure main ) ;
    public final SmallCParser.prog_return prog() throws RecognitionException {
        SmallCParser.prog_return retval = new SmallCParser.prog_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        SmallCParser.includes_return includes1 =null;

        SmallCParser.decls_return decls2 =null;

        SmallCParser.procedure_return procedure3 =null;

        SmallCParser.main_return main4 =null;


        RewriteRuleSubtreeStream stream_decls=new RewriteRuleSubtreeStream(adaptor,"rule decls");
        RewriteRuleSubtreeStream stream_includes=new RewriteRuleSubtreeStream(adaptor,"rule includes");
        RewriteRuleSubtreeStream stream_procedure=new RewriteRuleSubtreeStream(adaptor,"rule procedure");
        RewriteRuleSubtreeStream stream_main=new RewriteRuleSubtreeStream(adaptor,"rule main");
        try {
            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:65:10: ( includes decls procedure main -> ^( PROGRAM includes decls procedure main ) )
            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:65:12: includes decls procedure main
            {
            pushFollow(FOLLOW_includes_in_prog42);
            includes1=includes();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_includes.add(includes1.getTree());

            pushFollow(FOLLOW_decls_in_prog44);
            decls2=decls();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_decls.add(decls2.getTree());

            pushFollow(FOLLOW_procedure_in_prog46);
            procedure3=procedure();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_procedure.add(procedure3.getTree());

            pushFollow(FOLLOW_main_in_prog48);
            main4=main();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_main.add(main4.getTree());

            // AST REWRITE
            // elements: includes, procedure, decls, main
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 66:11: -> ^( PROGRAM includes decls procedure main )
            {
                // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:66:14: ^( PROGRAM includes decls procedure main )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(PROGRAM, "PROGRAM")
                , root_1);

                adaptor.addChild(root_1, stream_includes.nextTree());

                adaptor.addChild(root_1, stream_decls.nextTree());

                adaptor.addChild(root_1, stream_procedure.nextTree());

                adaptor.addChild(root_1, stream_main.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "prog"


    public static class includes_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "includes"
    // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:68:1: includes : ( INCLUDE s+= STRING )* -> ^( INCL ( $s)* ) ;
    public final SmallCParser.includes_return includes() throws RecognitionException {
        SmallCParser.includes_return retval = new SmallCParser.includes_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token INCLUDE5=null;
        Token s=null;
        List list_s=null;

        Object INCLUDE5_tree=null;
        Object s_tree=null;
        RewriteRuleTokenStream stream_INCLUDE=new RewriteRuleTokenStream(adaptor,"token INCLUDE");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");

        try {
            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:68:12: ( ( INCLUDE s+= STRING )* -> ^( INCL ( $s)* ) )
            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:68:14: ( INCLUDE s+= STRING )*
            {
            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:68:14: ( INCLUDE s+= STRING )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==INCLUDE) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:68:15: INCLUDE s+= STRING
            	    {
            	    INCLUDE5=(Token)match(input,INCLUDE,FOLLOW_INCLUDE_in_includes84); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_INCLUDE.add(INCLUDE5);


            	    s=(Token)match(input,STRING,FOLLOW_STRING_in_includes88); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_STRING.add(s);

            	    if (list_s==null) list_s=new ArrayList();
            	    list_s.add(s);


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            // AST REWRITE
            // elements: s
            // token labels: 
            // rule labels: retval
            // token list labels: s
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleTokenStream stream_s=new RewriteRuleTokenStream(adaptor,"token s", list_s);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 69:17: -> ^( INCL ( $s)* )
            {
                // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:69:20: ^( INCL ( $s)* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(INCL, "INCL")
                , root_1);

                // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:69:28: ( $s)*
                while ( stream_s.hasNext() ) {
                    adaptor.addChild(root_1, stream_s.nextNode());

                }
                stream_s.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "includes"


    public static class decls_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "decls"
    // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:71:1: decls : (id+= typedident SEMI )* -> ^( DECL ( $id)* ) ;
    public final SmallCParser.decls_return decls() throws RecognitionException {
        SmallCParser.decls_return retval = new SmallCParser.decls_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token SEMI6=null;
        List list_id=null;
        RuleReturnScope id = null;
        Object SEMI6_tree=null;
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleSubtreeStream stream_typedident=new RewriteRuleSubtreeStream(adaptor,"rule typedident");
        try {
            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:71:10: ( (id+= typedident SEMI )* -> ^( DECL ( $id)* ) )
            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:71:12: (id+= typedident SEMI )*
            {
            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:71:12: (id+= typedident SEMI )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==CHAR||LA2_0==INT) ) {
                    int LA2_1 = input.LA(2);

                    if ( (LA2_1==IDENT) ) {
                        int LA2_3 = input.LA(3);

                        if ( (LA2_3==SEMI) ) {
                            alt2=1;
                        }


                    }


                }


                switch (alt2) {
            	case 1 :
            	    // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:71:13: id+= typedident SEMI
            	    {
            	    pushFollow(FOLLOW_typedident_in_decls132);
            	    id=typedident();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_typedident.add(id.getTree());
            	    if (list_id==null) list_id=new ArrayList();
            	    list_id.add(id.getTree());


            	    SEMI6=(Token)match(input,SEMI,FOLLOW_SEMI_in_decls134); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_SEMI.add(SEMI6);


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            // AST REWRITE
            // elements: id
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: id
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"token id",list_id);
            root_0 = (Object)adaptor.nil();
            // 72:17: -> ^( DECL ( $id)* )
            {
                // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:72:20: ^( DECL ( $id)* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(DECL, "DECL")
                , root_1);

                // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:72:28: ( $id)*
                while ( stream_id.hasNext() ) {
                    adaptor.addChild(root_1, stream_id.nextTree());

                }
                stream_id.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "decls"


    public static class typedident_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "typedident"
    // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:74:1: typedident : ( INT | CHAR ) ^ IDENT ;
    public final SmallCParser.typedident_return typedident() throws RecognitionException {
        SmallCParser.typedident_return retval = new SmallCParser.typedident_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set7=null;
        Token IDENT8=null;

        Object set7_tree=null;
        Object IDENT8_tree=null;

        try {
            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:74:12: ( ( INT | CHAR ) ^ IDENT )
            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:74:14: ( INT | CHAR ) ^ IDENT
            {
            root_0 = (Object)adaptor.nil();


            set7=(Token)input.LT(1);

            set7=(Token)input.LT(1);

            if ( input.LA(1)==CHAR||input.LA(1)==INT ) {
                input.consume();
                if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(set7)
                , root_0);
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            IDENT8=(Token)match(input,IDENT,FOLLOW_IDENT_in_typedident180); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENT8_tree = 
            (Object)adaptor.create(IDENT8)
            ;
            adaptor.addChild(root_0, IDENT8_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "typedident"


    public static class proctype_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "proctype"
    // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:76:1: proctype : ( INT | CHAR )? ;
    public final SmallCParser.proctype_return proctype() throws RecognitionException {
        SmallCParser.proctype_return retval = new SmallCParser.proctype_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set9=null;

        Object set9_tree=null;

        try {
            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:76:12: ( ( INT | CHAR )? )
            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:76:14: ( INT | CHAR )?
            {
            root_0 = (Object)adaptor.nil();


            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:76:14: ( INT | CHAR )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==CHAR||LA3_0==INT) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:
                    {
                    set9=(Token)input.LT(1);

                    if ( input.LA(1)==CHAR||input.LA(1)==INT ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (Object)adaptor.create(set9)
                        );
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "proctype"


    public static class procdef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "procdef"
    // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:78:1: procdef : tp= proctype id= IDENT LPAR ag= args RPAR bd= body -> ^( $id ^( TYPE ( $tp)? ) ^( ARGS ( $ag)? ) ( $bd)? ) ;
    public final SmallCParser.procdef_return procdef() throws RecognitionException {
        SmallCParser.procdef_return retval = new SmallCParser.procdef_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token id=null;
        Token LPAR10=null;
        Token RPAR11=null;
        SmallCParser.proctype_return tp =null;

        SmallCParser.args_return ag =null;

        SmallCParser.body_return bd =null;


        Object id_tree=null;
        Object LPAR10_tree=null;
        Object RPAR11_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_RPAR=new RewriteRuleTokenStream(adaptor,"token RPAR");
        RewriteRuleTokenStream stream_LPAR=new RewriteRuleTokenStream(adaptor,"token LPAR");
        RewriteRuleSubtreeStream stream_body=new RewriteRuleSubtreeStream(adaptor,"rule body");
        RewriteRuleSubtreeStream stream_args=new RewriteRuleSubtreeStream(adaptor,"rule args");
        RewriteRuleSubtreeStream stream_proctype=new RewriteRuleSubtreeStream(adaptor,"rule proctype");
        try {
            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:78:12: (tp= proctype id= IDENT LPAR ag= args RPAR bd= body -> ^( $id ^( TYPE ( $tp)? ) ^( ARGS ( $ag)? ) ( $bd)? ) )
            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:78:14: tp= proctype id= IDENT LPAR ag= args RPAR bd= body
            {
            pushFollow(FOLLOW_proctype_in_procdef212);
            tp=proctype();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_proctype.add(tp.getTree());

            id=(Token)match(input,IDENT,FOLLOW_IDENT_in_procdef216); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENT.add(id);


            LPAR10=(Token)match(input,LPAR,FOLLOW_LPAR_in_procdef218); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAR.add(LPAR10);


            pushFollow(FOLLOW_args_in_procdef222);
            ag=args();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_args.add(ag.getTree());

            RPAR11=(Token)match(input,RPAR,FOLLOW_RPAR_in_procdef224); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAR.add(RPAR11);


            pushFollow(FOLLOW_body_in_procdef228);
            bd=body();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_body.add(bd.getTree());

            // AST REWRITE
            // elements: bd, ag, id, tp
            // token labels: id
            // rule labels: retval, tp, ag, bd
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleTokenStream stream_id=new RewriteRuleTokenStream(adaptor,"token id",id);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_tp=new RewriteRuleSubtreeStream(adaptor,"rule tp",tp!=null?tp.tree:null);
            RewriteRuleSubtreeStream stream_ag=new RewriteRuleSubtreeStream(adaptor,"rule ag",ag!=null?ag.tree:null);
            RewriteRuleSubtreeStream stream_bd=new RewriteRuleSubtreeStream(adaptor,"rule bd",bd!=null?bd.tree:null);

            root_0 = (Object)adaptor.nil();
            // 79:11: -> ^( $id ^( TYPE ( $tp)? ) ^( ARGS ( $ag)? ) ( $bd)? )
            {
                // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:79:14: ^( $id ^( TYPE ( $tp)? ) ^( ARGS ( $ag)? ) ( $bd)? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_id.nextNode(), root_1);

                // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:79:20: ^( TYPE ( $tp)? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(TYPE, "TYPE")
                , root_2);

                // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:79:28: ( $tp)?
                if ( stream_tp.hasNext() ) {
                    adaptor.addChild(root_2, stream_tp.nextTree());

                }
                stream_tp.reset();

                adaptor.addChild(root_1, root_2);
                }

                // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:79:34: ^( ARGS ( $ag)? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(ARGS, "ARGS")
                , root_2);

                // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:79:42: ( $ag)?
                if ( stream_ag.hasNext() ) {
                    adaptor.addChild(root_2, stream_ag.nextTree());

                }
                stream_ag.reset();

                adaptor.addChild(root_1, root_2);
                }

                // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:79:48: ( $bd)?
                if ( stream_bd.hasNext() ) {
                    adaptor.addChild(root_1, stream_bd.nextTree());

                }
                stream_bd.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "procdef"


    public static class procedure_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "procedure"
    // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:81:1: procedure : (def+= procdef )* -> ^( PROC ( ( $def)+ )? ) ;
    public final SmallCParser.procedure_return procedure() throws RecognitionException {
        SmallCParser.procedure_return retval = new SmallCParser.procedure_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        List list_def=null;
        RuleReturnScope def = null;
        RewriteRuleSubtreeStream stream_procdef=new RewriteRuleSubtreeStream(adaptor,"rule procdef");
        try {
            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:81:12: ( (def+= procdef )* -> ^( PROC ( ( $def)+ )? ) )
            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:81:15: (def+= procdef )*
            {
            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:81:15: (def+= procdef )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==CHAR||LA4_0==IDENT||LA4_0==INT) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:81:16: def+= procdef
            	    {
            	    pushFollow(FOLLOW_procdef_in_procedure280);
            	    def=procdef();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_procdef.add(def.getTree());
            	    if (list_def==null) list_def=new ArrayList();
            	    list_def.add(def.getTree());


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            // AST REWRITE
            // elements: def
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: def
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_def=new RewriteRuleSubtreeStream(adaptor,"token def",list_def);
            root_0 = (Object)adaptor.nil();
            // 82:11: -> ^( PROC ( ( $def)+ )? )
            {
                // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:82:14: ^( PROC ( ( $def)+ )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(PROC, "PROC")
                , root_1);

                // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:82:21: ( ( $def)+ )?
                if ( stream_def.hasNext() ) {
                    if ( !(stream_def.hasNext()) ) {
                        throw new RewriteEarlyExitException();
                    }
                    while ( stream_def.hasNext() ) {
                        adaptor.addChild(root_1, stream_def.nextTree());

                    }
                    stream_def.reset();

                }
                stream_def.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "procedure"


    public static class args_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "args"
    // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:84:1: args : ( typedident ( COM ! typedident )* )* ;
    public final SmallCParser.args_return args() throws RecognitionException {
        SmallCParser.args_return retval = new SmallCParser.args_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token COM13=null;
        SmallCParser.typedident_return typedident12 =null;

        SmallCParser.typedident_return typedident14 =null;


        Object COM13_tree=null;

        try {
            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:84:12: ( ( typedident ( COM ! typedident )* )* )
            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:84:14: ( typedident ( COM ! typedident )* )*
            {
            root_0 = (Object)adaptor.nil();


            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:84:14: ( typedident ( COM ! typedident )* )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==CHAR||LA6_0==INT) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:84:15: typedident ( COM ! typedident )*
            	    {
            	    pushFollow(FOLLOW_typedident_in_args321);
            	    typedident12=typedident();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, typedident12.getTree());

            	    // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:84:26: ( COM ! typedident )*
            	    loop5:
            	    do {
            	        int alt5=2;
            	        int LA5_0 = input.LA(1);

            	        if ( (LA5_0==COM) ) {
            	            alt5=1;
            	        }


            	        switch (alt5) {
            	    	case 1 :
            	    	    // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:84:27: COM ! typedident
            	    	    {
            	    	    COM13=(Token)match(input,COM,FOLLOW_COM_in_args324); if (state.failed) return retval;

            	    	    pushFollow(FOLLOW_typedident_in_args327);
            	    	    typedident14=typedident();

            	    	    state._fsp--;
            	    	    if (state.failed) return retval;
            	    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, typedident14.getTree());

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop5;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "args"


    public static class body_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "body"
    // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:86:1: body : LCUR de= decls st= stmtlist RCUR -> ^( BODY ( $de)? ( $st)? ) ;
    public final SmallCParser.body_return body() throws RecognitionException {
        SmallCParser.body_return retval = new SmallCParser.body_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token LCUR15=null;
        Token RCUR16=null;
        SmallCParser.decls_return de =null;

        SmallCParser.stmtlist_return st =null;


        Object LCUR15_tree=null;
        Object RCUR16_tree=null;
        RewriteRuleTokenStream stream_LCUR=new RewriteRuleTokenStream(adaptor,"token LCUR");
        RewriteRuleTokenStream stream_RCUR=new RewriteRuleTokenStream(adaptor,"token RCUR");
        RewriteRuleSubtreeStream stream_stmtlist=new RewriteRuleSubtreeStream(adaptor,"rule stmtlist");
        RewriteRuleSubtreeStream stream_decls=new RewriteRuleSubtreeStream(adaptor,"rule decls");
        try {
            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:86:9: ( LCUR de= decls st= stmtlist RCUR -> ^( BODY ( $de)? ( $st)? ) )
            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:86:11: LCUR de= decls st= stmtlist RCUR
            {
            LCUR15=(Token)match(input,LCUR,FOLLOW_LCUR_in_body344); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LCUR.add(LCUR15);


            pushFollow(FOLLOW_decls_in_body348);
            de=decls();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_decls.add(de.getTree());

            pushFollow(FOLLOW_stmtlist_in_body352);
            st=stmtlist();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_stmtlist.add(st.getTree());

            RCUR16=(Token)match(input,RCUR,FOLLOW_RCUR_in_body354); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RCUR.add(RCUR16);


            // AST REWRITE
            // elements: st, de
            // token labels: 
            // rule labels: de, retval, st
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_de=new RewriteRuleSubtreeStream(adaptor,"rule de",de!=null?de.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_st=new RewriteRuleSubtreeStream(adaptor,"rule st",st!=null?st.tree:null);

            root_0 = (Object)adaptor.nil();
            // 87:11: -> ^( BODY ( $de)? ( $st)? )
            {
                // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:87:14: ^( BODY ( $de)? ( $st)? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(BODY, "BODY")
                , root_1);

                // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:87:22: ( $de)?
                if ( stream_de.hasNext() ) {
                    adaptor.addChild(root_1, stream_de.nextTree());

                }
                stream_de.reset();

                // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:87:27: ( $st)?
                if ( stream_st.hasNext() ) {
                    adaptor.addChild(root_1, stream_st.nextTree());

                }
                stream_st.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "body"


    public static class stmtlist_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stmtlist"
    // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:89:1: stmtlist : ( stmt )* ;
    public final SmallCParser.stmtlist_return stmtlist() throws RecognitionException {
        SmallCParser.stmtlist_return retval = new SmallCParser.stmtlist_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        SmallCParser.stmt_return stmt17 =null;



        try {
            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:89:12: ( ( stmt )* )
            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:89:14: ( stmt )*
            {
            root_0 = (Object)adaptor.nil();


            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:89:14: ( stmt )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0 >= IDENT && LA7_0 <= IF)||LA7_0==LCUR||(LA7_0 >= OUTPUT && LA7_0 <= OUTPUTC)||LA7_0==PRINT||(LA7_0 >= READ && LA7_0 <= RETURN)||LA7_0==WHILE) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:89:14: stmt
            	    {
            	    pushFollow(FOLLOW_stmt_in_stmtlist390);
            	    stmt17=stmt();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmt17.getTree());

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "stmtlist"


    public static class main_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "main"
    // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:91:1: main : ( MAIN ^ LPAR ! RPAR ! body ) ;
    public final SmallCParser.main_return main() throws RecognitionException {
        SmallCParser.main_return retval = new SmallCParser.main_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token MAIN18=null;
        Token LPAR19=null;
        Token RPAR20=null;
        SmallCParser.body_return body21 =null;


        Object MAIN18_tree=null;
        Object LPAR19_tree=null;
        Object RPAR20_tree=null;

        try {
            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:91:12: ( ( MAIN ^ LPAR ! RPAR ! body ) )
            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:91:14: ( MAIN ^ LPAR ! RPAR ! body )
            {
            root_0 = (Object)adaptor.nil();


            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:91:14: ( MAIN ^ LPAR ! RPAR ! body )
            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:91:15: MAIN ^ LPAR ! RPAR ! body
            {
            MAIN18=(Token)match(input,MAIN,FOLLOW_MAIN_in_main407); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            MAIN18_tree = 
            (Object)adaptor.create(MAIN18)
            ;
            root_0 = (Object)adaptor.becomeRoot(MAIN18_tree, root_0);
            }

            LPAR19=(Token)match(input,LPAR,FOLLOW_LPAR_in_main410); if (state.failed) return retval;

            RPAR20=(Token)match(input,RPAR,FOLLOW_RPAR_in_main413); if (state.failed) return retval;

            pushFollow(FOLLOW_body_in_main416);
            body21=body();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, body21.getTree());

            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "main"


    public static class lexp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "lexp"
    // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:93:1: lexp : term ( ( PLUS | MIN ) ^ term )* ;
    public final SmallCParser.lexp_return lexp() throws RecognitionException {
        SmallCParser.lexp_return retval = new SmallCParser.lexp_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set23=null;
        SmallCParser.term_return term22 =null;

        SmallCParser.term_return term24 =null;


        Object set23_tree=null;

        try {
            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:93:10: ( term ( ( PLUS | MIN ) ^ term )* )
            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:93:12: term ( ( PLUS | MIN ) ^ term )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_term_in_lexp430);
            term22=term();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, term22.getTree());

            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:93:17: ( ( PLUS | MIN ) ^ term )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==MIN||LA8_0==PLUS) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:93:18: ( PLUS | MIN ) ^ term
            	    {
            	    set23=(Token)input.LT(1);

            	    set23=(Token)input.LT(1);

            	    if ( input.LA(1)==MIN||input.LA(1)==PLUS ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(
            	        (Object)adaptor.create(set23)
            	        , root_0);
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_term_in_lexp442);
            	    term24=term();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, term24.getTree());

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "lexp"


    public static class term_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "term"
    // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:95:1: term : factor ( ( FORW | STAR | MOD ) ^ factor )* ;
    public final SmallCParser.term_return term() throws RecognitionException {
        SmallCParser.term_return retval = new SmallCParser.term_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set26=null;
        SmallCParser.factor_return factor25 =null;

        SmallCParser.factor_return factor27 =null;


        Object set26_tree=null;

        try {
            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:95:12: ( factor ( ( FORW | STAR | MOD ) ^ factor )* )
            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:95:14: factor ( ( FORW | STAR | MOD ) ^ factor )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_factor_in_term459);
            factor25=factor();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, factor25.getTree());

            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:95:21: ( ( FORW | STAR | MOD ) ^ factor )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==FORW||LA9_0==MOD||LA9_0==STAR) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:95:22: ( FORW | STAR | MOD ) ^ factor
            	    {
            	    set26=(Token)input.LT(1);

            	    set26=(Token)input.LT(1);

            	    if ( input.LA(1)==FORW||input.LA(1)==MOD||input.LA(1)==STAR ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(
            	        (Object)adaptor.create(set26)
            	        , root_0);
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_factor_in_term474);
            	    factor27=factor();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, factor27.getTree());

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "term"


    public static class factor_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "factor"
    // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:97:1: factor : ( ( LPAR ! lexp ^ RPAR !) | ( ( MIN )? ( IDENT | NUMBER | CHARACTER ) ) | funcall );
    public final SmallCParser.factor_return factor() throws RecognitionException {
        SmallCParser.factor_return retval = new SmallCParser.factor_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token LPAR28=null;
        Token RPAR30=null;
        Token MIN31=null;
        Token set32=null;
        SmallCParser.lexp_return lexp29 =null;

        SmallCParser.funcall_return funcall33 =null;


        Object LPAR28_tree=null;
        Object RPAR30_tree=null;
        Object MIN31_tree=null;
        Object set32_tree=null;

        try {
            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:97:12: ( ( LPAR ! lexp ^ RPAR !) | ( ( MIN )? ( IDENT | NUMBER | CHARACTER ) ) | funcall )
            int alt11=3;
            switch ( input.LA(1) ) {
            case LPAR:
                {
                alt11=1;
                }
                break;
            case CHARACTER:
            case MIN:
            case NUMBER:
                {
                alt11=2;
                }
                break;
            case IDENT:
                {
                int LA11_3 = input.LA(2);

                if ( (LA11_3==LPAR) ) {
                    alt11=3;
                }
                else if ( (LA11_3==EQU||(LA11_3 >= FORW && LA11_3 <= GTE)||(LA11_3 >= LT && LA11_3 <= LTE)||(LA11_3 >= MIN && LA11_3 <= NEQ)||LA11_3==PLUS||(LA11_3 >= RPAR && LA11_3 <= STAR)) ) {
                    alt11=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 3, input);

                    throw nvae;

                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;

            }

            switch (alt11) {
                case 1 :
                    // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:97:15: ( LPAR ! lexp ^ RPAR !)
                    {
                    root_0 = (Object)adaptor.nil();


                    // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:97:15: ( LPAR ! lexp ^ RPAR !)
                    // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:97:16: LPAR ! lexp ^ RPAR !
                    {
                    LPAR28=(Token)match(input,LPAR,FOLLOW_LPAR_in_factor491); if (state.failed) return retval;

                    pushFollow(FOLLOW_lexp_in_factor494);
                    lexp29=lexp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(lexp29.getTree(), root_0);

                    RPAR30=(Token)match(input,RPAR,FOLLOW_RPAR_in_factor497); if (state.failed) return retval;

                    }


                    }
                    break;
                case 2 :
                    // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:98:19: ( ( MIN )? ( IDENT | NUMBER | CHARACTER ) )
                    {
                    root_0 = (Object)adaptor.nil();


                    // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:98:19: ( ( MIN )? ( IDENT | NUMBER | CHARACTER ) )
                    // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:98:20: ( MIN )? ( IDENT | NUMBER | CHARACTER )
                    {
                    // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:98:20: ( MIN )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==MIN) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:98:20: MIN
                            {
                            MIN31=(Token)match(input,MIN,FOLLOW_MIN_in_factor521); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            MIN31_tree = 
                            (Object)adaptor.create(MIN31)
                            ;
                            adaptor.addChild(root_0, MIN31_tree);
                            }

                            }
                            break;

                    }


                    set32=(Token)input.LT(1);

                    if ( input.LA(1)==CHARACTER||input.LA(1)==IDENT||input.LA(1)==NUMBER ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (Object)adaptor.create(set32)
                        );
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }


                    }
                    break;
                case 3 :
                    // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:99:19: funcall
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_funcall_in_factor556);
                    funcall33=funcall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, funcall33.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "factor"


    public static class funcall_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "funcall"
    // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:101:1: funcall : nm= IDENT LPAR (var1+= IDENT ( COM var2+= IDENT )* )* RPAR -> ^( CALL ( $nm)? ^( ARGS ( $var1)* ( $var2)* ) ) ;
    public final SmallCParser.funcall_return funcall() throws RecognitionException {
        SmallCParser.funcall_return retval = new SmallCParser.funcall_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token nm=null;
        Token LPAR34=null;
        Token COM35=null;
        Token RPAR36=null;
        Token var1=null;
        Token var2=null;
        List list_var1=null;
        List list_var2=null;

        Object nm_tree=null;
        Object LPAR34_tree=null;
        Object COM35_tree=null;
        Object RPAR36_tree=null;
        Object var1_tree=null;
        Object var2_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_RPAR=new RewriteRuleTokenStream(adaptor,"token RPAR");
        RewriteRuleTokenStream stream_LPAR=new RewriteRuleTokenStream(adaptor,"token LPAR");
        RewriteRuleTokenStream stream_COM=new RewriteRuleTokenStream(adaptor,"token COM");

        try {
            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:101:10: (nm= IDENT LPAR (var1+= IDENT ( COM var2+= IDENT )* )* RPAR -> ^( CALL ( $nm)? ^( ARGS ( $var1)* ( $var2)* ) ) )
            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:101:12: nm= IDENT LPAR (var1+= IDENT ( COM var2+= IDENT )* )* RPAR
            {
            nm=(Token)match(input,IDENT,FOLLOW_IDENT_in_funcall568); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENT.add(nm);


            LPAR34=(Token)match(input,LPAR,FOLLOW_LPAR_in_funcall570); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAR.add(LPAR34);


            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:101:26: (var1+= IDENT ( COM var2+= IDENT )* )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==IDENT) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:101:27: var1+= IDENT ( COM var2+= IDENT )*
            	    {
            	    var1=(Token)match(input,IDENT,FOLLOW_IDENT_in_funcall575); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_IDENT.add(var1);

            	    if (list_var1==null) list_var1=new ArrayList();
            	    list_var1.add(var1);


            	    // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:101:39: ( COM var2+= IDENT )*
            	    loop12:
            	    do {
            	        int alt12=2;
            	        int LA12_0 = input.LA(1);

            	        if ( (LA12_0==COM) ) {
            	            alt12=1;
            	        }


            	        switch (alt12) {
            	    	case 1 :
            	    	    // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:101:40: COM var2+= IDENT
            	    	    {
            	    	    COM35=(Token)match(input,COM,FOLLOW_COM_in_funcall578); if (state.failed) return retval; 
            	    	    if ( state.backtracking==0 ) stream_COM.add(COM35);


            	    	    var2=(Token)match(input,IDENT,FOLLOW_IDENT_in_funcall582); if (state.failed) return retval; 
            	    	    if ( state.backtracking==0 ) stream_IDENT.add(var2);

            	    	    if (list_var2==null) list_var2=new ArrayList();
            	    	    list_var2.add(var2);


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop12;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            RPAR36=(Token)match(input,RPAR,FOLLOW_RPAR_in_funcall588); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAR.add(RPAR36);


            // AST REWRITE
            // elements: nm, var1, var2
            // token labels: nm
            // rule labels: retval
            // token list labels: var1, var2
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleTokenStream stream_nm=new RewriteRuleTokenStream(adaptor,"token nm",nm);
            RewriteRuleTokenStream stream_var1=new RewriteRuleTokenStream(adaptor,"token var1", list_var1);
            RewriteRuleTokenStream stream_var2=new RewriteRuleTokenStream(adaptor,"token var2", list_var2);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 102:17: -> ^( CALL ( $nm)? ^( ARGS ( $var1)* ( $var2)* ) )
            {
                // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:102:20: ^( CALL ( $nm)? ^( ARGS ( $var1)* ( $var2)* ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(CALL, "CALL")
                , root_1);

                // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:102:28: ( $nm)?
                if ( stream_nm.hasNext() ) {
                    adaptor.addChild(root_1, stream_nm.nextNode());

                }
                stream_nm.reset();

                // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:102:32: ^( ARGS ( $var1)* ( $var2)* )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(ARGS, "ARGS")
                , root_2);

                // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:102:40: ( $var1)*
                while ( stream_var1.hasNext() ) {
                    adaptor.addChild(root_2, stream_var1.nextNode());

                }
                stream_var1.reset();

                // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:102:47: ( $var2)*
                while ( stream_var2.hasNext() ) {
                    adaptor.addChild(root_2, stream_var2.nextNode());

                }
                stream_var2.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "funcall"


    public static class expType_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expType"
    // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:104:1: expType : ( GT | LT | GTE | LTE | NEQ | EQU ) ^;
    public final SmallCParser.expType_return expType() throws RecognitionException {
        SmallCParser.expType_return retval = new SmallCParser.expType_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set37=null;

        Object set37_tree=null;

        try {
            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:104:12: ( ( GT | LT | GTE | LTE | NEQ | EQU ) ^)
            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:104:14: ( GT | LT | GTE | LTE | NEQ | EQU ) ^
            {
            root_0 = (Object)adaptor.nil();


            set37=(Token)input.LT(1);

            set37=(Token)input.LT(1);

            if ( input.LA(1)==EQU||(input.LA(1) >= GT && input.LA(1) <= GTE)||(input.LA(1) >= LT && input.LA(1) <= LTE)||input.LA(1)==NEQ ) {
                input.consume();
                if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(set37)
                , root_0);
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expType"


    public static class conditional_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "conditional"
    // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:106:1: conditional : ( options {k=1; backtrack=true; } : ELSE stmt )? -> ^( ELSE_TO ^( BODY ( stmt )? ) ) ;
    public final SmallCParser.conditional_return conditional() throws RecognitionException {
        SmallCParser.conditional_return retval = new SmallCParser.conditional_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ELSE38=null;
        SmallCParser.stmt_return stmt39 =null;


        Object ELSE38_tree=null;
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleSubtreeStream stream_stmt=new RewriteRuleSubtreeStream(adaptor,"rule stmt");
        try {
            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:106:13: ( ( options {k=1; backtrack=true; } : ELSE stmt )? -> ^( ELSE_TO ^( BODY ( stmt )? ) ) )
            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:106:15: ( options {k=1; backtrack=true; } : ELSE stmt )?
            {
            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:106:15: ( options {k=1; backtrack=true; } : ELSE stmt )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==ELSE) ) {
                int LA14_1 = input.LA(2);

                if ( (synpred1_SmallC()) ) {
                    alt14=1;
                }
            }
            switch (alt14) {
                case 1 :
                    // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:106:48: ELSE stmt
                    {
                    ELSE38=(Token)match(input,ELSE,FOLLOW_ELSE_in_conditional684); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ELSE.add(ELSE38);


                    pushFollow(FOLLOW_stmt_in_conditional686);
                    stmt39=stmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_stmt.add(stmt39.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: stmt
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 107:11: -> ^( ELSE_TO ^( BODY ( stmt )? ) )
            {
                // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:107:13: ^( ELSE_TO ^( BODY ( stmt )? ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(ELSE_TO, "ELSE_TO")
                , root_1);

                // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:107:23: ^( BODY ( stmt )? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(BODY, "BODY")
                , root_2);

                // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:107:30: ( stmt )?
                if ( stream_stmt.hasNext() ) {
                    adaptor.addChild(root_2, stream_stmt.nextTree());

                }
                stream_stmt.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "conditional"


    public static class exp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "exp"
    // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:109:1: exp : lexp ( expType ^ lexp )? ;
    public final SmallCParser.exp_return exp() throws RecognitionException {
        SmallCParser.exp_return retval = new SmallCParser.exp_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        SmallCParser.lexp_return lexp40 =null;

        SmallCParser.expType_return expType41 =null;

        SmallCParser.lexp_return lexp42 =null;



        try {
            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:109:9: ( lexp ( expType ^ lexp )? )
            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:109:11: lexp ( expType ^ lexp )?
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_lexp_in_exp722);
            lexp40=lexp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, lexp40.getTree());

            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:109:16: ( expType ^ lexp )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==EQU||(LA15_0 >= GT && LA15_0 <= GTE)||(LA15_0 >= LT && LA15_0 <= LTE)||LA15_0==NEQ) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:109:17: expType ^ lexp
                    {
                    pushFollow(FOLLOW_expType_in_exp725);
                    expType41=expType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(expType41.getTree(), root_0);

                    pushFollow(FOLLOW_lexp_in_exp728);
                    lexp42=lexp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, lexp42.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "exp"


    public static class stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stmt"
    // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:111:1: stmt : ( LCUR ! stmtlist RCUR !| WHILE ^ LPAR ! exp RPAR ! stmt | IF LPAR e= exp RPAR s1= stmt c= conditional -> ^( IF_TO $e ^( BODY ( $s1)? ) ( $c)? ) |id= IDENT EQ le= lexp SEMI -> ^( EQ ( $id)? ( $le)? ) | READ ^ LPAR ! IDENT RPAR ! SEMI !| OUTPUT ^ LPAR ! IDENT RPAR ! SEMI !| PRINT ^ LPAR ! STRING RPAR ! SEMI !| RETURN ^ ( lexp )? SEMI !| READC ^ LPAR ! IDENT RPAR ! SEMI !| OUTPUTC ^ LPAR ! IDENT RPAR ! SEMI !| funcall SEMI !);
    public final SmallCParser.stmt_return stmt() throws RecognitionException {
        SmallCParser.stmt_return retval = new SmallCParser.stmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token id=null;
        Token LCUR43=null;
        Token RCUR45=null;
        Token WHILE46=null;
        Token LPAR47=null;
        Token RPAR49=null;
        Token IF51=null;
        Token LPAR52=null;
        Token RPAR53=null;
        Token EQ54=null;
        Token SEMI55=null;
        Token READ56=null;
        Token LPAR57=null;
        Token IDENT58=null;
        Token RPAR59=null;
        Token SEMI60=null;
        Token OUTPUT61=null;
        Token LPAR62=null;
        Token IDENT63=null;
        Token RPAR64=null;
        Token SEMI65=null;
        Token PRINT66=null;
        Token LPAR67=null;
        Token STRING68=null;
        Token RPAR69=null;
        Token SEMI70=null;
        Token RETURN71=null;
        Token SEMI73=null;
        Token READC74=null;
        Token LPAR75=null;
        Token IDENT76=null;
        Token RPAR77=null;
        Token SEMI78=null;
        Token OUTPUTC79=null;
        Token LPAR80=null;
        Token IDENT81=null;
        Token RPAR82=null;
        Token SEMI83=null;
        Token SEMI85=null;
        SmallCParser.exp_return e =null;

        SmallCParser.stmt_return s1 =null;

        SmallCParser.conditional_return c =null;

        SmallCParser.lexp_return le =null;

        SmallCParser.stmtlist_return stmtlist44 =null;

        SmallCParser.exp_return exp48 =null;

        SmallCParser.stmt_return stmt50 =null;

        SmallCParser.lexp_return lexp72 =null;

        SmallCParser.funcall_return funcall84 =null;


        Object id_tree=null;
        Object LCUR43_tree=null;
        Object RCUR45_tree=null;
        Object WHILE46_tree=null;
        Object LPAR47_tree=null;
        Object RPAR49_tree=null;
        Object IF51_tree=null;
        Object LPAR52_tree=null;
        Object RPAR53_tree=null;
        Object EQ54_tree=null;
        Object SEMI55_tree=null;
        Object READ56_tree=null;
        Object LPAR57_tree=null;
        Object IDENT58_tree=null;
        Object RPAR59_tree=null;
        Object SEMI60_tree=null;
        Object OUTPUT61_tree=null;
        Object LPAR62_tree=null;
        Object IDENT63_tree=null;
        Object RPAR64_tree=null;
        Object SEMI65_tree=null;
        Object PRINT66_tree=null;
        Object LPAR67_tree=null;
        Object STRING68_tree=null;
        Object RPAR69_tree=null;
        Object SEMI70_tree=null;
        Object RETURN71_tree=null;
        Object SEMI73_tree=null;
        Object READC74_tree=null;
        Object LPAR75_tree=null;
        Object IDENT76_tree=null;
        Object RPAR77_tree=null;
        Object SEMI78_tree=null;
        Object OUTPUTC79_tree=null;
        Object LPAR80_tree=null;
        Object IDENT81_tree=null;
        Object RPAR82_tree=null;
        Object SEMI83_tree=null;
        Object SEMI85_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_RPAR=new RewriteRuleTokenStream(adaptor,"token RPAR");
        RewriteRuleTokenStream stream_LPAR=new RewriteRuleTokenStream(adaptor,"token LPAR");
        RewriteRuleTokenStream stream_EQ=new RewriteRuleTokenStream(adaptor,"token EQ");
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");
        RewriteRuleSubtreeStream stream_stmt=new RewriteRuleSubtreeStream(adaptor,"rule stmt");
        RewriteRuleSubtreeStream stream_conditional=new RewriteRuleSubtreeStream(adaptor,"rule conditional");
        RewriteRuleSubtreeStream stream_lexp=new RewriteRuleSubtreeStream(adaptor,"rule lexp");
        try {
            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:111:9: ( LCUR ! stmtlist RCUR !| WHILE ^ LPAR ! exp RPAR ! stmt | IF LPAR e= exp RPAR s1= stmt c= conditional -> ^( IF_TO $e ^( BODY ( $s1)? ) ( $c)? ) |id= IDENT EQ le= lexp SEMI -> ^( EQ ( $id)? ( $le)? ) | READ ^ LPAR ! IDENT RPAR ! SEMI !| OUTPUT ^ LPAR ! IDENT RPAR ! SEMI !| PRINT ^ LPAR ! STRING RPAR ! SEMI !| RETURN ^ ( lexp )? SEMI !| READC ^ LPAR ! IDENT RPAR ! SEMI !| OUTPUTC ^ LPAR ! IDENT RPAR ! SEMI !| funcall SEMI !)
            int alt17=11;
            switch ( input.LA(1) ) {
            case LCUR:
                {
                alt17=1;
                }
                break;
            case WHILE:
                {
                alt17=2;
                }
                break;
            case IF:
                {
                alt17=3;
                }
                break;
            case IDENT:
                {
                int LA17_4 = input.LA(2);

                if ( (LA17_4==EQ) ) {
                    alt17=4;
                }
                else if ( (LA17_4==LPAR) ) {
                    alt17=11;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 4, input);

                    throw nvae;

                }
                }
                break;
            case READ:
                {
                alt17=5;
                }
                break;
            case OUTPUT:
                {
                alt17=6;
                }
                break;
            case PRINT:
                {
                alt17=7;
                }
                break;
            case RETURN:
                {
                alt17=8;
                }
                break;
            case READC:
                {
                alt17=9;
                }
                break;
            case OUTPUTC:
                {
                alt17=10;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;

            }

            switch (alt17) {
                case 1 :
                    // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:111:11: LCUR ! stmtlist RCUR !
                    {
                    root_0 = (Object)adaptor.nil();


                    LCUR43=(Token)match(input,LCUR,FOLLOW_LCUR_in_stmt742); if (state.failed) return retval;

                    pushFollow(FOLLOW_stmtlist_in_stmt745);
                    stmtlist44=stmtlist();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmtlist44.getTree());

                    RCUR45=(Token)match(input,RCUR,FOLLOW_RCUR_in_stmt747); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:112:14: WHILE ^ LPAR ! exp RPAR ! stmt
                    {
                    root_0 = (Object)adaptor.nil();


                    WHILE46=(Token)match(input,WHILE,FOLLOW_WHILE_in_stmt764); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    WHILE46_tree = 
                    (Object)adaptor.create(WHILE46)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(WHILE46_tree, root_0);
                    }

                    LPAR47=(Token)match(input,LPAR,FOLLOW_LPAR_in_stmt767); if (state.failed) return retval;

                    pushFollow(FOLLOW_exp_in_stmt770);
                    exp48=exp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, exp48.getTree());

                    RPAR49=(Token)match(input,RPAR,FOLLOW_RPAR_in_stmt772); if (state.failed) return retval;

                    pushFollow(FOLLOW_stmt_in_stmt775);
                    stmt50=stmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmt50.getTree());

                    }
                    break;
                case 3 :
                    // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:115:14: IF LPAR e= exp RPAR s1= stmt c= conditional
                    {
                    IF51=(Token)match(input,IF,FOLLOW_IF_in_stmt814); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IF.add(IF51);


                    LPAR52=(Token)match(input,LPAR,FOLLOW_LPAR_in_stmt816); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAR.add(LPAR52);


                    pushFollow(FOLLOW_exp_in_stmt820);
                    e=exp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_exp.add(e.getTree());

                    RPAR53=(Token)match(input,RPAR,FOLLOW_RPAR_in_stmt822); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAR.add(RPAR53);


                    pushFollow(FOLLOW_stmt_in_stmt826);
                    s1=stmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_stmt.add(s1.getTree());

                    pushFollow(FOLLOW_conditional_in_stmt830);
                    c=conditional();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_conditional.add(c.getTree());

                    // AST REWRITE
                    // elements: s1, e, c
                    // token labels: 
                    // rule labels: retval, e, s1, c
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_e=new RewriteRuleSubtreeStream(adaptor,"rule e",e!=null?e.tree:null);
                    RewriteRuleSubtreeStream stream_s1=new RewriteRuleSubtreeStream(adaptor,"rule s1",s1!=null?s1.tree:null);
                    RewriteRuleSubtreeStream stream_c=new RewriteRuleSubtreeStream(adaptor,"rule c",c!=null?c.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 116:7: -> ^( IF_TO $e ^( BODY ( $s1)? ) ( $c)? )
                    {
                        // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:116:10: ^( IF_TO $e ^( BODY ( $s1)? ) ( $c)? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(IF_TO, "IF_TO")
                        , root_1);

                        adaptor.addChild(root_1, stream_e.nextTree());

                        // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:116:21: ^( BODY ( $s1)? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(BODY, "BODY")
                        , root_2);

                        // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:116:29: ( $s1)?
                        if ( stream_s1.hasNext() ) {
                            adaptor.addChild(root_2, stream_s1.nextTree());

                        }
                        stream_s1.reset();

                        adaptor.addChild(root_1, root_2);
                        }

                        // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:116:35: ( $c)?
                        if ( stream_c.hasNext() ) {
                            adaptor.addChild(root_1, stream_c.nextTree());

                        }
                        stream_c.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 4 :
                    // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:117:14: id= IDENT EQ le= lexp SEMI
                    {
                    id=(Token)match(input,IDENT,FOLLOW_IDENT_in_stmt875); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENT.add(id);


                    EQ54=(Token)match(input,EQ,FOLLOW_EQ_in_stmt877); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EQ.add(EQ54);


                    pushFollow(FOLLOW_lexp_in_stmt881);
                    le=lexp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_lexp.add(le.getTree());

                    SEMI55=(Token)match(input,SEMI,FOLLOW_SEMI_in_stmt883); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI55);


                    // AST REWRITE
                    // elements: le, EQ, id
                    // token labels: id
                    // rule labels: retval, le
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_id=new RewriteRuleTokenStream(adaptor,"token id",id);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_le=new RewriteRuleSubtreeStream(adaptor,"rule le",le!=null?le.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 118:7: -> ^( EQ ( $id)? ( $le)? )
                    {
                        // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:118:10: ^( EQ ( $id)? ( $le)? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_EQ.nextNode()
                        , root_1);

                        // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:118:16: ( $id)?
                        if ( stream_id.hasNext() ) {
                            adaptor.addChild(root_1, stream_id.nextNode());

                        }
                        stream_id.reset();

                        // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:118:21: ( $le)?
                        if ( stream_le.hasNext() ) {
                            adaptor.addChild(root_1, stream_le.nextTree());

                        }
                        stream_le.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 5 :
                    // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:119:14: READ ^ LPAR ! IDENT RPAR ! SEMI !
                    {
                    root_0 = (Object)adaptor.nil();


                    READ56=(Token)match(input,READ,FOLLOW_READ_in_stmt918); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    READ56_tree = 
                    (Object)adaptor.create(READ56)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(READ56_tree, root_0);
                    }

                    LPAR57=(Token)match(input,LPAR,FOLLOW_LPAR_in_stmt921); if (state.failed) return retval;

                    IDENT58=(Token)match(input,IDENT,FOLLOW_IDENT_in_stmt924); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENT58_tree = 
                    (Object)adaptor.create(IDENT58)
                    ;
                    adaptor.addChild(root_0, IDENT58_tree);
                    }

                    RPAR59=(Token)match(input,RPAR,FOLLOW_RPAR_in_stmt926); if (state.failed) return retval;

                    SEMI60=(Token)match(input,SEMI,FOLLOW_SEMI_in_stmt929); if (state.failed) return retval;

                    }
                    break;
                case 6 :
                    // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:120:14: OUTPUT ^ LPAR ! IDENT RPAR ! SEMI !
                    {
                    root_0 = (Object)adaptor.nil();


                    OUTPUT61=(Token)match(input,OUTPUT,FOLLOW_OUTPUT_in_stmt945); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    OUTPUT61_tree = 
                    (Object)adaptor.create(OUTPUT61)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(OUTPUT61_tree, root_0);
                    }

                    LPAR62=(Token)match(input,LPAR,FOLLOW_LPAR_in_stmt948); if (state.failed) return retval;

                    IDENT63=(Token)match(input,IDENT,FOLLOW_IDENT_in_stmt951); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENT63_tree = 
                    (Object)adaptor.create(IDENT63)
                    ;
                    adaptor.addChild(root_0, IDENT63_tree);
                    }

                    RPAR64=(Token)match(input,RPAR,FOLLOW_RPAR_in_stmt953); if (state.failed) return retval;

                    SEMI65=(Token)match(input,SEMI,FOLLOW_SEMI_in_stmt956); if (state.failed) return retval;

                    }
                    break;
                case 7 :
                    // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:121:14: PRINT ^ LPAR ! STRING RPAR ! SEMI !
                    {
                    root_0 = (Object)adaptor.nil();


                    PRINT66=(Token)match(input,PRINT,FOLLOW_PRINT_in_stmt972); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    PRINT66_tree = 
                    (Object)adaptor.create(PRINT66)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(PRINT66_tree, root_0);
                    }

                    LPAR67=(Token)match(input,LPAR,FOLLOW_LPAR_in_stmt975); if (state.failed) return retval;

                    STRING68=(Token)match(input,STRING,FOLLOW_STRING_in_stmt978); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING68_tree = 
                    (Object)adaptor.create(STRING68)
                    ;
                    adaptor.addChild(root_0, STRING68_tree);
                    }

                    RPAR69=(Token)match(input,RPAR,FOLLOW_RPAR_in_stmt980); if (state.failed) return retval;

                    SEMI70=(Token)match(input,SEMI,FOLLOW_SEMI_in_stmt983); if (state.failed) return retval;

                    }
                    break;
                case 8 :
                    // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:122:14: RETURN ^ ( lexp )? SEMI !
                    {
                    root_0 = (Object)adaptor.nil();


                    RETURN71=(Token)match(input,RETURN,FOLLOW_RETURN_in_stmt999); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RETURN71_tree = 
                    (Object)adaptor.create(RETURN71)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(RETURN71_tree, root_0);
                    }

                    // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:122:22: ( lexp )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==CHARACTER||LA16_0==IDENT||LA16_0==LPAR||LA16_0==MIN||LA16_0==NUMBER) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:122:22: lexp
                            {
                            pushFollow(FOLLOW_lexp_in_stmt1002);
                            lexp72=lexp();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, lexp72.getTree());

                            }
                            break;

                    }


                    SEMI73=(Token)match(input,SEMI,FOLLOW_SEMI_in_stmt1005); if (state.failed) return retval;

                    }
                    break;
                case 9 :
                    // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:123:14: READC ^ LPAR ! IDENT RPAR ! SEMI !
                    {
                    root_0 = (Object)adaptor.nil();


                    READC74=(Token)match(input,READC,FOLLOW_READC_in_stmt1021); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    READC74_tree = 
                    (Object)adaptor.create(READC74)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(READC74_tree, root_0);
                    }

                    LPAR75=(Token)match(input,LPAR,FOLLOW_LPAR_in_stmt1024); if (state.failed) return retval;

                    IDENT76=(Token)match(input,IDENT,FOLLOW_IDENT_in_stmt1027); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENT76_tree = 
                    (Object)adaptor.create(IDENT76)
                    ;
                    adaptor.addChild(root_0, IDENT76_tree);
                    }

                    RPAR77=(Token)match(input,RPAR,FOLLOW_RPAR_in_stmt1029); if (state.failed) return retval;

                    SEMI78=(Token)match(input,SEMI,FOLLOW_SEMI_in_stmt1032); if (state.failed) return retval;

                    }
                    break;
                case 10 :
                    // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:124:14: OUTPUTC ^ LPAR ! IDENT RPAR ! SEMI !
                    {
                    root_0 = (Object)adaptor.nil();


                    OUTPUTC79=(Token)match(input,OUTPUTC,FOLLOW_OUTPUTC_in_stmt1048); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    OUTPUTC79_tree = 
                    (Object)adaptor.create(OUTPUTC79)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(OUTPUTC79_tree, root_0);
                    }

                    LPAR80=(Token)match(input,LPAR,FOLLOW_LPAR_in_stmt1051); if (state.failed) return retval;

                    IDENT81=(Token)match(input,IDENT,FOLLOW_IDENT_in_stmt1054); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENT81_tree = 
                    (Object)adaptor.create(IDENT81)
                    ;
                    adaptor.addChild(root_0, IDENT81_tree);
                    }

                    RPAR82=(Token)match(input,RPAR,FOLLOW_RPAR_in_stmt1056); if (state.failed) return retval;

                    SEMI83=(Token)match(input,SEMI,FOLLOW_SEMI_in_stmt1059); if (state.failed) return retval;

                    }
                    break;
                case 11 :
                    // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:125:14: funcall SEMI !
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_funcall_in_stmt1075);
                    funcall84=funcall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, funcall84.getTree());

                    SEMI85=(Token)match(input,SEMI,FOLLOW_SEMI_in_stmt1077); if (state.failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "stmt"

    // $ANTLR start synpred1_SmallC
    public final void synpred1_SmallC_fragment() throws RecognitionException {
        // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:106:48: ( ELSE stmt )
        // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:106:48: ELSE stmt
        {
        match(input,ELSE,FOLLOW_ELSE_in_synpred1_SmallC684); if (state.failed) return ;

        pushFollow(FOLLOW_stmt_in_synpred1_SmallC686);
        stmt();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred1_SmallC

    // Delegated rules

    public final boolean synpred1_SmallC() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_SmallC_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_includes_in_prog42 = new BitSet(new long[]{0x0000000084200080L});
    public static final BitSet FOLLOW_decls_in_prog44 = new BitSet(new long[]{0x0000000084200080L});
    public static final BitSet FOLLOW_procedure_in_prog46 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_main_in_prog48 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INCLUDE_in_includes84 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_STRING_in_includes88 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_typedident_in_decls132 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_SEMI_in_decls134 = new BitSet(new long[]{0x0000000004000082L});
    public static final BitSet FOLLOW_set_in_typedident171 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_IDENT_in_typedident180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_proctype_in_procdef212 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_IDENT_in_procdef216 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_LPAR_in_procdef218 = new BitSet(new long[]{0x0000400004000080L});
    public static final BitSet FOLLOW_args_in_procdef222 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_RPAR_in_procdef224 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_body_in_procdef228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procdef_in_procedure280 = new BitSet(new long[]{0x0000000004200082L});
    public static final BitSet FOLLOW_typedident_in_args321 = new BitSet(new long[]{0x0000000004000282L});
    public static final BitSet FOLLOW_COM_in_args324 = new BitSet(new long[]{0x0000000004000080L});
    public static final BitSet FOLLOW_typedident_in_args327 = new BitSet(new long[]{0x0000000004000282L});
    public static final BitSet FOLLOW_LCUR_in_body344 = new BitSet(new long[]{0x00083CB00C600080L});
    public static final BitSet FOLLOW_decls_in_body348 = new BitSet(new long[]{0x00083CB008600000L});
    public static final BitSet FOLLOW_stmtlist_in_body352 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_RCUR_in_body354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmt_in_stmtlist390 = new BitSet(new long[]{0x000838B008600002L});
    public static final BitSet FOLLOW_MAIN_in_main407 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_LPAR_in_main410 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_RPAR_in_main413 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_body_in_main416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_lexp430 = new BitSet(new long[]{0x0000004100000002L});
    public static final BitSet FOLLOW_set_in_lexp433 = new BitSet(new long[]{0x0000000910200100L});
    public static final BitSet FOLLOW_term_in_lexp442 = new BitSet(new long[]{0x0000004100000002L});
    public static final BitSet FOLLOW_factor_in_term459 = new BitSet(new long[]{0x0001000200040002L});
    public static final BitSet FOLLOW_set_in_term462 = new BitSet(new long[]{0x0000000910200100L});
    public static final BitSet FOLLOW_factor_in_term474 = new BitSet(new long[]{0x0001000200040002L});
    public static final BitSet FOLLOW_LPAR_in_factor491 = new BitSet(new long[]{0x0000000910200100L});
    public static final BitSet FOLLOW_lexp_in_factor494 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_RPAR_in_factor497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MIN_in_factor521 = new BitSet(new long[]{0x0000000800200100L});
    public static final BitSet FOLLOW_set_in_factor524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_in_factor556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_funcall568 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_LPAR_in_funcall570 = new BitSet(new long[]{0x0000400000200000L});
    public static final BitSet FOLLOW_IDENT_in_funcall575 = new BitSet(new long[]{0x0000400000200200L});
    public static final BitSet FOLLOW_COM_in_funcall578 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_IDENT_in_funcall582 = new BitSet(new long[]{0x0000400000200200L});
    public static final BitSet FOLLOW_RPAR_in_funcall588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_expType638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_conditional684 = new BitSet(new long[]{0x000838B008600000L});
    public static final BitSet FOLLOW_stmt_in_conditional686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lexp_in_exp722 = new BitSet(new long[]{0x0000000460188002L});
    public static final BitSet FOLLOW_expType_in_exp725 = new BitSet(new long[]{0x0000000910200100L});
    public static final BitSet FOLLOW_lexp_in_exp728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCUR_in_stmt742 = new BitSet(new long[]{0x00083CB008600000L});
    public static final BitSet FOLLOW_stmtlist_in_stmt745 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_RCUR_in_stmt747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_stmt764 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_LPAR_in_stmt767 = new BitSet(new long[]{0x0000000910200100L});
    public static final BitSet FOLLOW_exp_in_stmt770 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_RPAR_in_stmt772 = new BitSet(new long[]{0x000838B008600000L});
    public static final BitSet FOLLOW_stmt_in_stmt775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_stmt814 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_LPAR_in_stmt816 = new BitSet(new long[]{0x0000000910200100L});
    public static final BitSet FOLLOW_exp_in_stmt820 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_RPAR_in_stmt822 = new BitSet(new long[]{0x000838B008600000L});
    public static final BitSet FOLLOW_stmt_in_stmt826 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_conditional_in_stmt830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_stmt875 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_EQ_in_stmt877 = new BitSet(new long[]{0x0000000910200100L});
    public static final BitSet FOLLOW_lexp_in_stmt881 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_SEMI_in_stmt883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_READ_in_stmt918 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_LPAR_in_stmt921 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_IDENT_in_stmt924 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_RPAR_in_stmt926 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_SEMI_in_stmt929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OUTPUT_in_stmt945 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_LPAR_in_stmt948 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_IDENT_in_stmt951 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_RPAR_in_stmt953 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_SEMI_in_stmt956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRINT_in_stmt972 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_LPAR_in_stmt975 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_STRING_in_stmt978 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_RPAR_in_stmt980 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_SEMI_in_stmt983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_stmt999 = new BitSet(new long[]{0x0000800910200100L});
    public static final BitSet FOLLOW_lexp_in_stmt1002 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_SEMI_in_stmt1005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_READC_in_stmt1021 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_LPAR_in_stmt1024 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_IDENT_in_stmt1027 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_RPAR_in_stmt1029 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_SEMI_in_stmt1032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OUTPUTC_in_stmt1048 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_LPAR_in_stmt1051 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_IDENT_in_stmt1054 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_RPAR_in_stmt1056 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_SEMI_in_stmt1059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_in_stmt1075 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_SEMI_in_stmt1077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_synpred1_SmallC684 = new BitSet(new long[]{0x000838B008600000L});
    public static final BitSet FOLLOW_stmt_in_synpred1_SmallC686 = new BitSet(new long[]{0x0000000000000002L});

}