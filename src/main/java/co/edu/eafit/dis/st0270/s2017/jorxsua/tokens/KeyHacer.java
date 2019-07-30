package co.edu.eafit.dis.st0270.s2017.jorxsua.tokens;

public class KeyHacer extends Keywords {

    public KeyHacer() {
	    super("hacer", -1,-1);
    }

    public KeyHacer(int linea, int column) {
	    super("hacer", linea, column);
    }
    
    public boolean equals(Object obj) {
	    boolean ret = false;
	    if (obj instanceof KeyHacer) {
	       return true;
	    }
	    return ret;
    }
}