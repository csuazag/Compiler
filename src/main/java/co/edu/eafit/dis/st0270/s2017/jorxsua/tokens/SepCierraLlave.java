package co.edu.eafit.dis.st0270.s2017.jorxsua.tokens;

public class SepCierraLlave extends Separador {

    public SepCierraLlave() {
	    super("}", -1,-1);
    }

    public SepCierraLlave(int linea, int column) {
	    super("}", linea, column);
    }
    
    public boolean equals(Object obj) {
	    boolean ret = false;
	    if (obj instanceof SepCierraLlave) {
	       return true;
	    }
	    return ret;
    }

}