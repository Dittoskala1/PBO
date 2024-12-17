package function;

import java.util.Scanner;

public class LuasLingkaran {
    public static double hitungLuas(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        // Membuat scanner untuk input dari user
        Scanner scanner = new Scanner(System.in);

        // Meminta user untuk memasukkan nilai jari-jari
        System.out.print("Masukkan jari-jari lingkaran: ");
        double radius = scanner.nextDouble();

        // Menghitung luas lingkaran berdasarkan input user
        double luas = hitungLuas(radius);

        // Menampilkan hasil
        System.out.println("Luas lingkaran dengan jari-jari " + radius + " adalah: " + luas);
        
        // Menutup scanner
        scanner.close();
    }
}
