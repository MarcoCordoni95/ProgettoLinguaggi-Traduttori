import java_cup.runtime.*;

%% 
%cup
%class Scanner
%ignorecase

%{  
    ComplexSymbolFactory sf;
    public Scanner(java.io.Reader in, ComplexSymbolFactory sf) {
		this(in);
		this.sf = sf;
    }
%}

CIFRA = [:digit:]
LETTERA = [:letter:]
FINERIGA = \r | \n | \r\n
SPAZIATURA = [ \t\f] | {FINERIGA} 
%% 

","		 	{return sf.newSymbol("VIRGOLA",  	ParserSym.VIRGOLA);}
"keeping" 	{return sf.newSymbol("KEEPING",  	ParserSym.KEEPING);}
"while"	 	{return sf.newSymbol("WHILE",  		ParserSym.WHILE);}
";"		 	{return sf.newSymbol("SEPARATORE",  ParserSym.SEPARATORE);}
"="      	{return sf.newSymbol("ASSEGNAMENTO",ParserSym.ASSEGNAMENTO);}
"--"     	{return sf.newSymbol("DECREMENTO",  ParserSym.DECREMENTO);}
"++"     	{return sf.newSymbol("INCREMENTO",  ParserSym.INCREMENTO);}
"%"      	{return sf.newSymbol("RESTO",  		ParserSym.RESTO);}
"/"      	{return sf.newSymbol("DIVISO", 		ParserSym.DIVISO);}
"-"      	{return sf.newSymbol("MENO",   		ParserSym.MENO);}
"*"      	{return sf.newSymbol("PER",    		ParserSym.PER);}
"+"      	{return sf.newSymbol("PIU",    		ParserSym.PIU);}
"("      	{return sf.newSymbol("APERTA", 		ParserSym.TONDA_APERTA);}
")"      	{return sf.newSymbol("CHIUSA", 		ParserSym.TONDA_CHIUSA);}

{CIFRA}+ {return sf.newSymbol("NUMERO", ParserSym.NUMERO, new Integer(yytext()));}
{LETTERA}({LETTERA}|{CIFRA})* {return sf.newSymbol("IDENT", ParserSym.IDENT, yytext());}

{SPAZIATURA} { }

.        {return sf.newSymbol("err", ParserSym.error);}

<<EOF>>  {return sf.newSymbol("EOF", ParserSym.EOF);}