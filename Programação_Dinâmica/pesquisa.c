#include <stdio.h>

/*
Problema da Soma M�xima em um Vetor:
O objetivo � encontrar a subsequ�ncia cont�gua de soma m�xima 
em um vetor de n�meros inteiros. Esse problema pode ser resolvido 
usando programa��o din�mica por meio da t�cnica conhecida como Algoritmo de Kadane.
*/

int somaSubvetorMaximo(int vetor[], int tamanho) {
    int soma_atual = vetor[0];  // Inicializa a soma atual com o primeiro elemento do vetor
    int soma_maxima = vetor[0]; // Inicializa a soma m�xima com o primeiro elemento do vetor

    // Percorre o vetor a partir do segundo elemento
    for (int i = 1; i < tamanho; i++) {
        // Atualiza a soma atual, escolhendo entre o elemento atual e a soma atual + elemento atual
        if (vetor[i] > soma_atual + vetor[i]) {
            soma_atual = vetor[i];
        } else {
            soma_atual = soma_atual + vetor[i];
        }

        // Atualiza a soma m�xima, escolhendo entre a soma atual e a soma m�xima atual
        if (soma_atual > soma_maxima) {
            soma_maxima = soma_atual;
        }
    }

    return soma_maxima;
}

int main() {
    int vetor[] = {-2, -3, 4, -1, -2, 1, 5, -3}; // Exemplo de vetor
    int tamanho = sizeof(vetor) / sizeof(vetor[0]); // Calcula o tamanho do vetor

    int soma_maxima = somaSubvetorMaximo(vetor, tamanho); // Chama a fun��o para encontrar a soma de subvetor m�ximo

    printf("A soma de subvetor maximo e: %d\n", soma_maxima);

    return 0;
}
