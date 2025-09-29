import java.util.Scanner;

public class Exe2 {
    public static void main(String[] args) {
        // declaração da matriz
        int[][] mat = new int[3][3];
        // entrada de dados
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                mat[i][j] = (int) (Math.random() * 21);
            }
        }
        // cálculo da soma das linhas da matriz
        int soma = 0;
        for(int i=0;i<3;i++){
            soma = 0;
            for(int j=0;j<3;j++){
                soma += mat[i][j];
            }
            System.out.println("A soma dos elementos da linha " + i + " é " + soma);
        }
    }
}
