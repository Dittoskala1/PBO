package function;


import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class SelisihDuaTanggal {
    public static long hitungSelisihTanggal(LocalDate tanggal1, LocalDate tanggal2) {
        return ChronoUnit.DAYS.between(tanggal1, tanggal2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan tanggal pertama (YYYY-MM-DD): ");
        String input1 = scanner.nextLine();
        LocalDate tanggal1 = LocalDate.parse(input1);
        
        System.out.print("Masukkan tanggal kedua (YYYY-MM-DD): ");
        String input2 = scanner.nextLine();
        LocalDate tanggal2 = LocalDate.parse(input2);
        
        long selisih = hitungSelisihTanggal(tanggal1, tanggal2);
        System.out.println("Selisih hari antara tanggal tersebut adalah: " + selisih + " hari");

        scanner.close();
    }
}

    
