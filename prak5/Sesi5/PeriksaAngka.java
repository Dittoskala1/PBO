package Sesi5;

import java.util.Scanner;

public class PeriksaAngka {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Masukkan sebuah angka: ");
        double angka = scanner.nextDouble();

        
        if (angka > 0) {
            System.out.println("Angka tersebut adalah angka positif.");
        } else if (angka < 0) {
            System.out.println("Angka tersebut adalah angka negatif.");
        } else {
            System.out.println("Angka tersebut adalah nol.");
        }

    
        scanner.close();
    }
}
