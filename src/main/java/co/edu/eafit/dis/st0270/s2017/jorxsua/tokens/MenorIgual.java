package co.edu.eafit.dis.st0270.s2017.jorxsua.tokens;

public class MenorIgual extends Token {

    public MenorIgual() {
	    super(-1,-1);
    }

    public MenorIgual(int linea, int column) {
	    super(linea, column);
    }

    public boolean equals(Object obj) {
        boolean ret = false;
        if (obj instanceof MenorIgual) {
            ret =  true;
        }
        return ret;
    }

    public String toString() {
        String str = super.toString();
        return "<= " + str;
    }
   
}