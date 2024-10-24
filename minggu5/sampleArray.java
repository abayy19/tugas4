package minggu5;

import java.util.Scanner;
public class sampleArray {
    public static void main(String[] args) {
        
        Scanner inputan = new Scanner(System.in);
        System.out.print("Masukan jumlah data: ");
        int n = inputan.nextInt();
        String[] mahasiswa = new String[n];
        Double[] nilai = new Double[n];
        Double nilaiRata, totalNilai=0.0;

        for(int i=0; i<n; i++) {
            System.out.print("Masukan Nama Mahasiswa: ");
            mahasiswa[i] = inputan.next();
            System.out.print("Masukan nilai: ");
            nilai[i] = inputan.nextDouble();
            totalNilai +=nilai[i];
        }

        System.out.print("Nama-nama Mahasiswa yang di input:\n");
        for(int a=0; a<mahasiswa.length; a++) {
            System.out.println(mahasiswa[a]+" :"+nilai[a]);
        }
        nilaiRata = totalNilai/n;
        System.out.println("Nilai rata-rata "+nilaiRata);
        inputan.close();
    }
}
