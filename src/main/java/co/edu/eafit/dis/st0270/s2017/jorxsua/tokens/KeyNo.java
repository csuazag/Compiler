package co.edu.eafit.dis.st0270.s2017.jorxsua.tokens;

public class KeyNo extends Keywords {

    public KeyNo() {
	    super("no", -1,-1);
    }

    public KeyNo(int linea, int column) {
	    super("no", linea, column);
    }
    
    public boolean equals(Object obj) {
	    boolean ret = false;
	    if (obj instanceof KeyNo) {
	       return true;
	    }
	    return ret;
    }

}