import java.util.Scanner;

public class total {
    public static void main(String[] args) throws Exception {
        Double totalBayar, discount;
        Scanner inputan = new Scanner(System.in);
        System.out.print("Masukan Total Belanja ");
        totalBayar = inputan.nextDouble();

        if (totalBayar >= 100000) {
            discount = 10.0/100.0*totalBayar;
        } else {
            discount = 2.0/100.0*totalBayar;
        }

        totalBayar -= discount;
        System.out.println("Total Bayar:" + totalBayar);
        inputan.close();

        }
    }
