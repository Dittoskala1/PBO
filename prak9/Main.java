package prak9;

public class Main {
    public static void main(String[] args) {
        // Alat tulis instances
        Aat bolpoin = new Aat();
        bolpoin.setNama("Bolpoin");
        bolpoin.setStok(10);
        bolpoin.setHargaSatuan(2000);

        Aat pensil = new Aat();
        pensil.setNama("Pensil");
        pensil.setStok(10);
        pensil.setHargaSatuan(1000);

        Aat penghapus = new Aat();
        penghapus.setNama("Penghapus");
        penghapus.setStok(10);
        penghapus.setHargaSatuan(500);

        Aat[] aatList = {bolpoin, pensil, penghapus};

        // Display alat tulis details
        System.out.println("Alat Tulis:");
        for (Aat aat : aatList) {
            System.out.println("Nama: " + aat.getNama());
            System.out.println("Stok: " + aat.getStok());
            System.out.println("Harga Satuan: Rp. " + aat.getHargaSatuan());
            System.out.println("Harga (stok x harga satuan): Rp. " + aat.getHarga());
            System.out.println();
        }

        int totalHargaAlatTulis = Aat.hitungTotalHarga(aatList);
        System.out.println("Total Harga jika semua alat tulis terjual: Rp. " + totalHargaAlatTulis);
        System.out.println();

        // Sepatu instances
        Shoe sneaker = new Shoe();
        sneaker.setName("Sneaker");
        sneaker.setSize(42);
        sneaker.setStock(3);
        sneaker.setUnitPrice(750000);

        Shoe boots = new Shoe();
        boots.setName("Boots");
        boots.setSize(44);
        boots.setStock(8);
        boots.setUnitPrice(1200000);

        Shoe sandals = new Shoe();
        sandals.setName("Sandals");
        sandals.setSize(40);
        sandals.setStock(2);
        sandals.setUnitPrice(300000);

        Shoe[] shoeList = {sneaker, boots, sandals};

        // Display sepatu details
        System.out.println("Sepatu:");
        for (Shoe shoe : shoeList) {
            System.out.println("Name: " + shoe.getName());
            System.out.println("Size: " + shoe.getSize());
            System.out.println("Stock: " + shoe.getStock());
            System.out.println("Unit Price: Rp. " + shoe.getUnitPrice());
            System.out.println("Total Price (stock x unit price): Rp. " + shoe.getTotalPrice());
            System.out.println("Stock Status: " + shoe.getStockStatus());
            System.out.println();
        }

        int totalEarningsSepatu = Shoe.calculateTotalEarnings(shoeList);
        System.out.println("Total Earnings if all shoes are sold: Rp. " + totalEarningsSepatu);
    }
}
