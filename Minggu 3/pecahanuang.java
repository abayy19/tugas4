import java.util.Scanner;

public class pecahanuang {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Menghitung Pecahan uang === ");

        System.out.print("Masukkan jumlah uang: ");
        int jumlahUang = scanner.nextInt();

        int seratusRibu, limaPuluhRibu, duaPuluhRibu, sepuluhRibu, limaRibu, duaRibu, seribu, limaRatus, seratus;

        if (jumlahUang >= 100000) {
            seratusRibu = jumlahUang / 100000;
            jumlahUang = jumlahUang % 100000;
            System.out.println(seratusRibu + " lembar/keping 100000 rupiah");
        }

        if (jumlahUang >= 50000) {
            limaPuluhRibu = jumlahUang / 50000;
            jumlahUang = jumlahUang % 50000;
            System.out.println(limaPuluhRibu + " lembar/keping 50000 rupiah");
        }

        if (jumlahUang >= 20000) {
            duaPuluhRibu = jumlahUang / 20000;
            jumlahUang = jumlahUang % 20000;
            System.out.println(duaPuluhRibu + " lembar/keping 20000 rupiah");
        }

        if (jumlahUang >= 10000) {
            sepuluhRibu = jumlahUang / 10000;
            jumlahUang = jumlahUang % 10000;
            System.out.println(sepuluhRibu + " lembar/keping 10000 rupiah");
        }

        if (jumlahUang >= 5000) {
            limaRibu = jumlahUang / 5000;
            jumlahUang = jumlahUang % 5000;
            System.out.println(limaRibu + " lembar/keping 5000 rupiah");
        }

        if (jumlahUang >= 2000) {
            duaRibu = jumlahUang / 2000;
            jumlahUang = jumlahUang % 2000;
            System.out.println(duaRibu + " lembar/keping 2000 rupiah");
        }

        if (jumlahUang >= 1000) {
            seribu = jumlahUang / 1000;
            jumlahUang = jumlahUang % 1000;
            System.out.println(seribu + " lembar/keping 1000 rupiah");
        }

        if (jumlahUang >= 500) {
            limaRatus = jumlahUang / 500;
            jumlahUang = jumlahUang % 500;
            System.out.println(limaRatus + " lembar/keping 500 rupiah");
        }

        if (jumlahUang >= 100) {
            seratus = jumlahUang / 100;
            jumlahUang = jumlahUang % 100;
            System.out.println(seratus + " lembar/keping 100 rupiah");
        }

        scanner.close();
    }
}