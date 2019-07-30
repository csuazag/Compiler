package co.edu.eafit.dis.st0270.s2017.jorxsua.tokens;

public class MenorGuion extends Token {

    public MenorGuion() {
	    super(-1,-1);
    }

    public MenorGuion(int linea, int column) {
	    super(linea, column);
    }

    public boolean equals(Object obj) {
        boolean ret = false;
        if (obj instanceof MenorGuion) {
            ret =  true;
        }
        return ret;
    }

    public String toString() {
        String str = super.toString();
        return "<- " + str;
    }
   
}