#include <stdio.h>
#include "bibliotecaPilhab.h"
int menu(){
	int op;
	printf("1-Inserir\n");
	printf("2-Desfazer\n");
	printf("3-Mostrar\n");
	printf("0-Sair\n");
	printf("Opcao: ");
	scanf("%d", &op);
	return op;

}
//-----------------------------------
int main(){
	int op;
	tPilha p;
	inicializa(&p);
	tdado dado;
	do {
		op = menu();
		switch(op) {
			case 1:
				printf("\n Digite a data: ");
				fflush(stdin);
				gets(dado.data);
				printf("Digite a descricao: ");
				fflush(stdin);
				gets(dado.descricao);
				if(push(&p, dado) == 1) {
					printf("Dados inseridos com sucesso!\n");
					getch();
					system("cls");
				}else {
					printf("A pilha esta cheia!\n");
					getch();
					system("cls");
				}
				break;
			case 2:
				if(!isEmpty(p)) {
					dado = pop(&p);
					printf("\nOs seguintes dados foram removidos: \n");
					printf("Data: %s\n", dado.data);
					printf("Descricao: %s\n", dado.descricao);
					getch();
					system("cls");
				}else 
					printf("A pilha esta vazia!\n");
					printf("\n");
				break;
			case 3: 
					if(!isEmpty(p)){
						mostraPilha(p);
						getch();
						system("cls");
					}else 
						printf("A pilha esta vazia!\n");
						printf("\n");
					break;
			case 0:
				printf("Saindo...\n");
				getch();
				break;
			default:
				printf("Opcao invalida!!!\n");
				break;
				
		}
	}while(op != 0);
	return 0;
}
