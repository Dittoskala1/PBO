package function;
import java.util.Scanner;

public class TahunKabisat {
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan tahun: ");
        int year = scanner.nextInt();

        if (isLeapYear(year)) {
            System.out.println(year + " adalah tahun kabisat.");
        } else {
            System.out.println(year + " bukan tahun kabisat.");
        }

        scanner.close();
    }
}

    

