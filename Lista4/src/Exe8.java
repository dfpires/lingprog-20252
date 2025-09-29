import java.util.Scanner;
public class Exe8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[10];
        // leitura do vetor
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o número " + (i+1) + ": ");
            vetor[i] = sc.nextInt();
        }
        // vetor auxiliar para marcar os já contados
        boolean[] contado = new boolean[vetor.length];
        System.out.println("\nFrequência de valores:");
        for (int i = 0; i < vetor.length; i++) {
            if (!contado[i]) { // se ainda não foi contado
                int cont = 1;
                for (int j = i+1; j < vetor.length; j++) {
                    if (vetor[i] == vetor[j]) {
                        cont++;
                        contado[j] = true; // marca como já contado
                    }
                }
                System.out.println("Número " + vetor[i] + " aparece " + cont + " vez(es)");
            }
        }
    }
}