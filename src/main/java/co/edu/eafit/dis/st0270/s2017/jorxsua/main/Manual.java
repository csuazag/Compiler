package co.edu.eafit.dis.st0270.s2017.jorxsua.main;

import co.edu.eafit.dis.st0270.s2017.jorxsua.parser.MiParser;
import co.edu.eafit.dis.st0270.s2017.jorxsua.parser.MiParserException;

import java.io.BufferedReader;
import java.io.FileReader;

public class Manual{

    public Manual (String fichero){
        arrancar(fichero);
    }

    private void arrancar(String fich){
        try {
            FileReader file = new FileReader(fich);
            BufferedReader buffer = new BufferedReader(file);
            String cad = "";
            String aux = "";
            while((aux = buffer.readLine()) != null){
                cad += aux + '\n';
            }
                
            MiParser pe = new MiParser();
            pe.parser(cad);
            System.out.println("Expresión válida: " + fich);

        } catch (MiParserException cepe) {
            System.err.println("Invalido " + fich);
            //System.exit(1);
        } catch (Exception e) {
            System.err.println("Invalido "  + fich);
            //System.exit(1);
        }
    }
}