import java.util.Scanner;

// todo programa Java começa definindo uma classe
public class Main {
    // definição da função main, executada quando o programa roda
    public static void main(String[] args) {
        // comando de saída - a função println pertence a classe System
        System.out.println("Hello world!");
        System.out.println("Bom dia");

        // Java é fortemente tipado (float, char, int, double, boolean)
        // declara variável e atribui valor a ela
        char letra = 'A';
        float nota = 6.5f;
        int idade = 19;
        boolean resposta = true;
        String nome = "Murilo";
        // exibe os dados das variáveis para o usuário
        System.out.println("Letra: " + letra + "\nNota " + nota +
                "\nIdade: " + idade + "\nResposta: " + resposta +
                "\nNome: " + nome);

        // comando de entrada
        // utilização da classe Scanner
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite uma nota: ");
        float nota1, nota2;
        nota1 = entrada.nextFloat();
        System.out.println("Digite outra nota: ");
        nota2 = entrada.nextFloat();
        System.out.println("Digite o nome do aluno: ");
        String nomeAluno = entrada.nextLine();
        // calcula a soma das notas
        float soma = nota1 + nota2;
        float media = soma / 2;
        System.out.println("O aluno " + nomeAluno + " teve média " + media);
    }



}