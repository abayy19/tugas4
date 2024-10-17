import java.util.Scanner;

public class diskon {

    public static void main(String[] args) throws Exception {
        Double totalBayar, discount;
        Scanner inputan = new Scanner(System.in);
        System.out.print("Masukan Total Belanja ");
        totalBayar = inputan.nextDouble();

        if (totalBayar >= 200000) {
            discount = 15.0/100.0*totalBayar;
        } else if (totalBayar >= 100000) {
            discount = 10.0/100.0*totalBayar;
        } else if (totalBayar >= 50000) {
            discount = 5.0/100.0*totalBayar;
        } else {
            discount = 0.0;
        }

        totalBayar -= discount;
        System.out.println("Total Bayar:" + totalBayar);
        inputan.close();

        }
    }
