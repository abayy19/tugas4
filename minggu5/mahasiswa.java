class Mahasiswa {
    String nama;
    String NIM;
    String nilai;

    public Mahasiswa(String nim, String nama, Double nilai) {
        this.NIM = nim;
        this.nama = nama;
        this.nilai = nilai;
    }
}

package minggu5;

public class mahasiswa {
     public static void main(String[] args) {
        Mahasiswa mhs[] = new Mahasiswa[2];
        mhs[0] = new Mahasiswa(389986, abayy, 90.0);
        mhs[1] = new Mahasiswa(223244, yuyi, 100.0);

        System.out.println("NIM\t\tNama\t\tNilai");
        System.out.println("===========================");
        for(Mahasiswa s : mhs) {
            System.out.println(s.NIM+"\t"+s.nama+"\t"+s.nilai);
        }
    }
}
