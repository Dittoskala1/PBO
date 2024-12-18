package QUIZ.Soal1;

    public class Dosen {
    protected String nik;  
    protected String nama;  

    // Constructor
    public Dosen(String nik, String nama) {
        this.nik = nik;
        this.nama = nama;
    }

    // Method untuk mendapatkan NIK
    public String getNik() {
        return nik;
    }

    // Method untuk mendapatkan Nama
    public String getNama() {
        return nama;
    }

    // Method untuk menampilkan data Dosen
    public void view() {
        System.out.println("NIK: " + nik);
        System.out.println("Nama: " + nama);
    }
}
