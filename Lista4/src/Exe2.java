import java.util.Scanner;

public class Exe2 {
    public static void main(String[] args) {

        int[] vetor = new int[10];
        // entrada de dados
        for (int i = 0; i < vetor.length; i++) {
            // gera um número entre 0 e 20 e converte para inteiro
            vetor[i] = (int) (Math.random() * 21);
        }
        // mostra o resultado
        System.out.println("Elementos do vetor");
        for(int i=0;i<vetor.length;i++){
            System.out.print(vetor[i] + " ");
        }
    }
}
