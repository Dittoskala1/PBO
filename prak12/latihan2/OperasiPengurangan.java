package prak12.latihan2;

public class OperasiPengurangan extends OperasiBilangan {
    @Override
    protected void set_C() {
        c = a - b;
    }

    @Override
    protected void tampil() {
        set_C();
        System.out.println("Pengurangan: " + a + " - " + b + " = " + c);
    }
}