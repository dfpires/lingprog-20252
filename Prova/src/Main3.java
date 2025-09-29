import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        float[][] pressao = new float[10][7];
        String[] nomes = new String[10];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Informe nome do paciente");
            nomes[i] = in.next();
            for (int j = 0; j < 7; j++) {
                System.out.println("Informe pressão do paciente " + nomes[i] + " no dia " + (j+1));
                pressao[i][j] = in.nextFloat();
            }
        }
        // Exibir uma tabela mostrando os nomes e suas respectivas medições.
        for (int i = 0; i < 10; i++) {
            System.out.println("Paciente " + nomes[i] + ":");
            for (int j = 0; j < 7; j++) {
                System.out.print(pressao[i][j] + " ");
            }
        }
        //Identificar o paciente com a maior média de pressão arterial.
        float maiorMedia = 0;
        int posicao = 0;
        for (int i = 0; i < 10; i++) {
            float soma = 0;
            for (int j = 0; j < 7; j++) {
                soma += pressao[i][j];
            }
            if (soma/7 > maiorMedia) {
                maiorMedia = soma/7;
                posicao = i;
            }
        }
        System.out.println("Nome do paciente com maior média " + nomes[posicao]);
        // Contar o número total de medições acima de 140 mmHg.
        int conta140 = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 7; j++) {
                if (pressao[i][j] > 140) {
                    conta140++;
                }
            }
        }
        System.out.println(conta140);
        // Calcular a média de pressão arterial por dia (considerando os 10 pacientes).
        for (int j = 0; j < 7; j++) {
            float soma = 0;
            for (int i = 0; i < 10; i++) {
                soma += pressao[i][j];
            }
            System.out.println("Média do dia " + (j+1) + " foi " + soma/10);
        }
    }
}
