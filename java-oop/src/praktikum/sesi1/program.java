package praktikum.sesi1;

import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        // Membuat objek Kalkulator
        Kalkulator kalkulator = new Kalkulator();
        
        // Meminta input pengguna
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan angka pertama: ");
        double angka1 = input.nextDouble();

        System.out.println("Masukkan angka kedua: ");
        double angka2 = input.nextDouble();

        System.out.println("Pilih operasi: (+, -, *, /)");
        char operasi = input.next().charAt(0);

        // Menampilkan hasil operasi
        double hasil = kalkulator.hitung(angka1, angka2, operasi);
        
        if (!Double.isNaN(hasil)) {
            // Memeriksa apakah hasil adalah bilangan bulat atau desimal
            if (hasil == (long) hasil) {
                System.out.println("Hasil: " + String.format("%.0f", hasil));  // Cetak tanpa desimal
            } else {
                System.out.println("Hasil: " + hasil);  // Cetak dengan desimal jika ada
            }
        } else {
            System.out.println("Operasi tidak valid atau terjadi kesalahan.");
        }
    }
}


// Kelas Kalkulator untuk mengelola operasi
class Kalkulator {
    private KalkulatorOperasi operasi;  // Memisahkan tanggung jawab operasi

    // Konstruktor
    public Kalkulator() {
        operasi = new KalkulatorOperasi();
    }

    // Metode untuk melakukan perhitungan berdasarkan operasi yang dipilih
    public double hitung(double angka1, double angka2, char operator) {
        switch (operator) {
            case '+':
                return operasi.tambah(angka1, angka2);
            case '-':
                return operasi.kurang(angka1, angka2);
            case '*':
                return operasi.kali(angka1, angka2);
            case '/':
                return operasi.bagi(angka1, angka2);
            default:
                System.out.println("Operasi tidak valid");
                return Double.NaN;  // Mengembalikan nilai NaN jika operasi tidak valid
        }
    }
}

// Kelas operasi kalkulator yang hanya menangani perhitungan
class KalkulatorOperasi {

    // Metode untuk operasi penjumlahan
    public double tambah(double a, double b) {
        return a + b;
    }

    // Metode untuk operasi pengurangan
    public double kurang(double a, double b) {
        return a - b;
    }

    // Metode untuk operasi perkalian
    public double kali(double a, double b) {
        return a * b;
    }

    // Metode untuk operasi pembagian dengan validasi
    public double bagi(double a, double b) {
        if (b == 0) {
            System.out.println("Tidak bisa membagi dengan nol.");
            return Double.NaN;  // Menggunakan Double.NaN untuk hasil yang tidak valid
        }
        return a / b;
    }
}
