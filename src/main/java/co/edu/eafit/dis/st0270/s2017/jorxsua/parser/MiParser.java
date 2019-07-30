package co.edu.eafit.dis.st0270.s2017.jorxsua.parser;

import co.edu.eafit.dis.st0270.s2017.jorxsua.lexer.Analyzer; // JFlex

import co.edu.eafit.dis.st0270.s2017.jorxsua.parser.MiParserException; //Excepciones En Parser

import co.edu.eafit.dis.st0270.s2017.jorxsua.tokens.*; //Todas las clases tokens.

import java.io.StringReader;
import java.io.IOException;


public class MiParser {

    private Analyzer cel = null;
    private Token    cc  = null;

    public MiParser() {
    }

    public void parser(String str) 	throws MiParserException, IOException {
            
        StringReader sr;
        try {
            sr = new StringReader(str);
            cel = new Analyzer(sr);
        } catch (Exception e) {
            System.err.println(e);
            System.exit(1);
        }

        cc = cel.getNextToken();
    
        //Axioma
        gramManRec();
        return;
    }       

    private void gramManRec() throws MiParserException, IOException {
        // Estado 0 -> 1
        manRec();

        // Estado 1 -> 2
        endOfFile();
        return;
    }

    private void manRec() throws MiParserException, IOException {
        // Estado 3 -> 4
        declaraciones();
        // Estado 4 -> 5
        instrucciones();
        return;
    }

    private void endOfFile() throws MiParserException, IOException {
        // Estado de aceptacion
        if (cc instanceof EndOfFile) {
            return;
        } else { throw new MiParserException("Error, se esperaba un < EOF >", cc); }
        
    }

    private void declaraciones() throws MiParserException, IOException {
        //Estado 6 -> 7
        if(cc instanceof KeyClase){
            cc = cel.getNextToken();

            //Estado 7 -> 8
            if (cc instanceof Id){
                cc = cel.getNextToken();

                //Estado 8 -> 9
                if(cc instanceof Entero){
                    cc = cel.getNextToken();

                    //Estado 9 -> 10
                    if(cc instanceof SepPuntoyComa){
                        cc = cel.getNextToken();
                        
                        //Bifurcacion Estado 10 -> "7"
                        if(cc instanceof KeyClase){
                            declaraciones();
                        //Bifurcacion Estado 10 ->     
                        } else if (cc instanceof KeySolicitar || cc instanceof SepAbreLlave || cc instanceof Varid || cc instanceof KeySi || cc instanceof KeyMientras || cc instanceof EndOfFile){
                             return;
                        } else { throw new MiParserException("Error, se esperaba un < solicitar >  o  < { >  o  < VARID >  o  < si >  o  < mientras >", cc); }                        
                    } else { throw new MiParserException("Error, se esperaba un < ; >", cc); }
                } else { throw new MiParserException("Error, se esperaba un < ENTERO >", cc); }
            } else { throw new MiParserException("Error, se esperaba un < IDENTIFICADOR > ", cc); }
        } else { throw new MiParserException("Error, se esperaba un < clase > ", cc); }
    }


    private void instrucciones() throws MiParserException, IOException {
        // Bifurcacion Estado 11 -> 11
        if(cc instanceof KeySolicitar || cc instanceof SepAbreLlave || cc instanceof Varid || cc instanceof KeySi || cc instanceof KeyMientras){
            instruccion();
            instrucciones();
        // Bifurcacion Estado 11 ->    
        }else if(cc instanceof EndOfFile || cc instanceof SepCierraLlave){
            return;
        }else{ throw new MiParserException("Error, se esperaba un < EOF >  o  < } >  o  < solicitar >  o  < { >  o  < VARID >  o  < si >  o  < mientras >", cc); }   
}

    
    private void instruccion() throws MiParserException, IOException {
        // Bifurcacion Estado 12 -> 13
        if(cc instanceof KeySolicitar){
            cc = cel.getNextToken();

            //Estado 13 -> 14
            if(cc instanceof Id){
                cc = cel.getNextToken();
                
                // Bifurcacion Estado 14 -> 15
                if(cc instanceof KeyCuando){
                    cc = cel.getNextToken();
                    expresion();
                    bloque();
                    return;
                //Bifurcacion Estado 14 -> 17
                }else if(cc instanceof SepAbreLlave){
                    bloque();
                    return;
                }else{ throw new MiParserException("Error, se esperaba un < cuando >  o  < { >",cc); }
            }else{ throw new MiParserException("Error, se esperaba un < IDENTIFICADOR >", cc);}

        //Bifurcacion Estado 12 -> 17    
        }else if(cc instanceof SepAbreLlave){
            bloque();
            return;
        }else if(cc instanceof Varid){
            asignacion();
            return;
        }else if(cc instanceof KeySi){
            condicional();
            return;  
        }else if(cc instanceof KeyMientras){
            ciclo();
            return;
        }else{ throw new MiParserException("Error, se esperaba un < solicitar >  o  < { >  o  < VARID >  o  < si >  o  < mientras >",cc); }
    }

    private void bloque() throws MiParserException, IOException {
        // Estado 18 -> 19
        if(cc instanceof SepAbreLlave){
            cc = cel.getNextToken();

            //Bifurcacion Estado 19 -> 20
            if(cc instanceof KeySolicitar || cc instanceof SepAbreLlave || cc instanceof Varid || cc instanceof KeySi || cc instanceof KeyMientras || cc instanceof SepCierraLlave){
                instrucciones();
                
                //Estado 20 -> 21
                if(cc instanceof SepCierraLlave){
                    cc = cel.getNextToken();
                    return;
                }else{ throw new MiParserException("Error, se esperaba un < } >", cc);}

            //Bifurcacion 19 -> 22
            }else if(cc instanceof SepBarra){                
                declVars();

                //Estado 22 -> 20
                instrucciones();

                //Estado 20-> 21
                if(cc instanceof SepCierraLlave){
                    cc = cel.getNextToken();
                    return;
                }else{ throw new MiParserException("Error, se esperaba un < } >", cc);}
            }else{ throw new MiParserException("Error, se esperaba un < solicitar >  o  < { >  o  < varid >  o  < si >  o  < mientras >  o  < } >  o  < | >", cc);}
        }else{ throw new MiParserException("Error, se esperaba un < { >", cc);}

    }

    private void asignacion() throws MiParserException, IOException{
        // Estado 23 -> 24
        if(cc instanceof Varid){
            cc = cel.getNextToken();

            //Estado 24 -> 25
            if(cc instanceof MenorGuion){
                cc = cel.getNextToken();
                
                //Estado 25 -> 26
                expresion();

                //Estado 26 -> 27
                if(cc instanceof SepPuntoyComa){
                    cc = cel.getNextToken();
                    return;
                }else{throw new MiParserException("Error, se esperaba un < ; >", cc);}
            }else{throw new MiParserException("Error, se esperaba un <   <-   >", cc);}
        }else{ throw new MiParserException("Error, se esperaba un < VARID >", cc);}

    }    

    private void condicional() throws MiParserException, IOException{
        //Estado 28 -> 29
        if(cc instanceof KeySi){
            cc = cel.getNextToken();

            //Estado 29 -> 30
            expresion();

            //Estado 30 -> 31
            if(cc instanceof KeyEntonces){
                cc = cel.getNextToken();

                //Estado 31 -> 32
                instruccion();

                //Estado 32 -> 33
                condicionalP();
                return;
            }else{throw new MiParserException("Error, se esperaba un < ent >", cc);}
        }else{ throw new MiParserException("Error, se esperaba un <  >", cc);}
    }

    private void condicionalP() throws MiParserException, IOException{
        //Bifurcación 34 -> 35
        if(cc instanceof KeySino){
            cc = cel.getNextToken();

            //Estado 35 -> 36
            instruccion();

            if(cc instanceof KeyFinsi){
                cc = cel.getNextToken();
                return;
            }else{ throw new MiParserException("Error, se esperaba un < finsi >", cc);}
        //Bifurcacion 34 -> 37
        }else if(cc instanceof KeyFinsi){
            cc = cel.getNextToken();
            return;
        }else{ throw new MiParserException("Error, se esperaba un < sino >  o  < finsi >", cc);}

    }

    private void ciclo() throws MiParserException, IOException{
        //Estado 38 -> 39 
        if(cc instanceof KeyMientras){
            cc = cel.getNextToken();

            //Estado 39 -> 40
            expresion();

            //Estado 40 -> 41
            if(cc instanceof KeyHacer){
                cc = cel.getNextToken();

                //Estado 41 -> 42
                instruccion();
                return;
            }else{throw new MiParserException("Error, se esperaba un < hacer >", cc);}
        }else{throw new MiParserException("Error, se esperaba un < mientras > ", cc);}

    }

    private void declVars() throws MiParserException, IOException{
        //Estado 43 -> 44
        if(cc instanceof SepBarra){
            cc = cel.getNextToken();

            //Estado 44 -> 45
            if(cc instanceof Varid){
                cc = cel.getNextToken();

                //Simular Estrella de Kleen
                //Estado 45 -> 45
                while(cc instanceof Varid){
                    cc = cel.getNextToken();
                }

                if(cc instanceof SepBarra){
                    cc = cel.getNextToken();
                    return;
                }else{throw new MiParserException("Error, se esperaba un < | >",cc);}                  
            }else{throw new MiParserException("Error, se esperaba un < VARID >",cc);}
        }else{throw new MiParserException("Error, se esperaba un < | >", cc);}

    }

    private void expresion() throws MiParserException, IOException{
        //Estado 47 -> 48
        expr1();

        //Bifurcacion 48 -> 47
        if(cc instanceof KeyY){
            cc = cel.getNextToken();

            //Estado 47 -> 48
            expr1();
        //Bifurcacion 48 ->
        }else if (cc instanceof SepAbreLlave || cc instanceof KeyEntonces || cc instanceof KeyHacer || cc instanceof SepCierraParentesis || cc instanceof SepPuntoyComa){
            return;
        }else{ throw new MiParserException("Error, se esperaba un < { >  o  < ent >  o  < hacer >  o  < ) >  o  < ; >  o  < y > ", cc);}
    
    }

    private void expr1() throws MiParserException, IOException{
        //Estado 49 -> 50
        expr2();

        //Bifurcacion 50 -> 49
        if(cc instanceof MenorIgual){
            cc = cel.getNextToken();

            //Estado 49 -> 50
            expr2();
        //Bifurcacion 50 ->
        }else if (cc instanceof SepAbreLlave || cc instanceof KeyEntonces || cc instanceof KeyHacer || cc instanceof SepCierraParentesis || cc instanceof SepPuntoyComa || cc instanceof KeyY){
            return;
        }else{ throw new MiParserException("Error, se esperaba un < { >  o  < ent >  o  < hacer >  o  < ) >  o  < ; >  o  < y >", cc);}
    }

    private void expr2() throws MiParserException, IOException{
        //Estado 51 -> 52
        expr3();

        //Bifurcacion 52 -> 51
        if(cc instanceof Igual){
            cc = cel.getNextToken();

            //Estado 51 -> 52
            expr3();
        //Bifurcacion 52 -> 
        }else if (cc instanceof SepAbreLlave || cc instanceof KeyEntonces || cc instanceof KeyHacer || cc instanceof SepCierraParentesis || cc instanceof SepPuntoyComa || cc instanceof KeyY || cc instanceof MenorIgual){
            return;
        }else{ throw new MiParserException("Error, se esperaba un  < { >  o  < ent >  o  < hacer >  o  < ) >  o  < ; >  o  < y >  o  < <= >"  , cc);}
    }

    private void expr3() throws MiParserException, IOException{
        //Estado 53 -> 54
        expr4();

        //Bifurcacion 54 -> 53
        if(cc instanceof Suma){
            cc = cel.getNextToken();

            //Estado 53 -> 54
            expr4();
        //Bifurcacion 54 -> 
        }else if (cc instanceof SepAbreLlave || cc instanceof KeyEntonces || cc instanceof KeyHacer || cc instanceof SepCierraParentesis || cc instanceof SepPuntoyComa || cc instanceof KeyY || cc instanceof MenorIgual || cc instanceof Igual){
            return;
        }else{ throw new MiParserException("Error, se esperaba un < { >  o  < ent >  o  < hacer >  o  < ) >  o  < ; >  o  < y >  o  < <= >  o  < = > "  , cc);}
    }

    private void expr4() throws MiParserException, IOException{
        //Estado 55 -> 56
        expr5();

        //Bifurcacion 56 -> 55
        if(cc instanceof Multiplicar){
            cc = cel.getNextToken();

            //Estado 55 -> 56
            expr5();
        //Bifurcacion 56 -> 
        }else if (cc instanceof SepAbreLlave || cc instanceof KeyEntonces || cc instanceof KeyHacer || cc instanceof SepCierraParentesis || cc instanceof SepPuntoyComa || cc instanceof KeyY || cc instanceof MenorIgual || cc instanceof Igual || cc instanceof Suma){
            return;
        }else{ throw new MiParserException("Error, se esperaba un < { >  o  < ent >  o  < hacer >  o  < ) >  o  < ; >  o  < y >  o  < <= >  o  < = >  o  < + >"  , cc);} 

    }

    public void expr5() throws MiParserException, IOException{
        //Bifurcacion 57 -> 59
        if(cc instanceof KeyNo){
            cc = cel.getNextToken();

            //Estado 59 -> 58
            expr6();
            return;
        // Bifurcacion 57 -> 58
        }else if (cc instanceof SepAbreParentesis || cc instanceof Varid || cc instanceof Entero || cc instanceof Booleano){
            expr6();
            return;
        }else{throw new MiParserException("Error, se esperaba un < { >  o  < ent >  o  < hacer >  o  < ) >  o  < ; >  o  < y >  o  < <= >  o  < = >  o  < + >  o  < * >"  , cc);}

    }

    public void expr6() throws MiParserException, IOException{
        //Bifurcacion 60 -> 61
        if(cc instanceof SepAbreParentesis){
            cc = cel.getNextToken();
            //Estado 61 -> 62
            expresion();

            if(cc instanceof SepCierraParentesis){
                cc = cel.getNextToken();
                return;
            }else{
                throw new MiParserException("Error, se esperaba un < ) >", cc);
            }
        // Bifurcacion 60 -> 63
        }else if (cc instanceof Varid || cc instanceof Entero || cc instanceof Booleano){
            cc = cel.getNextToken();
            return;
        }else{
            throw new MiParserException("Error, se esperaba un < ( >  o  < VARID >  o  < ENTERO >  o  <BOOLEANO>",cc);
        }

    }

}