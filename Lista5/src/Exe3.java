public class Exe3 {
    public static void main(String[] args) {
        // declaração da matriz
        int[][] mat = new int[3][3];
        // entrada de dados
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = (int) (Math.random() * 21);
            }
        }
        // cálculo da soma dos elementos da diagonal principal
        int soma = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (i == j){
                    soma += mat[i][j];
                }
            }
        }
        System.out.println("Soma dos elementos da DP é " + soma);
    }
}
