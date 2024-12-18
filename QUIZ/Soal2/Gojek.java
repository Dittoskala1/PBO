package QUIZ.Soal2;

public class Gojek {
    protected int harga;
    protected int id;

    // Constructor
    public Gojek() {
        this.harga = 2000; // Harga default per km
        this.id = 0;
    }

    // Method untuk set data
    public void setData() {
        this.harga = 2500; // Harga default yang bisa diubah
        this.id = 12345;   // ID default
    }

    // Method untuk tampilkan data
    public void tampil() {
        System.out.println("ID: " + id);
        System.out.println("Harga per KM: Rp " + harga);
    }

    // Method getId
    public int getId() {
        return this.id;
    }
}
