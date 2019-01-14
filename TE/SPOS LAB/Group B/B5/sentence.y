%{
#include<stdio.h>
void yyerror(char*);
int yylex();
FILE* yyin;
%}

%token NOUN PRONOUN ADJECTIVE VERB ADVERB CONJUNCTION PREPOSITION

%%
sentence: compound { printf("COMPOUND SENTENCE\n");}
	|
	simple {printf("SIMPLE SENTENCE\n");}
	;
simple: subject VERB object;

compound: subject VERB object CONJUNCTION subject VERB object;

subject: NOUN|PRONOUN;

object: NOUN|ADJECTIVE NOUN|ADVERB NOUN|PREPOSITION NOUN;
%%
void yyerror(char *s)
{
printf("ERROR:%s",s);
}
int main(int argc,char* argv[])
{
yyin=fopen(argv[1],"r");
yyparse();
fclose(yyin);
return 0;
}
