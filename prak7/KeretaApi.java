package prak7;

class KeretaApi {
    int kecepatan;
    String namaPenumpang;
    String tujuanPenumpang;
    String jenisKereta;

    // Konstruktor dengan parameter
    public KeretaApi(int kecepatan, String namaPenumpang, String tujuanPenumpang, String jenisKereta) {
        this.kecepatan = kecepatan;
        this.namaPenumpang = namaPenumpang;
        this.tujuanPenumpang = tujuanPenumpang;
        this.jenisKereta = jenisKereta;
    }

    // Konstruktor tanpa parameter
    public KeretaApi() {}

    // Metode untuk mencetak atribut kereta
    void cetakAtribut() {
        System.out.println("Kecepatan Kereta = " + kecepatan + " km/jam");
        System.out.println("Nama Penumpang = " + namaPenumpang);
        System.out.println("Tujuan Penumpang = " + tujuanPenumpang);
        System.out.println("Jenis Kereta = " + jenisKereta);
    }

    public static class ClassKeretaApi {

        public static void main(String[] args) {
            // Membuat objek KeretaApi
            KeretaApi keretaKu = new KeretaApi();
            keretaKu.kecepatan = 80;
            keretaKu.namaPenumpang = "Ditto";
            keretaKu.tujuanPenumpang = "Yogyakarta";
            keretaKu.jenisKereta = "Eksekutif";

            // Mencetak atribut kereta
            keretaKu.cetakAtribut();
        }
    }
}
