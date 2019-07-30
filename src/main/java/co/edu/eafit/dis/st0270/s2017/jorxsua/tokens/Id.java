package co.edu.eafit.dis.st0270.s2017.jorxsua.tokens;

public class Id extends Token {

    private String id;

    public Id() {
        super(-1,-1);
        this.id = null;
    }

    public Id(String id) {
        super(-1,-1);
        this.id = id;
    }

    public Id(String id, int line, int column) {
        super(line,column);
        this.id = id;
    }

    public String toString() {
        String str = super.toString();
        return "Identificador: " + this.id + " " + str;
    }

    public String getId(){
        return id;
    }
    
    public boolean equals(Object obj) {
        boolean ret = false;
        if (obj instanceof Id) {
            return true;
	    }
	    return ret;
    }

}