package co.edu.eafit.dis.st0270.s2017.jorxsua.tokens;

public class EndOfFile extends Token {

    public EndOfFile() {
		super(-1,-1);
    }

    public boolean equals(Object obj) {
		boolean ret = false;
		if (obj instanceof EndOfFile) {
			return true;
		}
		return ret;
    }
}