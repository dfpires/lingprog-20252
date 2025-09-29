public class Main1 {
    public static void main(String[] args) {

       int[] guiche1 = new int[5];
       int[] guiche2 = new int[5];
       int[] intercala = new int[10];

       for (int i = 0; i < guiche1.length; i++) {
           guiche1[i] = (int) (Math.random() * 6);
       }
       for (int i = 0; i < guiche1.length; i++) {
            guiche2[i] = (int) (Math.random() * 10);
       }
       // intercalação
       int pos = 0;
       for (int i = 0; i < guiche2.length; i++) {
           intercala[pos] = guiche1[i];
           pos++;
           intercala[pos] = guiche2[i];
           pos++;
       }
       for(int i = 0; i < intercala.length; i++) {
           System.out.print(intercala[i] + " ");
       }
       System.out.println();
        for(int i = 0; i < guiche1.length; i++) {
            System.out.print(guiche1[i] + " ");
        }
        System.out.println();
        for(int i = 0; i < guiche2.length; i++) {
            System.out.print(guiche2[i] + " ");
        }
    }
}