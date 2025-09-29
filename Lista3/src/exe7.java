import java.util.Scanner;

public class exe7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("Informe uma das opções abaixo para investir");
            System.out.println("1. CDB \n 2. LCA/LCI \n 3. Poupança \n 4. Ações \n 5. Sair");
            opcao = entrada.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Renda fixa com IR sobre lucro");
                    break;
                case 2:
                    System.out.println("Renda fiz sem IR sobre lucro");
                    break;
                case 3:
                    System.out.println("Rendimento baixo, com liquidez imediata");
                    break;
                case 4:
                    System.out.println("Renda variável, maior risco");
                    break;
                case 5:
                    System.out.println("Programa será encerrado");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }
        while (opcao != 5);
    }
}
