package co.edu.eafit.dis.st0270.s2017.jorxsua.tokens;

public class KeyClase extends Keywords {

    public KeyClase() {
	    super("clase", -1,-1);
    }

    public KeyClase(int linea, int column) {
	    super("clase", linea, column);
    }
    
    public boolean equals(Object obj) {
	    boolean ret = false;
	    if (obj instanceof KeyClase) {
	       return true;
	    }
	    return ret;
    }
}