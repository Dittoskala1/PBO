package prak12.latihan2;

public class OperasiPembagian extends OperasiBilangan {
    @Override
    protected void set_C() {
        if (b != 0) {
            c = a / b;
        } else {
            System.out.println("Error: Pembagian dengan nol tidak diperbolehkan.");
            c = 0;
        }
    }

    @Override
    protected void tampil() {
        set_C();
        System.out.println("Pembagian: " + a + " / " + b + " = " + c);
    }
    
}
