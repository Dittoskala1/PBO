package function;
    import java.util.Scanner;

public class MaxArray {
    public static int cariMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta user untuk memasukkan jumlah elemen array
        System.out.print("Masukkan jumlah elemen array: ");
        int n = scanner.nextInt();

        // Membuat array dengan ukuran n
        int[] arr = new int[n];

        // Meminta user untuk memasukkan elemen array satu per satu
        System.out.println("Masukkan elemen array:");
        for (int i = 0; i < n; i++) {
            System.out.print("Elemen ke-" + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        // Mencari nilai maksimum
        int max = cariMax(arr);
        System.out.println("Nilai maksimum dari array adalah: " + max);

        // Menutup scanner
        scanner.close();
    }
}
