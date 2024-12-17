package prak11;

public class Koki extends Pegawai {
    @Override
    public void menampilkan()
    {
        System.out.println("Nama        :"+nama);
        System.out.println("Id pegawai  :"+id_pegawai);
        System.out.println("Gaji        :"+gaji);
    }

    public void tugas()
    {
        System.out.println("Tugas : Memasakn Dan Membuat Minuman ");
        System.out.println("--------------------------------------");
    }
    
}
