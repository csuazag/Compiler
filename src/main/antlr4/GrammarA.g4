grammar GrammarA;

@header{
    package co.edu.eafit.dis.st0270.s2017.jorxsua.parser;
}

grammanrec      : manrec EOF;

manrec          : declaraciones instrucciones;

declaraciones   : ('clase' ID ENTERO ';')+;

instrucciones   : (instruccion)*;

instruccion     : 'solicitar' ID ('cuando' expresion)? bloque
                | bloque
                | asignacion
                | condicional
                | ciclo;

bloque          : '{'(decvars)? instrucciones '}';

asignacion      : VARID '<-' expresion ';';

condicional     : 'si' expresion 'ent' instruccion condicionalp;

condicionalp    : 'sino' instruccion 'finsi'
                | 'finsi';

ciclo           : 'mientras' expresion 'hacer' instruccion;

decvars         : '|' (VARID)+ '|';

expresion       : expr1 ('y' expr1)*;

expr1           : expr2 ('<=' expr2)*;

expr2           : expr3 ('=' expr3)*;

expr3           : expr4 ('+' expr4)*;

expr4           : expr5 ('*' expr5)*;

expr5           : 'no' expr6
                | expr6;

expr6           : '(' expresion ')'
                | VARID
                | ENTERO
                | BOOLEANO;


ID  	 : ('A'..'Z')('a'..'z'|'A'..'Z'|'0'..'9')* ;
VARID    : ('a'..'z')('a'..'z'|'A'..'Z'|'0'..'9')* ;
BOOLEANO : ('verdad'|'falso') ;
ENTERO   : '0'|('1'..'9')('0'..'9')* ;
WS       : (' '|'\t'|'\n')+ {skip();}
	;

             
