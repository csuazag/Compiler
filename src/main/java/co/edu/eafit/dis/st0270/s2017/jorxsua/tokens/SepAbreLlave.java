package co.edu.eafit.dis.st0270.s2017.jorxsua.tokens;

public class SepAbreLlave extends Separador {

    public SepAbreLlave() {
	    super("{", -1,-1);
    }

    public SepAbreLlave(int linea, int column) {
	    super("{", linea, column);
    }
    
    public boolean equals(Object obj) {
        boolean ret = false;
        if (obj instanceof SepAbreLlave) {
            return true;
        }
        return ret;
    }
    
}