import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        int qtde, pagto;
        float preco;
        // entrada de dados
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o nome: ");
        String nome = entrada.nextLine();
        System.out.println("Digite a qtde ");
        qtde = entrada.nextInt();
        System.out.println("Digite preço informado");
        preco = entrada.nextFloat();
        System.out.println("Digite forma pagto 1.Pix 2.Cartão 3.Boleto");
        pagto = entrada.nextInt();
        // processamento
        // preço inicial
        float subtotal = preco * qtde;
        // preço com desconto
        float subtotalComDesconto = subtotal;
        if (subtotal >= 100 && subtotal < 300){
            subtotalComDesconto = subtotal - subtotal*5/100;
        }
        else if (subtotal >= 300){
            subtotalComDesconto = subtotal - subtotal*10/100;
        }
        // alteração no preço em função da forma de pagto
        float totalFinal;
        switch (pagto){
            case 1: totalFinal = subtotalComDesconto - subtotalComDesconto*2/100;
                    break; // não entra nas opções abaixo
            case 2: totalFinal = subtotalComDesconto + subtotalComDesconto*1.5f/100;
                    break;
            case 3: totalFinal = subtotalComDesconto;
                    break;
            default: totalFinal = subtotalComDesconto;
        }
        System.out.println("Nome: " + nome + " Qtde: " + qtde +
        " Preço: " + preco + " SubTotal " + subtotal +
        " SubTotal Com Desconto: " + subtotalComDesconto +
        " Total Final: " + totalFinal);
    }
}
