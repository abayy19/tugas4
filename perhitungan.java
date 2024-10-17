import java.util.Scanner;

public class perhitungan {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Konversi celcius ke fahrenheit
        System.out.print("Masukan suhu dalam Celcius ");
        Double celcius = input.nextDouble();
        Double fahrenheit = (celcius * 9 / 5) + 32;
        System.out.println("Suhu dalam Fahrenheit: " + fahrenheit);

        // Menghitung keliling lingkaran
        System.out.print("Masukan jari-jari lingkaran ");
        Double jariJari = input.nextDouble();
        Double keliling = 2 * Math.PI * jariJari;
        System.out.println("Keliling lingkaran: " + keliling);

        // Menghitung luas persegi panjang
        System.out.print(" Masukan panjang persegi panjang ");
        Double panjang = input.nextDouble();
        System.out.print("Masukan lebar persegi panjang ");
        Double lebar = input.nextDouble();
        Double luas = panjang * lebar;
        System.out.println("Luas persegi panjang: " + luas);

        // Menghitung volume kubus
        System.out.print("Masukan sisi kubus ");
        Double sisi = input.nextDouble();
        Double volume = sisi * sisi * sisi;
        System.out.println("Volume kubus: " + volume);

        input.close();
    }
}