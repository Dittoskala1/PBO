package function;
import java.util.Scanner;


public class JumlahArray {
    public static int jumlahkanArray(int[] arr) {
        int total = 0;
        for (int num : arr) {
            total += num;
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Masukkan elemen array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int hasil = jumlahkanArray(arr);
        System.out.println("Total penjumlahan elemen array: " + hasil);
        
        scanner.close();
    }
}

    
