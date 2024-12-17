package prak12.latihan2;

public class OperasiPenjumlahan extends OperasiBilangan {

    @Override
    protected void set_C() {
        c = a + b; // Menghitung hasil penjumlahan
    }

    @Override
    protected void tampil() {
        set_C(); // Memastikan c diperbarui sebelum ditampilkan
        System.out.println("Penjumlahan: " + a + " + " + b + " = " + c);
    }
}
