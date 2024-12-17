package prak11;

public class Satpam extends Pegawai {
    @Override
    public void menampilkan()
    {
        System.out.println("Nama        :"+nama);
        System.out.println("Id pegawai  :"+id_pegawai);
        System.out.println("Gaji        :"+gaji);
    }

    public void tugas()
    {
        System.out.println("Tugas : Menjaga keamanan di dalam dan diluar frenchise ");
        System.out.println("-------------------------------------------------------");
    }
    
}
