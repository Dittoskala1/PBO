package Sesi4;
import java.util.Scanner;

public class Kasir {
    public static void main(String[] args){
        //deklarasi variable dan scanner 
        int belanjaan, diskon, bayar;
        String kartu;
        Scanner scan = new Scanner(System.in);
        //mengambiil input
        System.out.print("Apakah ada kartu member: ");
        kartu = scan.nextLine();
        System.out.print("Total belanjaan: ");
        belanjaan = scan.nextInt();
        //prosess
        if (kartu.equalsIgnoreCase("ya")){
            if (belanjaan > 500000){
                diskon = 50000;
            }else if (belanjaan > 100000){
                diskon = 15000;
            }else {
                diskon = 0;
            }
        } else {
            if (belanjaan > 100000){
                diskon = 5000;
            }else {
                diskon = 0;
            }
        }
        // total yang harus di bayar
        bayar = belanjaan - diskon;
        //output 
        System.out.println("Total Bayar : Rp. " + bayar);
    }
}
