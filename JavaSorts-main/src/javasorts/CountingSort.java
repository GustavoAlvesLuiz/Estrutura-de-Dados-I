
package javasorts;


public class CountingSort {
    public static void countingSort(int[] arr) {
        int max = arr[0];
        int min = arr[0];

        // Valor máximo e mínimo no array
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        int range = max - min + 1;

        int[] contagem = new int[range];
        int[] saida = new int[arr.length];

        // Inicializando o array de contagem
        for (int i = 0; i < arr.length; i++) {
            contagem[arr[i] - min]++;
        }

        System.out.print("Passo 1 - Array de contagem: [");
        for (int i = 0; i < contagem.length; i++) {
            System.out.print(contagem[i]);
            if (i < contagem.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        // Atualizando o array de contagem com a soma acumulada
        for (int i = 1; i < contagem.length; i++) {
            contagem[i] += contagem[i - 1];
        }

        System.out.print("Passo 2 - Array de contagem após soma acumulada: [");
        for (int i = 0; i < contagem.length; i++) {
            System.out.print(contagem[i]);
            if (i < contagem.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        // Construindo o array de saída
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println("Passo 3 - Colocando " + arr[i] + 
          " na posição " + (contagem[arr[i] - min] - 1) + " do array de saída.");
            saida[contagem[arr[i] - min] - 1] = arr[i];
            contagem[arr[i] - min]--;
        }

        System.out.print("Passo 4 - Array de saída: [");
        for (int i = 0; i < saida.length; i++) {
            System.out.print(saida[i]);
            if (i < saida.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        // Copiando o array de saída para o array original
        for (int i = 0; i < arr.length; i++) {
            arr[i] = saida[i];
        }
    }

    
}
