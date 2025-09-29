import java.util.Scanner;

public class Exe2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o valor da compra");
        double valor = sc.nextDouble();
        double soma = 0;
        float qtde = 0;
        while (valor > 0){
            soma = soma + valor;
            qtde++;
            System.out.println("Informe o valor da compra. Digite valor negativo para encerrar");
            valor = sc.nextDouble();
        }
        double media = 0;
        if (qtde != 0){
            media = soma / qtde;
        }
        System.out.println("Qtde de clientes " + qtde +
                " Média das compras " + media);
    }
}
