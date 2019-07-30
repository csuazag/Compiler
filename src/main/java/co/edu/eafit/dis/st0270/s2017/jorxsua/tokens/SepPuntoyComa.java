package co.edu.eafit.dis.st0270.s2017.jorxsua.tokens;

public class SepPuntoyComa extends Separador {

    public SepPuntoyComa() {
	    super(";", -1,-1);
    }

    public SepPuntoyComa(int linea, int column) {
	    super(";", linea, column);
    }
    
    public boolean equals(Object obj) {
	    boolean ret = false;
	    if (obj instanceof SepPuntoyComa) {
	       return true;
	    }
	    return ret;
    }
    
}