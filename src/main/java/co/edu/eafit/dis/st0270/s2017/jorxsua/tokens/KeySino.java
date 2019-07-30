package co.edu.eafit.dis.st0270.s2017.jorxsua.tokens;

public class KeySino extends Keywords {

    public KeySino() {
	    super("sino", -1,-1);
    }

    public KeySino(int linea, int column) {
	    super("sino", linea, column);
    }
    
    public boolean equals(Object obj) {
	    boolean ret = false;
	    if (obj instanceof KeySino) {
	       return true;
	    }
	    return ret;
    }

}