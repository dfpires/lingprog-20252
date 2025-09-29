public class Main2 {
    public static void main(String[] args) {
        int[] oficina1 = new int[10];
        int[] oficina2 = new int[10];
        int[] interseccao = new int[10];

        for (int i = 0; i < oficina1.length; i++) {
            oficina1[i] = i;
        }
        int j = 4;
        for (int i = 0; i < oficina2.length; i++) {
            oficina2[i] = j;
            j++;
        }
        // interseção
        int pos = 0;
        for (int i = 0; i < oficina1.length; i++) {
            for (j = 0; j < oficina2.length; j++) {
                if (oficina1[i] == oficina2[j]) {
                    interseccao[pos] = oficina1[i];
                    pos++;
                }
            }
        }
        for (int i = 0; i < pos; i++) {
            System.out.print(interseccao[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < oficina1.length; i++) {
            System.out.print(oficina1[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < oficina2.length; i++) {
            System.out.print(oficina2[i] + " ");
        }
    }
}
