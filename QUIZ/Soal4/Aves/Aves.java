package QUIZ.Soal4.Aves;

import QUIZ.Soal4.Abstrak.Animal;
import QUIZ.Soal4.Interfaces.AvesInterface;

public class Aves extends Animal implements AvesInterface {
    private String jenisAves;
    private Boolean bisaTerbang;

    public Aves(String nama, int ukuran) {
        super(nama, ukuran);
    }

    // Implementasi metode abstrak dari Animal
    @Override
    public void setNama(String nama) {
        this.nama = nama;
    }

    @Override
    public String getNama() {
        return nama;
    }

    @Override
    public void setUkuran(int ukuran) {
        this.ukuran = ukuran;
    }

    @Override
    public int getUkuran() {
        return ukuran;
    }

    @Override
    public void setSifat(String sifat) {
        this.sifat = sifat;
    }

    @Override
    public String getSifat() {
        return sifat;
    }

    // Implementasi metode dari AvesInterface
    @Override
    public void setJenisAves(String jenisAves) { 
        this.jenisAves = jenisAves; 
    }

    @Override
    public String getJenisAves() { 
        return jenisAves; 
    }

    @Override
    public void setBisaTerbang(Boolean bisaTerbang) { 
        this.bisaTerbang = bisaTerbang; 
    }

    @Override
    public Boolean getBisaTerbang() { 
        return bisaTerbang; 
    }
}
