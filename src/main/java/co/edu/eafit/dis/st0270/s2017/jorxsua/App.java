package co.edu.eafit.dis.st0270.s2017.jorxsua;

import co.edu.eafit.dis.st0270.s2017.jorxsua.parser.MiParser;
import co.edu.eafit.dis.st0270.s2017.jorxsua.parser.MiParserException;
import co.edu.eafit.dis.st0270.s2017.jorxsua.main.*;



public class App {

    public static void main(String args[]) {
        try{
            if (args[0].equals("manual")){
                int i=1;
                Manual m ;
                while (i<args.length){
                    m=new Manual(args[i]);
                    i++;
                }
                
            }else if(args[0].equals("auto")){
                int i=1;
                Auto a ;
                while (i<args.length){
                    a=new Auto(args[i]);
                    i++;
                }
            }else {
                int i=0;
                Manual m ;
                while (i<args.length){
                    m=new Manual(args[i]);
                    i++;
                }
            }
        }catch(Exception e){
            System.out.println("Expresion invalida");
        }
        
    }
}
