import java.util.Scanner;

public class Exe6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe um número");
        int numero = entrada.nextInt();
        if (numero == 0 || numero == 1){
            System.out.println(numero + " não é primo");
            return; // sai do main
        }
        boolean primo = true;
        for(int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                primo = false;
                break; // sai do for
            }
        }
        if (primo) {
            System.out.println("O número " + numero + " é Primo");
        }
        else {
            System.out.println("O número " + numero + " não é Primo");
        }

    }
}
