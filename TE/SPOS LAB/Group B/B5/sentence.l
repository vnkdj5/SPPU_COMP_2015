%{
#include "y.tab.h" //Contains Token Definiation
%}
%%
[\t ] ;	//IGNORE WHITE SPACES
am|is|are|have|has|can|will|shall|eat|sing|go|goes { printf("VERB\t==>%s\n",yytext);return VERB;}
very|simply|gently { printf("VERB\t==>%s\n",yytext);return(ADVERB); }
and|or|also|so|but|if|then {printf("CONJUNCTION\t==>%s\n",yytext);return (CONJUNCTION);}
fast|good|honest {printf("ADJECTIVE\t==>%s\n",yytext);return (ADJECTIVE);}
I|he|she|we|they|you|this {printf("PRONOUN\t==>%s\n",yytext);return (PRONOUN);}
in|on|to {printf("PREPOSITION\t==>%s\n",yytext);return (PREPOSITION);}
[a-zA-Z]+ {printf("NOUN\t==>%s\n",yytext);return (NOUN);}
. ; //IGNORE ANYTHING ELSE
%%
int yywrap()
{
return 1;
}
