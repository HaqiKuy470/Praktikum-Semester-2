import java.util.Scanner;

public class Tes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan;
        boolean lanjut = true;

        // 1. DO-WHILE LOOP
        // Digunakan agar menu muncul minimal satu kali sebelum dicek kondisinya
        do {
            System.out.println("\n=== PROGRAM BELAJAR JAVA ===");
            System.out.println("1. Hitung Mundur (For Loop)");
            System.out.println("2. Jumlahkan Angka (While Loop)");
            System.out.println("3. Cek Kelulusan Nilai (If-Else)");
            System.out.println("4. Cek Hari (Switch)");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu (0-4): ");
            
            pilihan = scanner.nextInt();

            // 2. SWITCH STATEMENT
            // Digunakan untuk memilih logika berdasarkan input menu
            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan angka mulai hitung mundur: ");
                    int start = scanner.nextInt();
                    
                    System.out.print("Hasil: ");
                    // 3. FOR LOOP
                    // Digunakan ketika kita tahu pasti berapa kali perulangan terjadi
                    for (int i = start; i > 0; i--) {
                        System.out.print(i + " ");
                    }
                    System.out.println("Selesai!");
                    break;

                case 2:
                    System.out.println("Masukkan angka-angka (ketik 0 untuk berhenti & lihat hasil):");
                    int total = 0;
                    int input = -1; // Inisialisasi awal agar masuk loop

                    // 4. WHILE LOOP
                    // Digunakan ketika kita TIDAK TAHU berapa kali user akan menginput
                    while (input != 0) {
                        System.out.print("Input angka: ");
                        input = scanner.nextInt();
                        
                        // 5. IF STATEMENT (Tunggal)
                        if (input != 0) {
                            total += input; // total = total + input
                        }
                    }
                    System.out.println("Total penjumlahan: " + total);
                    break;

                case 3:
                    System.out.print("Masukkan nilai ujian (0-100): ");
                    int nilai = scanner.nextInt();

                    // 6. IF - ELSE IF - ELSE
                    // Digunakan untuk percabangan dengan banyak kondisi
                    if (nilai >= 75) {
                        System.out.println("Status: LULUS (Grade A/B)");
                    } else if (nilai >= 60) {
                        System.out.println("Status: REMIDIAL (Grade C)");
                    } else {
                        System.out.println("Status: TIDAK LULUS (Grade D/E)");
                    }
                    break;

                case 4:
                    System.out.print("Masukkan angka hari (1=Senin, 7=Minggu): ");
                    int hari = scanner.nextInt();
                    
                    // Contoh Switch di dalam Switch (Nested) atau logika sederhana
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

        } while (lanjut); // Cek kondisi di akhir (Do-While)
        
        scanner.close();
    }
}