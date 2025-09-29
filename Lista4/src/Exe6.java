public class Exe6 {
    public static void main(String[] args) {
        int[] vetA = new int[5];
        int[] vetB = new int[5];
        int[] vetC = new int[10];

        // entrada de dados
        for(int i = 0; i < 5; i++){
            vetA[i] = (int) (Math.random() * 21);
        }
        for(int i = 0; i < 5; i++){
            vetB[i] = (int) (Math.random() * 21);
        }
        int iA = 0; int iB = 0;
        for(int i = 0; i < 10; i++){
            if (i % 2 == 0){
                vetC[i] = vetA[iA]; iA++;
            }
            else {
                vetC[i] = vetB[iB]; iB++;
            }
        }
        System.out.println("Vetor A");
        for(int i = 0; i < 5; i++){
            System.out.print(vetA[i] + " ");
        }
        System.out.println("\nVetor B");
        for(int i = 0; i < 5; i++){
            System.out.print(vetB[i] + " ");
        }
        System.out.println("\nVetor resultante");
        for(int i = 0; i < 10; i++){
            System.out.print(vetC[i] + " ");
        }
    }
}
