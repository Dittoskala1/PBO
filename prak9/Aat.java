package prak9;


class Aat {
    private String nama;
    private int stok;
    private int hargaSatuan;
    private int harga;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setStok(int stok) {
        this.stok = stok;
        hitungHarga();
    }

    public void setHargaSatuan(int hargaSatuan) {
        this.hargaSatuan = hargaSatuan;
        hitungHarga();
    }

    public String getNama() {
        return nama;
    }

    public int getStok() {
        return stok;
    }

    public int getHargaSatuan() {
        return hargaSatuan;
    }

    public int getHarga() {
        return harga;
    }

    private void hitungHarga() {
        this.harga = this.stok * this.hargaSatuan;
    }

    public static int hitungTotalHarga(Aat[] aatList) {
        int total = 0;
        for (Aat aat : aatList) {
            total += aat.getHarga();
        }
        return total;
    }
}