import java.util.Scanner;

public class ganjilgenap {
    public static void main(String[] args) {

        Scanner inputan = new Scanner(System.in);
        System.out.print("Masukan sebuah bilangan ");
        int bilangan = inputan.nextInt();

        if (bilangan % 2 == 0) {
            System.out.println(bilangan + " adalah bilangan genap");
        } else {
            System.out.println(bilangan + " adalah bilangan ganjil");
        }

        inputan.close();
    }
}
