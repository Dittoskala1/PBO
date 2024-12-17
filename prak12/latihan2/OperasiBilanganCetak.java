package prak12.latihan2;

public class OperasiBilanganCetak {
    private void cetakSemua(OperasiBilangan[] OB, double a, double b) {
        for (OperasiBilangan operasi : OB) {
            operasi.set_A(a);
            operasi.set_B(b);
            operasi.tampil();
        }
    }

    public static void main(String[] args) {
        double A = 10.5;
        double B = 0.5;

        OperasiBilangan[] operasiBilangan = {
            new OperasiPenjumlahan(),
            new OperasiPengurangan(),
            new OperasiPerkalian(),
            new OperasiPembagian()
        };

        OperasiBilanganCetak cetak = new OperasiBilanganCetak();
        cetak.cetakSemua(operasiBilangan, A, B);
    }
}
