import java.util.Scanner;

public class Exe8 {
    public static void main(String[] args) {
        Scanner entrada =  new Scanner(System.in);
        int opcao;
        float saldo = 1000;
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
                    break;
                case 3:
                    System.out.println("Informe o valor do saque");
                    float y = entrada.nextFloat();
                    if (saldo >= y){
                        saldo = saldo - y;
                    }
                    else System.out.println("Saldo insuficiente");
                    break;
                case 4: break;
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
