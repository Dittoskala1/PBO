package prak9C;

import java.util.ArrayList;
import java.util.List;

public class Kelas {
    private String namaKelas;
    private String kodeKelas;
    private List<Mahasiswa2> mahasiswaList;

    public Kelas(String namaKelas, String kodeKelas) {
        this.namaKelas = namaKelas;
        this.kodeKelas = kodeKelas;
        this.mahasiswaList = new ArrayList<>();
    }

    public String getNamaKelas() {
        return namaKelas;
    }

    public String getKodeKelas() {
        return kodeKelas;
    }

    // Menambahkan Mahasiswa ke dalam Kelas
    public void addMahasiswa(Mahasiswa2 mahasiswa) {
        if (!mahasiswaList.contains(mahasiswa)) {
            mahasiswaList.add(mahasiswa);
        }
    }

    // Metode untuk menampilkan informasi kelas
    public void displayInfo() {
        System.out.println("Nama Kelas: " + namaKelas);
        System.out.println("Kode Kelas: " + kodeKelas);
        System.out.println("Daftar Mahasiswa:");
        for (Mahasiswa2 mhs : mahasiswaList) {
            System.out.println("- " + mhs.getNama() + " (" + mhs.getNim() + ")");
        }
    }
}
