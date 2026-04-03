import java.util.Scanner;

class Buku {
    private String judulBuku = "Konsep Dasar Pemrograman Java";
    private int stokBuku = 27;
    private int hargaBuku = 75000;
    private String namaPembeli, alamatPembeli;
    private int banyakPembelian, bayarBuku, sisaBuku;

    public void setPembeli(String nama) { this.namaPembeli = nama; }
    public void setAlamat(String alamat) { this.alamatPembeli = alamat; }
    public void setPembelian(int pembelian) { this.banyakPembelian = pembelian; }

    public void hitungBayar() { bayarBuku = hargaBuku * banyakPembelian; }
    public void hitungSisa() { sisaBuku = stokBuku - banyakPembelian; }

    public void tampilkanLaporan() {
        System.out.println("\nLAPORAN PEMBELIAN");
        System.out.println("Nama Pembeli    : " + namaPembeli);
        System.out.println("Alamat Pembeli  : " + alamatPembeli);
        System.out.println("Total Bayar     : Rp " + bayarBuku);
        System.out.println("Stok Akhir Buku : " + sisaBuku + " buah");
    }
}

public class BeliBuku {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Buku b = new Buku();

        System.out.print("Masukkan Nama Pembeli   : ");
        b.setPembeli(sc.nextLine());
        System.out.print("Masukkan Alamat Pembeli : ");
        b.setAlamat(sc.nextLine());
        System.out.print("Banyak Pembelian        : ");
        b.setPembelian(sc.nextInt());

        b.hitungBayar();
        b.hitungSisa();
        b.tampilkanLaporan();
    }
}