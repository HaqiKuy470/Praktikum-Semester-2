import java.util.Scanner;

public class Haqi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan;
        boolean lanjut = true;

        do {
            System.out.println("\n=== PROGRAM BELAJAR JAVA ===");
            System.out.println("1. Hitung Mundur");
            System.out.println("2. Jumlahkan Angka ");
            System.out.println("3. Cek Kelulusan Nilai");
            System.out.println("4. Cek Hari");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu (0-4):");
            
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan angka mulai hitung mundur: ");
                    int start = scanner.nextInt();
                    
                    System.out.print("Hasil: ");
                    for (int i = start; i > 0; i--) {
                        System.out.print(i + " ");
                    }
                    System.out.println("Selesai!");
                    break;

                case 2:
                    System.out.println("Masukkan angka-angka (ketik 0 untuk berhenti & lihat hasil):");
                    int total = 0;
                    int input = -1; 

                    while (input != 0) {
                        System.out.print("Input angka: ");
                        input = scanner.nextInt();

                        if (input != 0) {
                            total += input; 
                        }
                    }
                    System.out.println("Total penjumlahan: " + total);
                    break;

                case 3:
                    System.out.print("Masukkan nilai ujian (0-100): ");
                    int nilai = scanner.nextInt();

                    if (nilai >= 90) {
                        System.out.println("Status: KELAS KING (Grade A)");
                    } else if (nilai >= 75) {
                        System.out.println("Status: LUMAYAN (Grade B)");  
                    } else if (nilai >= 60) {
                        System.out.println("Status: FOKUS YH DEK (Grade C)");
                    } else if (nilai >= 40) {
                        System.out.println("Status: BELAJAR LAGI YA DECK (Grade D)");
                    } else {
                        System.out.println("Status: PENSI AJA (Grade E)");
                    }
                    break;

                case 4:
                    System.out.print("Masukkan angka hari (1=Senin, 7=Minggu): ");
                    int hari = scanner.nextInt();

                    switch (hari) {
                        case 1: System.out.println("Senin: Semangat Kuliah!"); break;
                        case 7: System.out.println("Minggu: Waktunya Libur."); break;
                        default: System.out.println("Hari kerja biasa."); break;
                    }
                    break;

                case 0:
                    System.out.println("Terima kasih, program berhenti.");
                    lanjut = false;
                    break;

                default:
                    System.out.println("Pilihan tidak valid, silakan coba lagi.");
            }

        } while (lanjut);
        
        scanner.close();
    }
}