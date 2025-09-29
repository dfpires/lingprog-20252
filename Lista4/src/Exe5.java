import javax.crypto.spec.PSource;
import java.util.Scanner;

public class Exe5 {
    public static void main(String[] args){
        // declara o vetor
        int[] vet = new int[15];
        // entrada de dados
        for(int i=0;i<15;i++){
            vet[i] = (int) (Math.random() * 21);
        }
        // mostra os números do vetor
        for(int i=0;i<15;i++){
            System.out.print(vet[i] + " ");;
        }
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe número para pesquisa");
        int pesquisa = entrada.nextInt();
        // vamos pesquisar
        boolean achou = false;
        for(int i=0;i<15;i++){
            if(vet[i]==pesquisa) {
                System.out.println("Elemento encontrado na posição " + i);
                achou = true;
            }
        }
        if (!achou) {
            System.out.println("Elemento não encontrado");
        }
    }
}
