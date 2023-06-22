public class TESTEJAVA {
    public static void main(String[] args) throws Exception {
        int acertos[] = new int[5];

        acertos[0] = 3;
        acertos[1] = 5;
        acertos[2] = 7;
        acertos[3] = 10;
        acertos [4] = 13;




          for (int i = 1; i < acertos.length; i++) {
            for (int j = 0; j < i; j++) {
                if (acertos[i] > acertos[j]) {
                    int temp = acertos[i];
                    acertos[i] = acertos[j];
                    acertos[j] = temp;
                }
            }
        }

        for(int i=0;i<5; i++){
            System.out.printf(acertos[i]+ " ");
        }
    }
}
