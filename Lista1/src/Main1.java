import java.util.Scanner;
public class Main1 {
    public static void main(String[] args) {
        // declaração de variáveis
        String nome;
        float horas, valor, salario;
        // entrada de dados
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o nome: ");
        nome = entrada.nextLine();
        System.out.println("Digite as horas trabalhadas: ");
        horas = entrada.nextFloat();
        System.out.println("Digite o valor da hora: ");
        valor = entrada.nextFloat();
        // processamento
        salario = horas * valor;
        System.out.println("O funcionário " + nome + " trabalhou "
                + horas + " horas e receberá R$ " + salario);
    }
}
