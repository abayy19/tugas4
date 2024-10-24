package minggu5;

public class loopingUts {
    public static void main(String[] args) {

        int a = 4;
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j <= a; j++) {
                if (j <= a - i) {
                    System.out.print("S ");
                } else {
                    System.out.print("O ");
                }

            }
            System.out.println();
        }
    }
}
