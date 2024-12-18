package QUIZ.Soal4;

import QUIZ.Soal4.Aves.Ayam;
import QUIZ.Soal4.Aves.Merpati;
import QUIZ.Soal4.Mamalia.Mamalia;

public class Main {
    public static void main(String[] args) {
        // Mamalia
        Mamalia kucing = new Mamalia("Kucing", 50);
        kucing.setSifat("Lucu");
        kucing.setBisaMelahirkan(true);
        System.out.println("Nama Mamalia: " + kucing.getNama());
        System.out.println("Sifat: " + kucing.getSifat());
        System.out.println("Bisa Melahirkan: " + kucing.getBisaMelahirkan());

        // Ayam
        Ayam ayamBangkok = new Ayam("Ayam Bangkok", 60);
        ayamBangkok.setJenisAyam("Petarung");
        ayamBangkok.setBisaDiadu(true);
        System.out.println("\nNama Ayam: " + ayamBangkok.getNama());
        System.out.println("Jenis Ayam: " + ayamBangkok.getJenisAyam());
        System.out.println("Bisa Diadu: " + ayamBangkok.getBisaDiadu());

        // Merpati
        Merpati merpatiPos = new Merpati("Merpati Pos", 30);
        merpatiPos.setBisaTerbang(true);
        System.out.println("\nNama Merpati: " + merpatiPos.getNama());
        System.out.println("Bisa Terbang: " + merpatiPos.getBisaTerbang());
    }
}