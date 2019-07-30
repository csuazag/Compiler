package co.edu.eafit.dis.st0270.s2017.jorxsua.tokens;

public class KeyFinsi extends Keywords {

    public KeyFinsi() {
	    super("finsi", -1,-1);
    }

    public KeyFinsi(int linea, int column) {
	    super("finsi", linea, column);
    }
    
    public boolean equals(Object obj) {
	    boolean ret = false;
	    if (obj instanceof KeyFinsi) {
	       return true;
	    }
	    return ret;
    }

}