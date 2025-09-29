public class Exe7 {
    public static void main(String[] args) {
        int[] vetA = new int[10];
        int[] vetB = new int[10];
        int[] vetC = new int[10];
        // entrada de dados
        for(int i = 0; i < 10; i++){
            vetA[i] = (int) (Math.random() * 21);
        }
        for(int i = 0; i < 10; i++){
            vetB[i] = (int) (Math.random() * 21);
        }
        // calcula intersecção
        int iC = 0;
        for(int i = 0; i < 10; i++){ // para cada elemento de vetA
            for(int j = 0; j < 10; j++){ // para cada elemento de vetB
                if(vetA[i] == vetB[j]){
                    vetC[iC] = vetA[i];
                    iC++;
                }
            }
        }
    }
}
