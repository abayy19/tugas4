import java.util.Scanner;

public class belanja {
    public static void main(String[] args) throws Exception {
        Double totalBayar, discount;
        String isMember;
        Scanner inputan = new Scanner(System.in);
        System.out.print("Masukan Total Belanja ");
        totalBayar = inputan.nextDouble();
        System.out.print("Apakah anda member? ");
        isMember = inputan.next().toLowerCase();

        if (totalBayar >= 200000) {
            discount = 15.0/100.0*totalBayar;
            totalBayar -= discount;
            if (isMember.equals("y") || isMember.equals("ya")) {
                discount = 10.0/100.0*totalBayar;
                totalBayar -= discount;
            }
        } else if (totalBayar >= 100000) {
            discount = 10.0/100.0*totalBayar;
            if (isMember.equals("y") || isMember.equals("ya")) {
                discount = 10.0/100.0*totalBayar;
                totalBayar -= discount;
            }
        } else {
            discount = 0.0;
            totalBayar -= discount;
            if (isMember.equals("y") || isMember.equals("ya")) {
                discount = 10.0/100.0*totalBayar;
                totalBayar -= discount;
            }
        }

        System.out.println("Total Bayar:" + totalBayar);
        inputan.close();

        }
    }
