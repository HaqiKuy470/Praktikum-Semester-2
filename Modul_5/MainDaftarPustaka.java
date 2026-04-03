import java.util.Scanner;

public class MainDaftarPustaka {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("--- INPUT IDENTITAS BUKU ---");
        System.out.print("Judul Buku    : "); String judul = input.nextLine();
        System.out.print("Penyusun      : "); String nama = input.nextLine();
        System.out.print("Kota Terbit   : "); String kota = input.nextLine();
        System.out.print("Penerbit      : "); String penerbit = input.nextLine();
        System.out.print("Tahun Terbit  : "); int tahun = input.nextInt();

        Buku myBuku = new Buku(nama, tahun);

        myBuku.setInfo(judul);
        myBuku.setInfo(kota, penerbit);
        
        myBuku.tampilkan();
    }
}
