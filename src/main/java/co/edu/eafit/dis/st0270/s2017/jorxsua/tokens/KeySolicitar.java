package co.edu.eafit.dis.st0270.s2017.jorxsua.tokens;

public class KeySolicitar extends Keywords {

    public KeySolicitar() {
	    super("solicitar", -1,-1);
    }

    public KeySolicitar(int linea, int column) {
	    super("solicitar", linea, column);
    }
    
    public boolean equals(Object obj) {
	    boolean ret = false;
	    if (obj instanceof KeySolicitar) {
	       return true;
	    }
	    return ret;
    }
}