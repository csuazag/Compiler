package co.edu.eafit.dis.st0270.s2017.jorxsua.tokens;

public class Igual extends Token {

    public Igual() {
	    super(-1,-1);
    }

    public Igual(int linea, int column) {
	    super(linea, column);
    }

    public boolean equals(Object obj) {
        boolean ret = false;
        if (obj instanceof Igual) {
            ret =  true;
        }
        return ret;
    }

    public String toString() {
        String str = super.toString();
        return "= " + str;
    }
}