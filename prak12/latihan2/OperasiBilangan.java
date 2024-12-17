package prak12.latihan2;

public abstract class OperasiBilangan {
    protected double a, b, c;

    // Setter untuk nilai a
    protected void set_A(double a) {
        this.a = a;
    }

    // Setter untuk nilai b
    protected void set_B(double b) {
        this.b = b;
    }

    // Setter untuk nilai c (dihitung di kelas turunan)
    protected void set_C() {
        // Implementasi di kelas turunan
    }

    // Getter untuk nilai a
    protected double get_A() {
        return a;
    }

    // Getter untuk nilai b
    protected double get_B() {
        return b;
    }

    // Getter untuk nilai c
    protected double get_C() {
        return c;
    }

    // Metode abstrak untuk menampilkan hasil
    protected abstract void tampil();
}
