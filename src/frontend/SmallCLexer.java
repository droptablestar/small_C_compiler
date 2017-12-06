// $ANTLR 3.4 /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g 2012-02-17 11:40:00
package frontend;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class SmallCLexer extends Lexer {
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
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public SmallCLexer() {} 
    public SmallCLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public SmallCLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "/afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g"; }

    // $ANTLR start "MOD"
    public final void mMOD() throws RecognitionException {
        try {
            int _type = MOD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:129:9: ( '%' )
            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:129:13: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MOD"

    // $ANTLR start "FORW"
    public final void mFORW() throws RecognitionException {
        try {
            int _type = FORW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:130:9: ( '/' )
            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:130:13: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FORW"

    // $ANTLR start "COM"
    public final void mCOM() throws RecognitionException {
        try {
            int _type = COM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:131:9: ( ',' )
            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:131:13: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COM"

    // $ANTLR start "STAR"
    public final void mSTAR() throws RecognitionException {
        try {
            int _type = STAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:132:9: ( '*' )
            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:132:13: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STAR"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:133:9: ( '+' )
            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:133:13: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "MIN"
    public final void mMIN() throws RecognitionException {
        try {
            int _type = MIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:134:9: ( '-' )
            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:134:13: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MIN"

    // $ANTLR start "GT"
    public final void mGT() throws RecognitionException {
        try {
            int _type = GT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:135:9: ( '>' )
            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:135:13: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GT"

    // $ANTLR start "LT"
    public final void mLT() throws RecognitionException {
        try {
            int _type = LT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:136:9: ( '<' )
            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:136:13: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LT"

    // $ANTLR start "LTE"
    public final void mLTE() throws RecognitionException {
        try {
            int _type = LTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:137:9: ( '<=' )
            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:137:13: '<='
            {
            match("<="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LTE"

    // $ANTLR start "GTE"
    public final void mGTE() throws RecognitionException {
        try {
            int _type = GTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:138:9: ( '>=' )
            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:138:13: '>='
            {
            match(">="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GTE"

    // $ANTLR start "EQ"
    public final void mEQ() throws RecognitionException {
        try {
            int _type = EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:139:9: ( '=' )
            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:139:13: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EQ"

    // $ANTLR start "NEQ"
    public final void mNEQ() throws RecognitionException {
        try {
            int _type = NEQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:140:9: ( '!=' )
            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:140:13: '!='
            {
            match("!="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NEQ"

    // $ANTLR start "EQU"
    public final void mEQU() throws RecognitionException {
        try {
            int _type = EQU;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:141:9: ( '==' )
            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:141:13: '=='
            {
            match("=="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EQU"

    // $ANTLR start "RCUR"
    public final void mRCUR() throws RecognitionException {
        try {
            int _type = RCUR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:142:9: ( '}' )
            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:142:13: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RCUR"

    // $ANTLR start "LCUR"
    public final void mLCUR() throws RecognitionException {
        try {
            int _type = LCUR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:143:9: ( '{' )
            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:143:13: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LCUR"

    // $ANTLR start "RPAR"
    public final void mRPAR() throws RecognitionException {
        try {
            int _type = RPAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:144:9: ( ')' )
            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:144:13: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RPAR"

    // $ANTLR start "LPAR"
    public final void mLPAR() throws RecognitionException {
        try {
            int _type = LPAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:145:9: ( '(' )
            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:145:13: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LPAR"

    // $ANTLR start "SEMI"
    public final void mSEMI() throws RecognitionException {
        try {
            int _type = SEMI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:146:9: ( ';' )
            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:146:13: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SEMI"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:149:6: ( 'int' )
            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:149:9: 'int'
            {
            match("int"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "CHAR"
    public final void mCHAR() throws RecognitionException {
        try {
            int _type = CHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:150:6: ( 'char' )
            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:150:8: 'char'
            {
            match("char"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CHAR"

    // $ANTLR start "INCLUDE"
    public final void mINCLUDE() throws RecognitionException {
        try {
            int _type = INCLUDE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:153:9: ( '#include' )
            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:153:13: '#include'
            {
            match("#include"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INCLUDE"

    // $ANTLR start "WHILE"
    public final void mWHILE() throws RecognitionException {
        try {
            int _type = WHILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:154:7: ( 'while' )
            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:154:11: 'while'
            {
            match("while"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WHILE"

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:155:7: ( 'if' )
            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:155:11: 'if'
            {
            match("if"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IF"

    // $ANTLR start "ELSE"
    public final void mELSE() throws RecognitionException {
        try {
            int _type = ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:156:7: ( 'else' )
            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:156:11: 'else'
            {
            match("else"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ELSE"

    // $ANTLR start "READ"
    public final void mREAD() throws RecognitionException {
        try {
            int _type = READ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:157:6: ( 'read' )
            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:157:10: 'read'
            {
            match("read"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "READ"

    // $ANTLR start "OUTPUT"
    public final void mOUTPUT() throws RecognitionException {
        try {
            int _type = OUTPUT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:158:9: ( 'output' )
            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:158:13: 'output'
            {
            match("output"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OUTPUT"

    // $ANTLR start "PRINT"
    public final void mPRINT() throws RecognitionException {
        try {
            int _type = PRINT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:159:9: ( 'print' )
            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:159:13: 'print'
            {
            match("print"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PRINT"

    // $ANTLR start "RETURN"
    public final void mRETURN() throws RecognitionException {
        try {
            int _type = RETURN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:160:9: ( 'return' )
            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:160:13: 'return'
            {
            match("return"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RETURN"

    // $ANTLR start "READC"
    public final void mREADC() throws RecognitionException {
        try {
            int _type = READC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:161:9: ( 'readc' )
            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:161:13: 'readc'
            {
            match("readc"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "READC"

    // $ANTLR start "OUTPUTC"
    public final void mOUTPUTC() throws RecognitionException {
        try {
            int _type = OUTPUTC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:162:9: ( 'outputc' )
            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:162:13: 'outputc'
            {
            match("outputc"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OUTPUTC"

    // $ANTLR start "MAIN"
    public final void mMAIN() throws RecognitionException {
        try {
            int _type = MAIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:163:9: ( 'main' )
            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:163:13: 'main'
            {
            match("main"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MAIN"

    // $ANTLR start "PROGRAM"
    public final void mPROGRAM() throws RecognitionException {
        try {
            int _type = PROGRAM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:166:9: ( 'PROGRAM' )
            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:166:13: 'PROGRAM'
            {
            match("PROGRAM"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PROGRAM"

    // $ANTLR start "INCL"
    public final void mINCL() throws RecognitionException {
        try {
            int _type = INCL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:167:9: ( 'INCLUDES' )
            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:167:13: 'INCLUDES'
            {
            match("INCLUDES"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INCL"

    // $ANTLR start "IF_TO"
    public final void mIF_TO() throws RecognitionException {
        try {
            int _type = IF_TO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:168:9: ( 'IF' )
            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:168:13: 'IF'
            {
            match("IF"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IF_TO"

    // $ANTLR start "ELSE_TO"
    public final void mELSE_TO() throws RecognitionException {
        try {
            int _type = ELSE_TO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:169:9: ( 'ELSE' )
            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:169:13: 'ELSE'
            {
            match("ELSE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ELSE_TO"

    // $ANTLR start "DECL"
    public final void mDECL() throws RecognitionException {
        try {
            int _type = DECL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:170:6: ( 'DECL' )
            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:170:8: 'DECL'
            {
            match("DECL"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DECL"

    // $ANTLR start "PROC"
    public final void mPROC() throws RecognitionException {
        try {
            int _type = PROC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:171:6: ( 'PROC' )
            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:171:8: 'PROC'
            {
            match("PROC"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PROC"

    // $ANTLR start "ARGS"
    public final void mARGS() throws RecognitionException {
        try {
            int _type = ARGS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:172:6: ( 'ARGS' )
            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:172:8: 'ARGS'
            {
            match("ARGS"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ARGS"

    // $ANTLR start "TYPE"
    public final void mTYPE() throws RecognitionException {
        try {
            int _type = TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:173:6: ( 'TYPE' )
            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:173:8: 'TYPE'
            {
            match("TYPE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TYPE"

    // $ANTLR start "BODY"
    public final void mBODY() throws RecognitionException {
        try {
            int _type = BODY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:174:6: ( 'BODY' )
            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:174:8: 'BODY'
            {
            match("BODY"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BODY"

    // $ANTLR start "EXP"
    public final void mEXP() throws RecognitionException {
        try {
            int _type = EXP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:175:6: ( 'EXP' )
            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:175:8: 'EXP'
            {
            match("EXP"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EXP"

    // $ANTLR start "CALL"
    public final void mCALL() throws RecognitionException {
        try {
            int _type = CALL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:176:6: ( 'CALL' )
            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:176:8: 'CALL'
            {
            match("CALL"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CALL"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:178:9: ( ( ' ' | '\\r' | '\\t' | '\\u000C' | '\\n' ) )
            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:178:14: ( ' ' | '\\r' | '\\t' | '\\u000C' | '\\n' )
            {
            if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||(input.LA(1) >= '\f' && input.LA(1) <= '\r')||input.LA(1)==' ' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "NUMBER"
    public final void mNUMBER() throws RecognitionException {
        try {
            int _type = NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:179:12: ( ( '0' .. '9' )+ )
            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:179:14: ( '0' .. '9' )+
            {
            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:179:14: ( '0' .. '9' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '0' && LA1_0 <= '9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NUMBER"

    // $ANTLR start "IDENT"
    public final void mIDENT() throws RecognitionException {
        try {
            int _type = IDENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:180:10: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:180:12: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:180:32: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= '0' && LA2_0 <= '9')||(LA2_0 >= 'A' && LA2_0 <= 'Z')||LA2_0=='_'||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IDENT"

    // $ANTLR start "CHARACTER"
    public final void mCHARACTER() throws RecognitionException {
        try {
            int _type = CHARACTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:181:12: ( ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '[' | ']' | '\\\\' | ';' | '\\'' | ',' | '.' | '/' | '-' | '=' | '\\t' | '\\n' | '`' | ' ' | '!' | '@' | '#' | '$' | '%' | '^' | '&' | '*' | '(' | ')' | '_' | '+' ) )
            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:
            {
            if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||(input.LA(1) >= ' ' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '9')||input.LA(1)==';'||input.LA(1)=='='||(input.LA(1) >= '@' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CHARACTER"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:182:11: ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"' )
            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:182:14: '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); 

            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:182:18: ( ESC_SEQ |~ ( '\\\\' | '\"' ) )*
            loop3:
            do {
                int alt3=3;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='\\') ) {
                    alt3=1;
                }
                else if ( ((LA3_0 >= '\u0000' && LA3_0 <= '!')||(LA3_0 >= '#' && LA3_0 <= '[')||(LA3_0 >= ']' && LA3_0 <= '\uFFFF')) ) {
                    alt3=2;
                }


                switch (alt3) {
            	case 1 :
            	    // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:182:20: ESC_SEQ
            	    {
            	    mESC_SEQ(); 


            	    }
            	    break;
            	case 2 :
            	    // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:182:30: ~ ( '\\\\' | '\"' )
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "ESC_SEQ"
    public final void mESC_SEQ() throws RecognitionException {
        try {
            int _type = ESC_SEQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:183:12: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) )
            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:183:16: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
            {
            match('\\'); 

            if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ESC_SEQ"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:184:12: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:184:16: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
            {
            match("//"); 



            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:184:21: (~ ( '\\n' | '\\r' ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0 >= '\u0000' && LA4_0 <= '\t')||(LA4_0 >= '\u000B' && LA4_0 <= '\f')||(LA4_0 >= '\u000E' && LA4_0 <= '\uFFFF')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:184:35: ( '\\r' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='\r') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:184:35: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }


            match('\n'); 

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMENT"

    public void mTokens() throws RecognitionException {
        // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:1:8: ( MOD | FORW | COM | STAR | PLUS | MIN | GT | LT | LTE | GTE | EQ | NEQ | EQU | RCUR | LCUR | RPAR | LPAR | SEMI | INT | CHAR | INCLUDE | WHILE | IF | ELSE | READ | OUTPUT | PRINT | RETURN | READC | OUTPUTC | MAIN | PROGRAM | INCL | IF_TO | ELSE_TO | DECL | PROC | ARGS | TYPE | BODY | EXP | CALL | WS | NUMBER | IDENT | CHARACTER | STRING | ESC_SEQ | COMMENT )
        int alt6=49;
        alt6 = dfa6.predict(input);
        switch (alt6) {
            case 1 :
                // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:1:10: MOD
                {
                mMOD(); 


                }
                break;
            case 2 :
                // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:1:14: FORW
                {
                mFORW(); 


                }
                break;
            case 3 :
                // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:1:19: COM
                {
                mCOM(); 


                }
                break;
            case 4 :
                // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:1:23: STAR
                {
                mSTAR(); 


                }
                break;
            case 5 :
                // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:1:28: PLUS
                {
                mPLUS(); 


                }
                break;
            case 6 :
                // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:1:33: MIN
                {
                mMIN(); 


                }
                break;
            case 7 :
                // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:1:37: GT
                {
                mGT(); 


                }
                break;
            case 8 :
                // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:1:40: LT
                {
                mLT(); 


                }
                break;
            case 9 :
                // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:1:43: LTE
                {
                mLTE(); 


                }
                break;
            case 10 :
                // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:1:47: GTE
                {
                mGTE(); 


                }
                break;
            case 11 :
                // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:1:51: EQ
                {
                mEQ(); 


                }
                break;
            case 12 :
                // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:1:54: NEQ
                {
                mNEQ(); 


                }
                break;
            case 13 :
                // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:1:58: EQU
                {
                mEQU(); 


                }
                break;
            case 14 :
                // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:1:62: RCUR
                {
                mRCUR(); 


                }
                break;
            case 15 :
                // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:1:67: LCUR
                {
                mLCUR(); 


                }
                break;
            case 16 :
                // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:1:72: RPAR
                {
                mRPAR(); 


                }
                break;
            case 17 :
                // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:1:77: LPAR
                {
                mLPAR(); 


                }
                break;
            case 18 :
                // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:1:82: SEMI
                {
                mSEMI(); 


                }
                break;
            case 19 :
                // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:1:87: INT
                {
                mINT(); 


                }
                break;
            case 20 :
                // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:1:91: CHAR
                {
                mCHAR(); 


                }
                break;
            case 21 :
                // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:1:96: INCLUDE
                {
                mINCLUDE(); 


                }
                break;
            case 22 :
                // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:1:104: WHILE
                {
                mWHILE(); 


                }
                break;
            case 23 :
                // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:1:110: IF
                {
                mIF(); 


                }
                break;
            case 24 :
                // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:1:113: ELSE
                {
                mELSE(); 


                }
                break;
            case 25 :
                // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:1:118: READ
                {
                mREAD(); 


                }
                break;
            case 26 :
                // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:1:123: OUTPUT
                {
                mOUTPUT(); 


                }
                break;
            case 27 :
                // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:1:130: PRINT
                {
                mPRINT(); 


                }
                break;
            case 28 :
                // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:1:136: RETURN
                {
                mRETURN(); 


                }
                break;
            case 29 :
                // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:1:143: READC
                {
                mREADC(); 


                }
                break;
            case 30 :
                // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:1:149: OUTPUTC
                {
                mOUTPUTC(); 


                }
                break;
            case 31 :
                // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:1:157: MAIN
                {
                mMAIN(); 


                }
                break;
            case 32 :
                // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:1:162: PROGRAM
                {
                mPROGRAM(); 


                }
                break;
            case 33 :
                // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:1:170: INCL
                {
                mINCL(); 


                }
                break;
            case 34 :
                // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:1:175: IF_TO
                {
                mIF_TO(); 


                }
                break;
            case 35 :
                // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:1:181: ELSE_TO
                {
                mELSE_TO(); 


                }
                break;
            case 36 :
                // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:1:189: DECL
                {
                mDECL(); 


                }
                break;
            case 37 :
                // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:1:194: PROC
                {
                mPROC(); 


                }
                break;
            case 38 :
                // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:1:199: ARGS
                {
                mARGS(); 


                }
                break;
            case 39 :
                // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:1:204: TYPE
                {
                mTYPE(); 


                }
                break;
            case 40 :
                // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:1:209: BODY
                {
                mBODY(); 


                }
                break;
            case 41 :
                // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:1:214: EXP
                {
                mEXP(); 


                }
                break;
            case 42 :
                // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:1:218: CALL
                {
                mCALL(); 


                }
                break;
            case 43 :
                // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:1:223: WS
                {
                mWS(); 


                }
                break;
            case 44 :
                // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:1:226: NUMBER
                {
                mNUMBER(); 


                }
                break;
            case 45 :
                // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:1:233: IDENT
                {
                mIDENT(); 


                }
                break;
            case 46 :
                // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:1:239: CHARACTER
                {
                mCHARACTER(); 


                }
                break;
            case 47 :
                // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:1:249: STRING
                {
                mSTRING(); 


                }
                break;
            case 48 :
                // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:1:256: ESC_SEQ
                {
                mESC_SEQ(); 


                }
                break;
            case 49 :
                // /afs/inf.ed.ac.uk/user/s11/s1129936/Documents/compiler_reese/src/frontend/SmallC.g:1:264: COMMENT
                {
                mCOMMENT(); 


                }
                break;

        }

    }


    protected DFA6 dfa6 = new DFA6(this);
    static final String DFA6_eotS =
        "\2\uffff\1\52\4\uffff\1\60\1\62\1\64\1\47\5\uffff\2\73\1\47\16\73"+
        "\4\uffff\1\47\23\uffff\1\73\1\121\1\uffff\1\73\1\uffff\10\73\1\134"+
        "\7\73\2\uffff\1\144\1\uffff\12\73\1\uffff\1\73\1\161\5\73\1\uffff"+
        "\1\167\1\73\1\171\1\173\3\73\1\177\1\73\1\u0081\1\73\1\u0083\1\uffff"+
        "\1\u0084\1\u0085\1\u0086\1\u0087\1\u0088\1\uffff\1\u0089\1\uffff"+
        "\1\u008a\1\uffff\2\73\1\u008d\1\uffff\1\73\1\uffff\1\73\10\uffff"+
        "\1\u0090\1\u0092\1\uffff\2\73\1\uffff\1\u0095\1\uffff\1\u0096\1"+
        "\73\2\uffff\1\u0098\1\uffff";
    static final String DFA6_eofS =
        "\u0099\uffff";
    static final String DFA6_minS =
        "\1\11\1\uffff\1\57\4\uffff\4\75\5\uffff\1\146\1\150\1\151\1\150"+
        "\1\154\1\145\1\165\1\162\1\141\1\122\1\106\1\114\1\105\1\122\1\131"+
        "\1\117\1\101\4\uffff\1\42\23\uffff\1\164\1\60\1\uffff\1\141\1\uffff"+
        "\1\151\1\163\1\141\1\164\2\151\1\117\1\103\1\60\1\123\1\120\1\103"+
        "\1\107\1\120\1\104\1\114\2\uffff\1\60\1\uffff\1\162\1\154\1\145"+
        "\1\144\1\165\1\160\2\156\1\103\1\114\1\uffff\1\105\1\60\1\114\1"+
        "\123\1\105\1\131\1\114\1\uffff\1\60\1\145\2\60\1\162\1\165\1\164"+
        "\1\60\1\122\1\60\1\125\1\60\1\uffff\5\60\1\uffff\1\60\1\uffff\1"+
        "\60\1\uffff\1\156\1\164\1\60\1\uffff\1\101\1\uffff\1\104\10\uffff"+
        "\2\60\1\uffff\1\115\1\105\1\uffff\1\60\1\uffff\1\60\1\123\2\uffff"+
        "\1\60\1\uffff";
    static final String DFA6_maxS =
        "\1\175\1\uffff\1\57\4\uffff\4\75\5\uffff\1\156\1\150\1\151\1\150"+
        "\1\154\1\145\1\165\1\162\1\141\1\122\1\116\1\130\1\105\1\122\1\131"+
        "\1\117\1\101\4\uffff\1\164\23\uffff\1\164\1\172\1\uffff\1\141\1"+
        "\uffff\1\151\1\163\2\164\2\151\1\117\1\103\1\172\1\123\1\120\1\103"+
        "\1\107\1\120\1\104\1\114\2\uffff\1\172\1\uffff\1\162\1\154\1\145"+
        "\1\144\1\165\1\160\2\156\1\107\1\114\1\uffff\1\105\1\172\1\114\1"+
        "\123\1\105\1\131\1\114\1\uffff\1\172\1\145\2\172\1\162\1\165\1\164"+
        "\1\172\1\122\1\172\1\125\1\172\1\uffff\5\172\1\uffff\1\172\1\uffff"+
        "\1\172\1\uffff\1\156\1\164\1\172\1\uffff\1\101\1\uffff\1\104\10"+
        "\uffff\2\172\1\uffff\1\115\1\105\1\uffff\1\172\1\uffff\1\172\1\123"+
        "\2\uffff\1\172\1\uffff";
    static final String DFA6_acceptS =
        "\1\uffff\1\1\1\uffff\1\3\1\4\1\5\1\6\4\uffff\1\16\1\17\1\20\1\21"+
        "\1\22\21\uffff\1\53\1\54\1\55\1\53\1\uffff\1\57\1\56\1\1\1\61\1"+
        "\2\1\3\1\4\1\5\1\6\1\12\1\7\1\11\1\10\1\15\1\13\1\14\1\20\1\21\1"+
        "\22\2\uffff\1\55\1\uffff\1\25\20\uffff\1\54\1\60\1\uffff\1\27\12"+
        "\uffff\1\42\7\uffff\1\23\14\uffff\1\51\5\uffff\1\24\1\uffff\1\30"+
        "\1\uffff\1\31\3\uffff\1\37\1\uffff\1\45\1\uffff\1\43\1\44\1\46\1"+
        "\47\1\50\1\52\1\26\1\35\2\uffff\1\33\2\uffff\1\34\1\uffff\1\32\2"+
        "\uffff\1\36\1\40\1\uffff\1\41";
    static final String DFA6_specialS =
        "\u0099\uffff}>";
    static final String[] DFA6_transitionS = {
            "\2\41\1\uffff\2\44\22\uffff\1\41\1\12\1\46\1\22\1\47\1\1\2\47"+
            "\1\16\1\15\1\4\1\5\1\3\1\6\1\47\1\2\12\42\1\uffff\1\17\1\10"+
            "\1\11\1\7\1\uffff\1\47\1\35\1\37\1\40\1\34\1\33\3\43\1\32\6"+
            "\43\1\31\3\43\1\36\6\43\1\47\1\45\4\47\2\43\1\21\1\43\1\24\3"+
            "\43\1\20\3\43\1\30\1\43\1\26\1\27\1\43\1\25\4\43\1\23\3\43\1"+
            "\14\1\uffff\1\13",
            "",
            "\1\51",
            "",
            "",
            "",
            "",
            "\1\57",
            "\1\61",
            "\1\63",
            "\1\65",
            "",
            "",
            "",
            "",
            "",
            "\1\72\7\uffff\1\71",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\106\7\uffff\1\105",
            "\1\107\13\uffff\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "",
            "",
            "",
            "",
            "\1\117\4\uffff\1\117\64\uffff\1\117\5\uffff\1\117\3\uffff\1"+
            "\117\7\uffff\1\117\3\uffff\1\117\1\uffff\1\117",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\120",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "",
            "\1\122",
            "",
            "\1\123",
            "\1\124",
            "\1\125\22\uffff\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "",
            "",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\156\3\uffff\1\155",
            "\1\157",
            "",
            "\1\160",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\170",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\2\73\1\172\27\73",
            "\1\174",
            "\1\175",
            "\1\176",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u0080",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u0082",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "",
            "\1\u008b",
            "\1\u008c",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "",
            "\1\u008e",
            "",
            "\1\u008f",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\2\73\1\u0091\27\73",
            "",
            "\1\u0093",
            "\1\u0094",
            "",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u0097",
            "",
            "",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            ""
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( MOD | FORW | COM | STAR | PLUS | MIN | GT | LT | LTE | GTE | EQ | NEQ | EQU | RCUR | LCUR | RPAR | LPAR | SEMI | INT | CHAR | INCLUDE | WHILE | IF | ELSE | READ | OUTPUT | PRINT | RETURN | READC | OUTPUTC | MAIN | PROGRAM | INCL | IF_TO | ELSE_TO | DECL | PROC | ARGS | TYPE | BODY | EXP | CALL | WS | NUMBER | IDENT | CHARACTER | STRING | ESC_SEQ | COMMENT );";
        }
    }
 

}