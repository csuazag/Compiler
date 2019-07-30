package co.edu.eafit.dis.st0270.s2017.jorxsua.tokens;

public class Multiplicar extends Token {

    public Multiplicar() {
	    super(-1,-1);
    }

    public Multiplicar(int linea, int column) {
	    super(linea, column);
    }

    public boolean equals(Object obj) {
        boolean ret = false;
        if (obj instanceof Multiplicar) {
            ret =  true;
        }
        return ret;
    }

    public String toString() {
        String str = super.toString();
        return "* " + str;
    }
    
}