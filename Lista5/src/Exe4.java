import java.util.Scanner;

public class Exe4 {
    public static void main(String[] args) {
        // ler o tamanho da matriz
        System.out.println("Informe o tamanho da matriz");
        Scanner entrada = new Scanner(System.in);
        int N = entrada.nextInt();
        // cria a matriz
        int[][] mat = new int[N][N];
        // cria a matriz identidade
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i == j){
                    mat[i][j] = 1;
                }
                else {
                    mat[i][j] = 0;
                }
            }
        }
        // exibe a matriz identidade
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
