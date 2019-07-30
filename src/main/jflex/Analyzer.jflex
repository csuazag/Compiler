package co.edu.eafit.dis.st0270.s2017.jorxsua.lexer;

import co.edu.eafit.dis.st0270.s2017.jorxsua.tokens.*;

%%

%class Analyzer
%unicode
%line
%column
%function getNextToken
%type Token
%public



InputCharacter = [\r\n]
LineTerminator = \r|\n|\r\n
WhiteSpace     = {LineTerminator} | [ \t\n]

ID = [A-Z][a-zA-Z0-9]*
VARID = [a-z][a-zA-Z0-9]*
ENTERO = 0|[1-9][0-9]*
BOOLEANO= "verdad" | "falso"

%%

"clase"     {return new KeyClase(yyline, yycolumn);}
"cuando"    {return new KeyCuando(yyline, yycolumn);}
"ent"       {return new KeyEntonces(yyline, yycolumn);}
"finsi"     {return new KeyFinsi(yyline, yycolumn);}
"hacer"     {return new KeyHacer(yyline, yycolumn);}
"mientras"  {return new KeyMientras(yyline, yycolumn);}
"no"        {return new KeyNo(yyline, yycolumn);}
"si"        {return new KeySi(yyline, yycolumn);}
"sino"      {return new KeySino(yyline, yycolumn);}
"solicitar" {return new KeySolicitar(yyline, yycolumn);}
"y"         {return new KeyY(yyline, yycolumn);}

"{"         {return new SepAbreLlave(yyline, yycolumn);}
"}"         {return new SepCierraLlave(yyline, yycolumn);}
"("         {return new SepAbreParentesis(yyline, yycolumn);}
")"         {return new SepCierraParentesis(yyline, yycolumn);}
";"         {return new SepPuntoyComa(yyline, yycolumn);}
"|"         {return new SepBarra(yyline, yycolumn);}

"<-"        {return new MenorGuion(yyline, yycolumn);}
"<="        {return new MenorIgual(yyline, yycolumn);}
"="         {return new Igual(yyline, yycolumn);}
"+"         {return new Suma(yyline, yycolumn);}
"*"         {return new Multiplicar(yyline, yycolumn);}

{BOOLEANO}       {return new Booleano(yytext(), yyline, yycolumn);}
{ID}	         {return new Id(yytext(), yyline, yycolumn);}
{VARID}	         {return new Varid(yytext(),yyline,yycolumn);}
{ENTERO}         {return new Entero(yytext(),yyline,yycolumn);}
{LineTerminator} {        } 
{InputCharacter} {        }
{WhiteSpace}     {        }

[^]                  { return new Camilomalo(yyline,yycolumn); } 
                     
                     
<<EOF>>          {return new EndOfFile();}
