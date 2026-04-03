public class TestMahasiswa {
    public static void main(String[] args) {
        Mahasiswa MHS = new Mahasiswa();
        System.out.println("IDENTITAS AWAL: ");
        MHS.cetak();
        
        MHS.ubah("DITA", 2010, "Madiun");
        System.out.println("\nIDENTITAS AKHIR: ");
        MHS.cetak();
    }
}