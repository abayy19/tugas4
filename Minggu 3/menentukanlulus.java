import java.util.Scanner;

public class menentukanlulus {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Menentukan Lulus atau Tidak ===");

        System.out.print("Masukan nilai mahasiswa : ");
        double nilaiMahasiswa = scanner.nextDouble();

        String keterangan;

        if (nilaiMahasiswa >= 75) {
            keterangan = "Lulus";
        } else {
            keterangan = "Tidak Lulus";
        }

        System.out.println("Keterangan : " + keterangan);

        scanner.close();
    }
}
