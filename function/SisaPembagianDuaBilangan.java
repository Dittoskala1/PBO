package function;
   
import java.util.Scanner;

public class SisaPembagianDuaBilangan {
    public static int hitungSisa(int a, int b) {
        return a % b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan bilangan pertama: ");
        int a = scanner.nextInt();
        System.out.print("Masukkan bilangan kedua: ");
        int b = scanner.nextInt();

        int sisa = hitungSisa(a, b);
        System.out.println("Sisa hasil pembagian " + a + " dan " + b + " adalah: " + sisa);

        scanner.close();
    }
}

    
