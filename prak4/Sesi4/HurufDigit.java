package Sesi4;
import java.util.Scanner;
public class HurufDigit {
    /**
     * @param args
     */
    
     public static void main(String[] args){
        //Membuat variable dan scanner
        char karakter;
        Scanner scan = new Scanner(System.in);

        //Mengambil input
        System.out.print("Masukan sebuah karakter :");
        karakter = scan.nextLine().charAt(0);

        if ((karakter >= 'A') && (karakter <= 'Z') || (karakter >= 'a') && (karakter <='z')){
            System.out.println(karakter + " adalah huruf");
        }else if ((karakter >='0') && (karakter <='9')){
            System.out.println(karakter + " adalah digit");
        }else{
            System.out.println(karakter + " buka huruf atau digit");
        }
     }
    
}