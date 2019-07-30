package co.edu.eafit.dis.st0270.s2017.jorxsua.tokens;

public abstract class Separador extends Token {

    private String separador;

    public Separador(String sep, int linea, int column) {
	    super(linea, column);
	    this.separador = new String(sep);
    }

    public String toString() {
	    return "Separador: " + this.separador + " " + super.toString();
    }
}