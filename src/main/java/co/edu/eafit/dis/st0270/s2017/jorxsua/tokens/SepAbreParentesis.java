package co.edu.eafit.dis.st0270.s2017.jorxsua.tokens;

public class SepAbreParentesis extends Separador {

    public SepAbreParentesis() {
	    super("(", -1,-1);
    }

    public SepAbreParentesis(int linea, int column) {
	    super("(", linea, column);
    }
    
    public boolean equals(Object obj) {
	    boolean ret = false;
	    if (obj instanceof SepAbreParentesis) {
	       return true;
	    }
	    return ret;
    }

}