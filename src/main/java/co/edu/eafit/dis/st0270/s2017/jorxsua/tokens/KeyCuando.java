package co.edu.eafit.dis.st0270.s2017.jorxsua.tokens;

public class KeyCuando extends Keywords {

    public KeyCuando() {
	    super("cuando", -1,-1);
    }

    public KeyCuando(int linea, int column) {
	    super("cuando", linea, column);
    }
    
    public boolean equals(Object obj) {
	    boolean ret = false;
	    if (obj instanceof KeyCuando) {
	       return true;
	    }
	    return ret;
    }
}