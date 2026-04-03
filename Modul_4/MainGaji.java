
class GajiPegawai {
    private double gajikotor, pajak, gajiBersih; 
    private double potongan = 75000; 
    private String nama = "Surya"; 

    public void setGaji(double gaji) { gajikotor = gaji; } 
    public void hitungPajak() { pajak = 0.2 * gajikotor; } 
    public void hitungGaji() { gajiBersih = gajikotor - pajak - potongan; } 
    
    public String namaPegawai() { return nama; } 
    public double getGajiBersih() { return gajiBersih; } 
}

public class MainGaji {
    public static void main(String[] args) {
        GajiPegawai g = new GajiPegawai();
        g.setGaji(5000000);
        g.hitungPajak();
        g.hitungGaji();
        
        System.out.println("Nama Pegawai: " + g.namaPegawai());
        System.out.println("Gaji Bersih: Rp " + g.getGajiBersih());
    }
}