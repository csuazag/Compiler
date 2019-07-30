package co.edu.eafit.dis.st0270.s2017.jorxsua.main;

import co.edu.eafit.dis.st0270.s2017.jorxsua.parser.GrammarALexer;  //El Lexer de  la gramatica de Antlr generado automaticamente.
import co.edu.eafit.dis.st0270.s2017.jorxsua.parser.GrammarAParser; //El parser de la gramatica de Antlr generado automaticamente.
import co.edu.eafit.dis.st0270.s2017.jorxsua.parser.MiParserException;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.BaseErrorListener;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.BitSet;


public class Auto {

   static boolean errorParser = false;
   static boolean errorLexer = false;
   static RecognitionException exceptionParser = null;
   static RecognitionException exceptionLexer  = null;
    
   static class AutoAntlrErrorListener
      extends BaseErrorListener {
      public void syntaxError(Recognizer<?,?> recognizer,
                              Object offendingSymbol,
                              int line, int charPositionInLine,
                              String msg,
                              RecognitionException e)
      {
         Auto.errorParser = true;
         Auto.exceptionParser = e;
      }
   }

   static class LexerExprAntlrErrorListener
      extends BaseErrorListener {
      public void syntaxError(Recognizer<?,?> recognizer,
                              Object offendingSymbol,
                              int line, int charPositionInLine,
                              String msg,
                              RecognitionException e)
      {
         Auto.errorLexer = true;
         Auto.exceptionLexer = e;
      }
   }

	public Auto(String fich){
		arrancar(fich);
	}

	
	public static void arrancar(String fich) {

		InputStream is = System.in;
		
		try {

			if (fich != null) is = new FileInputStream(fich);
		
			ANTLRInputStream input = new ANTLRInputStream(is);				
			GrammarALexer lexer = new GrammarALexer(input);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			GrammarAParser parser = new GrammarAParser(tokens);

			parser.removeErrorListeners();
			parser.addErrorListener(new AutoAntlrErrorListener());

			ParseTree tree = parser.grammanrec();
		         if (errorLexer || errorParser) {
            System.out.println("Invalid expression");
			errorLexer = false;
			errorParser = false;
         }
         else {
	    System.out.println("Valid expression");
         }

		} catch (RecognitionException re) {

			System.err.println("Invalid expression line: " + re.getOffendingToken().getLine() +
					" col: " + re.getOffendingToken().getCharPositionInLine() +
					" type: " + re.getOffendingToken().getType()); 
			//System.exit(1);
		} catch (Exception e) {

			System.err.println("Exception class: " + e.getClass().toString());
			PrintWriter errWriter = new PrintWriter(System.err);
			e.printStackTrace(errWriter);
			//System.exit(1);
		}
    }    
    

    


		
}

