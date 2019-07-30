package co.edu.eafit.dis.st0270.s2017.jorxsua.tokens;

public class KeyEntonces extends Keywords {

    public KeyEntonces() {
	    super("ent", -1,-1);
    }

    public KeyEntonces(int linea, int column) {
	    super("ent", linea, column);
    }
    
    public boolean equals(Object obj) {
	    boolean ret = false;
	    if (obj instanceof KeyEntonces) {
	       return true;
	    }
	    return ret;
    }
    
}