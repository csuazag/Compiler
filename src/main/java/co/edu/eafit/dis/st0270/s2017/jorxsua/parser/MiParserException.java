package co.edu.eafit.dis.st0270.s2017.jorxsua.parser;

import co.edu.eafit.dis.st0270.s2017.jorxsua.tokens.Token;

public class MiParserException extends Exception {

	public static final long serialVersionUID = 4487924411002636L;

	public MiParserException(String cause, Token tok) {
		super(cause + " en " + tok);
		//System.out.println(cause + " en " + tok);
		
	}
}
