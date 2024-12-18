package QUIZ.Soal2;

public class Main {
    public static void main(String[] args) {
        // Membuat objek Bayar dengan ID Gojek dan Nama Pelanggan
        Bayar transaksi = new Bayar(56789, "Adytia Kusuma");

        transaksi.setData(); // Set data transaksi
        transaksi.tampil();  // Tampilkan semua data
    }
}
