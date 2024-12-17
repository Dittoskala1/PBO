package prak10;

public class Mamalia extends Hewan {
    protected String berkembangbiak;

    public Mamalia() {
        this.berkembangbiak = "beranak";
    }

    public void cetak() {
        System.out.println("Mamalia berkembang biak " + berkembangbiak);
    }
}

class Sapi extends Mamalia {
    private String nama;
    private String umur;

    public Sapi() {
        suara = "Hemoh..";
        berkembangbiak = "beranak";
        this.nama = "Sopi";
        this.umur = "1";
    }

    public void cetak() {
        System.out.println("=========== Data Hewan Mamalia ===========");
        System.out.println("Suara                 :" + suara);
        System.out.println("Berkembang Biak       :" + berkembangbiak);
        System.out.println("Nama                  :" + nama);
        System.out.println("Umur                  :" + umur + " tahun");
    }
}

class Kambing extends Mamalia {
    private String nama;
    private String umur;

    public Kambing() {
        suara = "Embek...";
        berkembangbiak = "beranak";
        this.nama = "Si Ling";
        this.umur = "2";
    }

    public void cetak() {
        System.out.println("=========== Data Hewan Mamalia Kambing ===========");
        System.out.println("Suara                 :" + suara);
        System.out.println("Berkembang Biak       :" + berkembangbiak);
        System.out.println("Nama                  :" + nama);
        System.out.println("Umur                  :" + umur + " tahun");
    }
}

class Unggas extends Hewan {
    protected String BerkembangBiak;

    public Unggas() {
        this.BerkembangBiak = "Bertelur";
    }

    public void cetak() {
        System.out.println("Bertelur");
    }
}

class Burung extends Unggas {
    private String jenis;
    private String ciri;

    public Burung() {
        suara = "Mbekur...";
        BerkembangBiak = "Bertelur";
        this.jenis = "Merpati";
        this.ciri = "Bulu Putih";
    }

    public void cetak() {
        System.out.println("===== Data Hewan Unggas Burung =====");
        System.out.println("Suara          :" + suara);
        System.out.println("Berkembang Biak:" + BerkembangBiak);
        System.out.println("Jenis          :" + jenis);
        System.out.println("Ciri           :" + ciri);
    }
}

class Ayam extends Unggas {
    private String jenis;
    private String ciri;

    public Ayam() {
        suara = "Kukuruyuk...";
        BerkembangBiak = "Bertelur";
        this.jenis = "Ayam Kampung";
        this.ciri = "Bulu bercorak putih hitam";
    }

    public void cetak() {
        System.out.println("===== Data Hewan Unggas Ayam =====");
        System.out.println("Suara          :" + suara);
        System.out.println("Berkembang Biak:" + BerkembangBiak);
        System.out.println("Jenis          :" + jenis);
        System.out.println("Ciri           :" + ciri);
    }
}

class Ikan extends Hewan {
    protected String napas;

    public Ikan() {
        this.napas = "insang";
    }

    public void cetak() {
        System.out.println("Insang");
    }
}

class Gurami extends Ikan {
    private String berat;
    private String ciri;

    public Gurami() {
        suara = "Blub... Blub...";
        napas = "Insang";
        this.berat = "1.5";
        this.ciri = "Besar dan berwarna abu-abu";
    }

    public void cetak() {
        System.out.println("===== Data Hewan Ikan Gurami =====");
        System.out.println("Suara          :" + suara);
        System.out.println("Bernapas       :" + napas);
        System.out.println("Berat          :" + berat + " Kg");
        System.out.println("Ciri           :" + ciri);
    }
}

class Lele extends Ikan {
    private String berat;
    private String ciri;

    public Lele() {
        suara = "Blup Blup...";
        napas = "Insang";
        this.berat = "3";
        this.ciri = "Berwarna hitam keputihan";
    }

    public void cetak() {
        System.out.println("===== Data Hewan Ikan Lele =====");
        System.out.println("Suara          :" + suara);
        System.out.println("Bernapas       :" + napas);
        System.out.println("Berat          :" + berat + " Kg");
        System.out.println("Ciri           :" + ciri);
    }
}

class Pewarisan {
    public static void main(String[] args) {
        Sapi spl = new Sapi();
        spl.cetak();

        System.out.println("");
        Kambing kmb1 = new Kambing();
        kmb1.cetak();

        System.out.println("");
        Burung brg1 = new Burung();
        brg1.cetak();

        System.out.println("");
        Ayam aym1 = new Ayam();
        aym1.cetak();

        System.out.println("");
        Gurami grm1 = new Gurami();
        grm1.cetak();

        System.out.println("");
        Lele ll1 = new Lele();
        ll1.cetak();
    }
}
