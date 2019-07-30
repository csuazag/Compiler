package co.edu.eafit.dis.st0270.s2017.jorxsua.tokens;

public class Keywords extends Token {

    private String key;

    public Keywords(String key, int linea, int column) {
	    super(linea, column);
	    this.key = new String(key);
    }

    public String toString() {
	    return "Keywords: " + this.key + " " + super.toString();
    }
}
