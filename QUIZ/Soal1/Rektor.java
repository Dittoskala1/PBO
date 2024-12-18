package QUIZ.Soal1;

// File: Rektor.java
public class Rektor extends Dosen {
    private int tahunMasuk;  // Atribut tahunMasuk

    // Constructor
    public Rektor(String nik, String nama, int tahunMasuk) {
        super(nik, nama);  // Memanggil constructor Dosen
        this.tahunMasuk = tahunMasuk;
    }

    // Method untuk mendapatkan Tahun Masuk
    public int getTahunMasuk() {
        return tahunMasuk;
    }

    // Method untuk menampilkan data Rektor
    public void viewRektor() {
        view();  // Memanggil method view() dari kelas Dosen
        System.out.println("Tahun Masuk: " + tahunMasuk);
    }
}

