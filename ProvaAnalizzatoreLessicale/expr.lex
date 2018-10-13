%% 
%class Scanner
%function getNext
%type Token

CIFRA = [:digit:]
LETTERA = [:letter:]
FINERIGA = \r | \n | \r\n
SPAZIATURA = [ \t\f] | {FINERIGA} 
%% 

","		 	{return new Token(TipoToken.VIRGOLA);}
"keeping" 	{return new Token(TipoToken.KEEPING);}
"while"	 	{return new Token(TipoToken.WHILE);}
";"		 	{return new Token(TipoToken.SEPARATORE);}
"="      	{return new Token(TipoToken.ASSEGNAMENTO);}
"--"     	{return new Token(TipoToken.DECREMENTO);}
"++"     	{return new Token(TipoToken.INCREMENTO);}
"%"      	{return new Token(TipoToken.RESTO);}
"/"      	{return new Token(TipoToken.DIVISO);}
"-"      	{return new Token(TipoToken.MENO);}
"*"      	{return new Token(TipoToken.PER);}
"+"      	{return new Token(TipoToken.PIU);}
"("      	{return new Token(TipoToken.TONDA_APERTA);}
")"      	{return new Token(TipoToken.TONDA_CHIUSA);}

{CIFRA}+ {return new Token(TipoToken.NUMERO, new Integer(yytext()));}
{LETTERA}({LETTERA}|{CIFRA})* {return new Token(TipoToken.IDENT, yytext());} 

{SPAZIATURA} { }

.        {return new Token(TipoToken.ALTRO);}

<<EOF>>  {return new Token(TipoToken.EOF);}