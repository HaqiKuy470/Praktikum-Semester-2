// Simpan dengan nama Main.java

// --- CLASS INDUK ---
class Makanan {
    String nama;
    int harga;

    public Makanan(String nama, int harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public double hitungPajak() {
        return harga * 0.10; // Pajak 10%
    }

    public void tampil() {
        System.out.println(nama + " | Rp" + harga);
        System.out.println("Pajak: Rp" + (int)hitungPajak() + " (10%)");
    }
}

// --- CLASS ANAK 1 ---
class MakananPedas extends Makanan {
    int level;

    public MakananPedas(String nama, int harga, int level) {
        super(nama, harga); // Memanggil constructor class Induk
        this.level = level;
    }

    @Override
    public double hitungPajak() {
        double persentasePajak = 0.10 + (level * 0.02);
        
        // Aturan: Maksimal pajak 25% (0.25)
        if (persentasePajak > 0.25) {
            persentasePajak = 0.25;
        }
        
        return harga * persentasePajak;
    }

    @Override
    public void tampil() {
        int persenTotal = 10 + (level * 2);
        System.out.println(nama + " | Rp" + harga + " | Level: " + level);
        System.out.println("Pajak: Rp" + (int)hitungPajak() + " (" + persenTotal + "%) <- (10% + " + level + "x2% = " + persenTotal + "%)");
    }
}

// --- CLASS ANAK 2 ---
class MakananManis extends Makanan {
    int gula;

    public MakananManis(String nama, int harga, int gula) {
        super(nama, harga); // Memanggil constructor class Induk
        this.gula = gula;
    }

    @Override
    public double hitungPajak() {
        double persentasePajak = 0.10;
        
        // Aturan: Jika gula > 50 gram, pajak tambahan 5%
        if (gula > 50) {
            persentasePajak += 0.05; 
        }
        
        return harga * persentasePajak;
    }

    @Override
    public void tampil() {
        System.out.println(nama + " | Rp" + harga + " | Gula: " + gula + "gr");
        
        if (gula > 50) {
            System.out.println("Pajak: Rp" + (int)hitungPajak() + " (15%) <- (10% + 5% karena gula >50)");
        } else {
            System.out.println("Pajak: Rp" + (int)hitungPajak() + " (10%)");
        }
    }
}

// --- MAIN CLASS ---
public class Main {
    public static void main(String[] args) {
        System.out.println("=== WARUNG MAKAN ===\n");

        // Membuat Object sesuai instruksi
        Makanan makananBiasa = new Makanan("Nasi Goreng", 15000);
        MakananPedas makananPedas = new MakananPedas("Seblak", 12000, 4);
        MakananManis makananManis = new MakananManis("Donat", 8000, 60);

        // Menampilkan Output
        System.out.println("Makanan biasa:");
        makananBiasa.tampil();
        System.out.println();

        System.out.println("Makanan Pedas:");
        makananPedas.tampil();
        System.out.println();

        System.out.println("Makanan Manis:");
        makananManis.tampil();
    }
}