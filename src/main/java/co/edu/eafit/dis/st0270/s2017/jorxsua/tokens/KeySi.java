package co.edu.eafit.dis.st0270.s2017.jorxsua.tokens;

public class KeySi extends Keywords {

    public KeySi() {
	    super("si", -1,-1);
    }

    public KeySi(int linea, int column) {
	    super("si", linea, column);
    }
    
    public boolean equals(Object obj) {
	    boolean ret = false;
	    if (obj instanceof KeySi) {
	       return true;
	    }
	    return ret;
    }

}