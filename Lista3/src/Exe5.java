import java.util.Scanner;

public class Exe5 {
    public static void main(String[] args) {
        Scanner objeto = new Scanner(System.in);
        System.out.println("Informe um número N positivo: ");
        int numero = objeto.nextInt();
        if (numero < 0){
            System.out.println("Digite valor positivo");
        }
        else {
            int soma = 0;
            for(int i=1;i<= numero;i++){
                if (i % 2 == 0){
                    soma += i;
                }
            }
            System.out.println("A soma dos números pares é " + soma);
        }
    }
}
