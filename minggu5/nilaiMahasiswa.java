package minggu5;

public class nilaiMahasiswa {
    public static void main(String[] args) {
        
        int jumlahMahasiswa = 5;
        String[] namaMahasiswa = {"Santi", "Aldi", "Riko", "Rahmi", "Koko"};
        int[] nilaiMahasiswa = {100, 50, 100, 90, 50};
        int totalNilai = 0;

         // Input data mahasiswa
         for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("________________________________");
            System.out.println("Mahasiswa Ke : " + (i + 1));
            System.out.println("Nama: " + namaMahasiswa[i]);
            System.out.println("Nilai: " + nilaiMahasiswa[i]);
            totalNilai += nilaiMahasiswa[i];
        }

        System.out.println("DAFTAR NILAI MAHASISWA");
        System.out.println("================================");
        System.out.println("No  Nama      Nilai   Status");

        // Output data mahasiswa dan hitung status lulus
        for (int i = 0; i < jumlahMahasiswa; i++) {
            String status = nilaiMahasiswa[i] >= 60 ? "Lulus" : "Tidak Lulus";
            System.out.printf("%-4d%-10s%-8d%-15s\n", (i + 1), namaMahasiswa[i], nilaiMahasiswa[i], status);
        }

        System.out.println("================================");

        // Hitung rata-rata
        double rataRataNilai = (double) totalNilai / jumlahMahasiswa;

        // Output total dan rata-rata nilai
        System.out.println("Jumlah: " + totalNilai);
        System.out.println("Nilai Rata-rata: " + rataRataNilai);
    }
}
