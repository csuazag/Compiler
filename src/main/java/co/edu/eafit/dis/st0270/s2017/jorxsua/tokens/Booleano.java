package co.edu.eafit.dis.st0270.s2017.jorxsua.tokens;

public class Booleano extends Token {

    private String value;

    public Booleano() {
        super(-1,-1);
        this.value = null;
    }

    public Booleano(String value) {
        super(-1,-1);
        this.value = value;
    }

    public Booleano(String literal, int linea, int column) {
        super(linea, column);
        this.value = new String(literal);
    }
    
    public String toString() {
        return "Booleano: " + this.value + " " + super.toString();
    }

    public boolean equals(Object obj) {
        boolean ret = false;
        if (obj instanceof Booleano) {
            return true;
    	}
	    return ret;
    }
}