package prak9C;

public class Main {
    public static void main(String[] args) {
        // Membuat objek Jurusan
        Jurusan jurusanInformatika = new Jurusan("Informatika", "IF123");

        // Membuat objek Mahasiswa2
        Mahasiswa2 mahasiswa1 = new Mahasiswa2("Ahmad", "12345678", 21, jurusanInformatika);
        Mahasiswa2 mahasiswa2 = new Mahasiswa2("Budi", "87654321", 22, jurusanInformatika);

        // Membuat objek Kelas
        Kelas kelasPemrograman = new Kelas("Pemrograman Java", "PJ101");
        Kelas kelasBasisData = new Kelas("Basis Data", "BD102");

        // Menambahkan Mahasiswa2 ke dalam Kelas
        kelasPemrograman.addMahasiswa(mahasiswa1);  // Ubah ke addMahasiswa
        kelasPemrograman.addMahasiswa(mahasiswa2);  // Ubah ke addMahasiswa
        kelasBasisData.addMahasiswa(mahasiswa1);    // Ubah ke addMahasiswa

        // Menampilkan data Mahasiswa2
        System.out.println("Informasi Mahasiswa2:");
        mahasiswa1.displayInfo();
        mahasiswa2.displayInfo();

        // Menampilkan data Kelas
        System.out.println("\nInformasi Kelas:");
        kelasPemrograman.displayInfo();
        kelasBasisData.displayInfo();
    }
}
