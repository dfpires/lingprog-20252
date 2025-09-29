import java.util.Scanner;
public class Exe1 {
    public static void main(String[] args) {
        // declaração da matriz
        int[][] mat = new int[3][3];
        Scanner entrada = new Scanner(System.in);
        // leitura da matriz
        // mat.length => qtde de linhas
        for(int i=0;i<mat.length;i++){
            System.out.println("Informe os valores da linha " + (i+1));
            // mat[i].length => qtde de colunas da linha i
            for(int j=0;j<mat[i].length;j++){
                System.out.println("Informe os valores da coluna " + (j+1));
                mat[i][j] = entrada.nextInt();
            }
        }
        // saída da matriz
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println("\n");
        }
    }
}