package javasorts;
import java.util.Random;
import java.util.Scanner;
public class JavaSorts {
    static int menuEntrada(){
        Scanner scanner = new Scanner(System.in);
        int op;
        System.out.println("1-Gerar dados");
        System.out.println("2-Entrar com dados");
        op = scanner.nextInt();
        return op;
    }
    
        static int menuMetodos(){
        Scanner scanner = new Scanner(System.in);
        int op;
        System.out.println("1-Bubble Sort");
        System.out.println("2-Couting Sort");
        System.out.println("0-Sair");
        op = scanner.nextInt();
        return op;
    }
    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int tamanho,op,valorBusca;
        long tempoInicial,tempoFinal;
        
        System.out.println("Tamanho do vetor:");
        tamanho = scanner.nextInt();
        int[] vetor = new int[tamanho];
        op = menuEntrada();
        switch(op){
            case 1:for(int i=0;i<vetor.length;i++)
                        vetor[i] = rand.nextInt(10);
            break;   
            case 2: System.out.println("Dados vetor:");
                    for(int i=0;i<vetor.length;i++)
                        vetor[i] = scanner.nextInt();
            break;        
       }// fim switch
        System.out.println("Vetor original:");
        printArray(vetor);
        do{
        op = menuMetodos();
        switch(op){
            case 1:
                    tempoInicial = System.currentTimeMillis();
                    BubbleSort.bSortComentado(vetor);
                    tempoFinal = System.currentTimeMillis();
                    tempoFinal = System.currentTimeMillis();
                    System.out.println("Tempo:"+(tempoFinal-tempoInicial));
                    
            break;
            
            case 2: tempoInicial = System.currentTimeMillis();
                    CountingSort.countingSort(vetor);
                    tempoFinal = System.currentTimeMillis();
                    tempoFinal = System.currentTimeMillis();
                    System.out.println("Tempo:"+(tempoFinal-tempoInicial));
            break;
            case 0: System.out.println("Saindo");
        }// fim switch
        }while(op!=0);
       
    }
    
    public static void printArray(int array[]){
          for(int i=0;i<array.length;i++)
              System.out.print(array[i]+"| ");
          
          System.out.println("\n");
    }// fim printArray
    
    public static void printIntervalo(int array[], int ini, int fim){
          for(int i=ini;i<=fim;i++)
              System.out.print(array[i]+"| ");
          
          System.out.println("\n");
    }// fim printArray
    
}
