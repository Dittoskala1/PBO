package prak11;

public class Main {
    public static void main(String[] args) {
        // Membuat objek dari masing-masing kelas
        Manajer manajer = new Manajer();
        Kasir kasir = new Kasir();
        Koki koki = new Koki();
        Pelayan pelayan = new Pelayan();
        Satpam satpam = new Satpam();

        // Mengisi data untuk setiap objek
        manajer.nama = "Syifa";
        manajer.id_pegawai = 1;
        manajer.gaji = "7 Juta";

        kasir.nama = "Aldi";
        kasir.id_pegawai = 2;
        kasir.gaji = "1,2 Juta";

        koki.nama = "Reza";
        koki.id_pegawai = 3;
        koki.gaji = "2 Juta";

        pelayan.nama = "Dean";
        pelayan.id_pegawai = 4;
        pelayan.gaji = "1,2 Juta";

        satpam.nama = "Aldi";
        satpam.id_pegawai = 5;
        satpam.gaji = "1 Juta";

        // Menampilkan data dan tugas
        manajer.menampilkan();
        manajer.tugas();

        kasir.menampilkan();
        kasir.tugas();

        koki.menampilkan();
        koki.tugas();

        pelayan.menampilkan();
        pelayan.tugas();

        satpam.menampilkan();
        satpam.tugas();
    }
}
