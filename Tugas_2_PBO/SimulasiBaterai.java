import java.util.Scanner; 

public class SimulasiBaterai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan persentase baterai saat ini (0-100): ");
        int baterai = input.nextInt(); 

        if (baterai > 100) {
            baterai = 100;
            System.out.println("(Baterai diset ke maksimal 100%)");
        }

        System.out.println("\n--- HP Menyala. Baterai awal: " + baterai + "% ---");

        while (baterai > 0) {
            System.out.println("Sedang menggunakan HP... (Sisa: " + baterai + "%)");

            if (baterai <= 20) {
                System.out.println("⚠️  PERINGATAN: Baterai Lemah!");
            }

            baterai -= 10; 
        }

        System.out.println("--------------------------------");
        System.out.println("HP Mati (0%). Silakan di-cas.");
        
        input.close(); 
    }
}