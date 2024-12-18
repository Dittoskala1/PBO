package QUIZ.Soal2;

public class Bayar extends Gojek {
    private int jarak;
    private int total;
    private String nama;
    private int idGojek;  // Tambahkan atribut ID Gojek
    private String namaPelanggan; // Tambahkan nama pelanggan

    public Bayar() {
        super(); // Panggil constructor superclass
        this.jarak = 0;
        this.total = 0;
        this.nama = "Ditto";
        this.idGojek = 0; // Default ID Gojek
        this.namaPelanggan = "Tidak Diketahui";
    }

    public Bayar(int idGojek, String namaPelanggan) {
        super(); // Panggil constructor superclass
        this.idGojek = idGojek;
        this.namaPelanggan = namaPelanggan;
    }

    @Override
    public void setData() {
        super.setData(); // Set data superclass
        this.jarak = 10; // Contoh jarak
        this.total = harga * jarak; // Hitung total
        this.nama = "Budi Santoso";
        this.idGojek = 98765; // ID Gojek contoh
        this.namaPelanggan = "Adi Kusuma"; // Nama pelanggan contoh
    }

    @Override
    public void tampil() {
        System.out.println("Nama Pelanggan: " + namaPelanggan);
        System.out.println("ID Gojek: " + idGojek);
        System.out.println("Nama: " + nama);
        System.out.println("ID: " + id);
        System.out.println("Jarak: " + jarak + " km");
        System.out.println("Total Bayar: Rp " + total);
    }

    @Override
    public int getId() {
        return this.id;
    }
}
