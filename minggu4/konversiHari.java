package minggu4;

import java.util.Scanner;

public class konversiHari {
     public static void main(String[] args) throws Exception {
       
        Scanner sc = new Scanner(System.in);
        String day, dayInEnglish;
        System.out.print("Masukan Nama Hari: ");
        day = sc.nextLine().toLowerCase();

        switch (day) {
            case "senin":
                dayInEnglish = "Monday";
                break;
            case "selasa":
                dayInEnglish = "Tuesday";
                 break;
            case "rabu":
                dayInEnglish = "Wednesday";
                 break;
             case "kamis":
                dayInEnglish = "Thrusday";
                 break;
            case "jumat":
                dayInEnglish = "Friday";
                 break;
             case "sabtu":
                 dayInEnglish = "Saturday";
                  break;
             case "minggu":
                  dayInEnglish = "Sunday";
                   break;
            default:
                dayInEnglish = "Invalid Day";
                break;
                }
        System.out.println("Hari dalam Bahasa Inggris: "+dayInEnglish);
        sc.close();
    }
}