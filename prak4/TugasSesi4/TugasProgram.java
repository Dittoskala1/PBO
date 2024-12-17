package TugasSesi4;

import java.util.Scanner; //untuk impor class program

public class TugasProgram {

    public static void main(String[] args) {
        //untuk mengambil input dari pengguna
        Scanner scanner = new Scanner(System.in);
        
        // 1. Tipe Data dan Operator
        System.out.print("Masukkan angka pertama: ");
        int angka1 = scanner.nextInt(); // untuk input user penggunanya 

        System.out.print("Masukkan angka kedua: ");
        int angka2 = scanner.nextInt(); // untuk input user penggunanya angka ke 2

        int hasilTambah = angka1 + angka2;
        int hasilKali = angka1 * angka2;

        // Menampilkan hasil operator
        System.out.println("Hasil penjumlahan: " + hasilTambah); // nampilin hasil penjumlahan
        System.out.println("Hasil perkalian: " + hasilKali);     // nampilin hasil perkalian

        // 2. pengunaan if
        if (hasilTambah > hasilKali) {
            System.out.println("Hasil penjumlahan lebih besar dari hasil perkalian");
        } else {
            System.out.println("Hasil perkalian lebih besar atau sama dengan hasil penjumlahan");
        }

        // 3. penggunaan while loopnya 
        int counter = 0;
        System.out.println("While Loop:");
        while (counter < 3) {
            System.out.println("loop : " + counter);
            counter++; // Operator untuk memilih looping
        }

        // 4. Switch Case
        System.out.print("Masukkan pilihan (1-3): ");
        int pilihan = scanner.nextInt(); // Input dari user  penggunanya 
        System.out.println("Switch Case:");
        switch (pilihan) {
            case 1:
                System.out.println("Pilihan 1");
                break;
            case 2:
                System.out.println("Pilihan 2");
                break;
            case 3:
                System.out.println("Pilihan 3");
                break;
            default:
                System.out.println("Pilihan tidak ada");
                break;
        }

        // 5. For Loop
        System.out.println("For Loop:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Perulangan ke: " + i);
        }

        // 6. Do-While Loop
        int angka = 5;
        System.out.println("Do-While Loop:");
        do {
            System.out.println("Angka: " + angka);
            angka--;
        } while (angka > 0);

        scanner.close();
    }
}
