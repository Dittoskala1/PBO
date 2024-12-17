package function;
import java.util.Scanner;


public class Fibonacci {
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        // Membuat scanner untuk input dari user
        Scanner scanner = new Scanner(System.in);

        // Meminta user untuk memasukkan nilai n
        System.out.print("Masukkan nilai n untuk menghitung Fibonacci: ");
        int n = scanner.nextInt();

        // Menghitung bilangan Fibonacci ke-n berdasarkan input user
        int hasil = fibonacci(n);

        // Menampilkan hasil
        System.out.println("Bilangan Fibonacci ke-" + n + " adalah: " + hasil);
        
        // Menutup scanner
        scanner.close();
    }
}

    

