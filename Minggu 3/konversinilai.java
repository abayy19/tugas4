import java.util.Scanner;

public class konversinilai {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Konversi Nilai Menjadi Grade ===");
        
        double persenAbsen = 10.0/100; 
        double persenTugas = 20.0/100; 
        double persenProject = 25.0/100;  
        double persenQuiz = 5.0/100;  
        double persenUts = 20.0/100;   
        double persenUas = 20.0/100;   
        
        System.out.print("Masukkan Nama Mahasiswa : ");
        String namaMahasiswa = scanner.nextLine();
        
        System.out.print("Masukkan nilai absen : ");
        double nilaiAbsen = scanner.nextDouble();

        System.out.print("Masukkan nilai tugas : ");
        double nilaiTugas = scanner.nextDouble();

        System.out.print("Masukkan nilai project : ");
        double nilaiProject = scanner.nextDouble();

        System.out.print("Masukkan nilai quiz : ");
        double nilaiQuiz = scanner.nextDouble();
        
        System.out.print("Masukkan nilai UTS : ");
        double nilaiUts = scanner.nextDouble();
        
        System.out.print("Masukkan nilai UAS : ");
        double nilaiUas = scanner.nextDouble();
        
        double nilaiAkhir = (nilaiAbsen * persenAbsen) +
                            (nilaiTugas * persenTugas) +
                            (nilaiProject * persenProject) +
                            (nilaiQuiz * persenQuiz) +
                            (nilaiUts * persenUts) +
                            (nilaiUas * persenUas);
        
        String grade;
        String keterangan;
        
        if (nilaiAkhir >= 85) {
            grade = "A";
        } else if (nilaiAkhir >= 75) {
            grade = "B";
        } else if (nilaiAkhir >= 65) {
            grade = "C";
        } else if (nilaiAkhir >= 55) {
            grade = "D";
        } else {
            grade = "E";
        }

        if (nilaiAkhir >= 85) {
            keterangan = "Lulus";
        } else if (nilaiAkhir >= 75) {
            keterangan = "Lulus";
        } else if (nilaiAkhir >= 65) {
            keterangan = "Remedial";
        } else if (nilaiAkhir >= 55) {
            keterangan = "Tidak lulus";
        } else {
            keterangan = "Tidak lulus";
        }
        
        System.out.println(" === Kesimpulan === ");

        System.out.println("Nama mahasiswa : " + namaMahasiswa);
        System.out.println("Nilai akhir mahasiswa : " + (int)nilaiAkhir);
        System.out.println("Grade mahasiswa : " + grade);
        System.out.println("Keterangan : " + keterangan);
        
        scanner.close();
    }
}