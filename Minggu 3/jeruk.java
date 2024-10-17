import java.util.Scanner;

public class jeruk {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Menghitung Harga Jeruk === ");

        System.out.print("Masukkan jumlah buah jeruk: ");
        int buah = scanner.nextInt();

        int harga_5 = 10000, harga_2 = 5000, harga_1 = 3000;
        int total = 0;

        if (buah >= 5) {
            int harga_buah_5 = (buah / 5) * harga_5;
            buah = buah % 5; 
            total += harga_buah_5;
        }

        if (buah >= 2) {
            int harga_buah_2 = (buah / 2) * harga_2;
            buah = buah % 2; 
            total += harga_buah_2;
        }

        if (buah >= 1) {
            int harga_buah_1 = buah * harga_1;
            total += harga_buah_1;
        }

        System.out.println("Total harga: " + total);
        scanner.close();
    }
}