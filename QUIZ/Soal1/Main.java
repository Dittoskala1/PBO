package QUIZ.Soal1;

// File: Main.java
public class Main {
    public static void main(String[] args) {
        // Membuat objek dari kelas Dosen
        Dosen dosen = new Dosen("1212", "Dr.Daus");
        System.out.println("Data Dosen:");
        dosen.view();
        System.out.println();

        // Membuat objek dari kelas Rektor
        Rektor rektor = new Rektor("18234", "Prof. Ditto", 2020);
        System.out.println("Data Rektor:");
        rektor.viewRektor();
        System.out.println();

        // Membuat objek dari kelas Dekan
        Dekan dekan = new Dekan("2020", "Dr.Gibran ", "Teknik Informatika");
        System.out.println("Data Dekan:");
        dekan.viewDekan();
    }
}
