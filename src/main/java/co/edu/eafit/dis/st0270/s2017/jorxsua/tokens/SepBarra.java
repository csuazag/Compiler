package co.edu.eafit.dis.st0270.s2017.jorxsua.tokens;

public class SepBarra extends Separador {

    public SepBarra() {
	    super("|", -1,-1);
    }

    public SepBarra(int linea, int column) {
	    super("|", linea, column);
    }
    
    public boolean equals(Object obj) {
	    boolean ret = false;
	    if (obj instanceof SepBarra) {
	       return true;
	    }
	    return ret;
    }
}