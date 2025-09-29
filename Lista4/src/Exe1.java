import java.util.Scanner;

public class Exe1 {
    public static void main(String[] args) {
        Scanner entrada =  new Scanner(System.in);
        int opcao;
        float saldo = 1000;
        // vetor que guarda as operações de depósito e saque
        // vetor de string, com 1000 posições
        String[] vetor = new String[1000];
        // cria um índice do vetor
        int indice = 0; // auxilia no armazenamento
        do {
            System.out.println("Digite uma das opções abaixo");
            System.out.println("1.Saldo \n2.Depositar \n3.Sacar \n4.Extrato \n0.Sair ");
            opcao = entrada.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Saldo da conta " + saldo);
                    break;
                case 2:
                    System.out.println("Informe o valor do depósito");
                    float x = entrada.nextFloat();
                    saldo = saldo + x;
                    // insere o depósito no vetor
                    vetor[indice] = "Depósito de R$ " + x;
                    indice++; // avança para a próxima posição
                    break;
                case 3:
                    System.out.println("Informe o valor do saque");
                    float y = entrada.nextFloat();
                    if (saldo >= y){
                        saldo = saldo - y;
                        vetor[indice] = "Saque de R$ " + y;
                        indice++;
                    }
                    else System.out.println("Saldo insuficiente");
                    break;
                case 4:
                    for(int i =0; i < indice; i++) {
                        System.out.println(vetor[i]);
                    }
                    break;
                case 0:
                    System.out.println("Programa será encerrado");
                    break;
                default:
                    System.out.println("Opção invalida");
            }
        }
        while (opcao != 0);
    }
}
