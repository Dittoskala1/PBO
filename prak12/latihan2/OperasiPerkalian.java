package prak12.latihan2;

public class OperasiPerkalian extends OperasiBilangan {
    
    @Override
    protected void set_C() {
        c = a * b;
    }

    @Override
    protected void tampil() {
        set_C();
        System.out.println("Perkalian: " + a + " * " + b + " = " + c);
    }
    
}
