package co.edu.eafit.dis.st0270.s2017.jorxsua.tokens;

public class Entero extends Token {

    private String value;

    public Entero() {
        super(-1,-1);
        this.value = null;
    }

    public Entero(String value) {
        super(-1,-1);
        this.value = value;
    }

    public Entero(String literal, int linea, int column) {
        super(linea, column);
        this.value = new String(literal);
    }
    
    public String toString() {
	    return "Integer: " + this.value + " " + super.toString();
    }

    public boolean equals(Object obj) {
        boolean ret = false;
        if (obj instanceof Entero) {
            return true;
    	}
	    return ret;
    }
}