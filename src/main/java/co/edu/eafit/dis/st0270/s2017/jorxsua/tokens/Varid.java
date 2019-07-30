package co.edu.eafit.dis.st0270.s2017.jorxsua.tokens;

public class Varid extends Token {

    private String var;

    public Varid() {
        super(-1,-1);
        this.var = null;
    }

    public Varid(String value) {
        super(-1,-1);
        this.var = value;
    }

    public Varid(String literal, int linea, int column) {
        super(linea, column);
        this.var = new String(literal);
    }
    
    public String toString() {
	    return "Varid: " + this.var + " " + super.toString();
    }

    public boolean equals(Object obj) {
        boolean ret = false;
        if (obj instanceof Varid) {
            return true;
    	}
	    return ret;
    }
}