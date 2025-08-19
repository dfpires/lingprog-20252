import java.util.Scanner;
public class Main1 {
    public static void main(String[] args) {
        // entrada de dados
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o nome do paciente");
        String nome = entrada.nextLine();
        System.out.println("Informe o peso(kg) do paciente");
        float peso = entrada.nextFloat();
        System.out.println("Informe a altura(metros) do paciente");
        float altura = entrada.nextFloat();
        // processamento
        float imc = peso/(altura*altura);
        String classificacao;
        if (imc < 18.5f){
            classificacao = "Abaixo do peso";
        }
        else if (imc >= 18.5f && imc < 25.0f){
            classificacao = "Peso normal";
        }
        else if (imc >= 25.0f && imc < 30.0f){
            classificacao = "Sobrepeso";
        }
        else if (imc >= 30.0f){
            classificacao = "Obesidade";
        }
        else {
            classificacao = "não foi possível classificar";
        }
        System.out.println("Paciente " + nome + " tem IMC = " +
                imc + " e está classificado como " + classificacao);
    }
}