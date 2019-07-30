package co.edu.eafit.dis.st0270.s2017.jorxsua.tokens;

public class SepCierraParentesis extends Separador {

    public SepCierraParentesis() {
	    super(")", -1,-1);
    }

    public SepCierraParentesis(int linea, int column) {
	    super(")", linea, column);
    }
    
    public boolean equals(Object obj) {
	    boolean ret = false;
	    if (obj instanceof SepCierraParentesis) {
	       return true;
	    }
	    return ret;
    }

}