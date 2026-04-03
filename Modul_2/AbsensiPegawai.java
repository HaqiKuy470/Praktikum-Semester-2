import java.util.Scanner;

public class AbsensiPegawai {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int jumlahPegawai = 0;
        int pilihan = 0;

        do {
            System.out.println("\n--- Menu Absensi ---");
            System.out.println("1. Menambah pegawai");
            System.out.println("2. Melihat jumlah pegawai yang masuk");
            System.out.println("3. Keluar (exit)");
            System.out.print("Pilih menu: ");
            pilihan = in.nextInt();

            switch (pilihan) {
                case 1:
                    jumlahPegawai++;
                    System.out.println("Pegawai berhasil ditambahkan!");
                    break;
                case 2:
                    System.out.println("Jumlah pegawai yang masuk: " + jumlahPegawai);
                    break;
                case 3:
                    System.out.println("Keluar dari program...");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 3);
    }
}