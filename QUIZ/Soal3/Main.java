package QUIZ.Soal3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Phone xiaomi = new Xiaomi();
        PhoneUser user = new PhoneUser(xiaomi);

        int choice;
        do {
            System.out.println("\nPilih aksi:");
            System.out.println("1. Nyalakan HP");
            System.out.println("2. Matikan HP");
            System.out.println("3. Perbesar volume");
            System.out.println("4. Perkecil volume");
            System.out.println("5. Keluar");
            System.out.print("Pilihan: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    user.turnOnThePhone();
                    break;
                case 2:
                    user.turnOffThePhone();
                    break;
                case 3:
                    user.makePhoneLouder();
                    break;
                case 4:
                    user.makePhoneSilent();
                    break;
                case 5:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (choice != 5);

        input.close();
    }
}
