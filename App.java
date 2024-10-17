import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
       Scanner inputan = new Scanner(System.in);
       int yearNow = 2024;
       System.out.println("Masukan tahun lahir anda: ");
       int yearBorn = inputan.nextInt();
       int age = yearNow - yearBorn;
       inputan.close();
       System.out.println(" I am" + age + " years old."); 
    }
}
