package minggu6;

import java.util.Scanner;
import java.util.ArrayList;

class Mahasiswa {
    String nama;
    double nilai;

    Mahasiswa(String nama, double nilai) {
        this.nama = nama;
        this.nilai = nilai;
    }

    String getStatus() {
        if (nilai >= 70) {
            return "Lulus";
        } else {
            return "Tidak Lulus";
        }
    }

    String getGrade() {
        if (nilai >= 85) {
            return "A";
        } else if (nilai >= 75) {
            return "B";
        } else if (nilai >= 65) {
            return "C";
        } else {
            return "D";
        }
    }
}

public class arraylist1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan jumlah data: ");
        int jumlahData = scanner.nextInt();
        scanner.nextLine();

        ArrayList<Mahasiswa> mahasiswa = new ArrayList<>();
        for (int i = 0; i < jumlahData; i++) {
            System.out.println("Mahasiswa ke : " + (i + 1));
            System.out.print("Masukan nama mahasiswa : ");
            String nama = scanner.nextLine();
            System.out.print("Masukan nilai mahasiswa : ");
            double nilai = scanner.nextDouble();
            scanner.nextLine();

            mahasiswa.add(new Mahasiswa(nama, nilai));
            System.out.println("-----------------------------");
        }
        System.out.println("Data Nilai Mahasiswa : ");
        System.out.println("========================================");
        System.out.printf("%-3s %-10s %-5s %-3s %-10s\n", "No", "Nama", "Nilai", "Grade", "Status");

        double totalNilai = 0;
        for (int i = 0; i < mahasiswa.size(); i++) {
            Mahasiswa mhs = mahasiswa.get(i);
            System.out.printf("%-3d %-10s %-6.1f %-3s %-10s\n", (i + 1), mhs.nama, mhs.nilai, mhs.getGrade(),
                    mhs.getStatus());
            totalNilai += mhs.nilai;
        }
        System.out.println("========================================");
        System.out.println("Jumlah : " + totalNilai);
        double rataRata = totalNilai / jumlahData;
        System.out.println("Nilai rata-rata : " + rataRata);
        System.out.println("------------------------------");

        scanner.close();
    }
}
