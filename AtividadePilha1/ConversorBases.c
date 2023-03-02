#include <stdio.h>
#include "bibliotecaPilha.h"

void converteDecimal(int dec, int base){
	tPilha p;
	inicializa(&p);
	
	while(dec>0){
		push(&p, dec%base);
		dec = dec/base;
	}// fim while
	mostraPilha(p);
}
//-------------------------
int main(){
	int decimal, base;
	printf("Valor para conversao de base: ");
	scanf("%d",&decimal);
	printf("Valor da base(2-binario | 8-octal): ");
	scanf("%d",&base);
	converteDecimal(decimal, base);
	return 0;
}
