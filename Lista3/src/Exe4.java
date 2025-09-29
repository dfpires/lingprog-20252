import java.util.Scanner;

public class Exe4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe um número");
        int numero = entrada.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(numero + " x " + i + " = " + numero*i);
        }
    }
}
