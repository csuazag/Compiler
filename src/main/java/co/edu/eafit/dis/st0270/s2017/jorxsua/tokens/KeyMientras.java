package co.edu.eafit.dis.st0270.s2017.jorxsua.tokens;

public class KeyMientras extends Keywords {

    public KeyMientras() {
	    super("mientras", -1,-1);
    }

    public KeyMientras(int linea, int column) {
	    super("mientras", linea, column);
    }
    
    public boolean equals(Object obj) {
	    boolean ret = false;
	    if (obj instanceof KeyMientras) {
	       return true;
	    }
	    return ret;
    }

}