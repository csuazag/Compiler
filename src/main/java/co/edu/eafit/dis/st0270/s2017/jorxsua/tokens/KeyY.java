package co.edu.eafit.dis.st0270.s2017.jorxsua.tokens;

public class KeyY extends Keywords {

    public KeyY() {
	    super("y", -1,-1);
    }

    public KeyY(int linea, int column) {
	    super("y", linea, column);
    }
    
    public boolean equals(Object obj) {
	    boolean ret = false;
	    if (obj instanceof KeyY) {
	       return true;
	    }
	    return ret;
    }

}