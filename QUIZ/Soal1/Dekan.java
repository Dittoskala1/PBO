package QUIZ.Soal1;

// File: Dekan.java
public class Dekan extends Dosen {
    private String fakultas;  // Atribut fakultas

    // Constructor
    public Dekan(String nik, String nama, String fakultas) {
        super(nik, nama);  // Memanggil constructor Dosen
        this.fakultas = fakultas;
    }

    // Method untuk mendapatkan Fakultas
    public String getFakultas() {
        return fakultas;
    }

    // Method untuk menampilkan data Dekan
    public void viewDekan() {
        view();  // Memanggil method view() dari kelas Dosen
        System.out.println("Fakultas: " + fakultas);
    }
}
