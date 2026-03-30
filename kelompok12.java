class Makanan {
    String nama;
    int harga;

    public Makanan(String nama, int harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public double hitungPajak() {
        return harga * 0.10; 
    }

    public void tampil() {
        int persenPajak = (int) ((hitungPajak() / harga) * 100);
        
        System.out.println(nama + " | Rp" + harga);
        System.out.println("Pajak: Rp" + (int)hitungPajak() + " (" + persenPajak + "%)");
    }

    public static void main(String[] args) {
        Makanan makanan = new Makanan("Nasi Kuning", 15000);
        makanan.tampil();
    }
}

class MakananPedas extends Makanan {
    int level;

    public MakananPedas(String nama, int harga, int level) {
        super(nama, harga);
        this.level = level;
    }

    @Override
    public double hitungPajak() {
        double persentasePajak = 0.10 + (level * 0.02);
        
        if (persentasePajak > 0.25) {
            persentasePajak = 0.25;
        }
        
        return harga * persentasePajak;
    }

    @Override
    public void tampil() {
        int persenTotal = (int) ((hitungPajak() / harga) * 100);
        int persenDasar = 10;
        int pengaliLevel = 2; 

        System.out.println(nama + " | Rp" + harga + " | Level: " + level);

        System.out.println("Pajak: Rp" + (int)hitungPajak() + " (" + persenTotal + "%) <- (" + persenDasar + "% + " + level + "x" + pengaliLevel + "% = " + persenTotal + "%)");
    }
}

class MakananManis extends Makanan {
    int gula;

    public MakananManis(String nama, int harga, int gula) {
        super(nama, harga);
        this.gula = gula;
    }

    @Override
    public double hitungPajak() {
        double persentasePajak = 0.10;
        
        if (gula > 50) {
            persentasePajak += 0.05; 
        }
        
        return harga * persentasePajak;
    }

    @Override
    public void tampil() {
        int persenTotal = (int) ((hitungPajak() / harga) * 100);
        int persenDasar = 10;
        int tambahanPajak = 5;

        System.out.println(nama + " | Rp" + harga + " | Gula: " + gula + "gr");
        
        if (gula > 50) {
            System.out.println("Pajak: Rp" + (int)hitungPajak() + " (" + persenTotal + "%) <- (" + persenDasar + "% + " + tambahanPajak + "% karena gula >50)");
        } else {
            System.out.println("Pajak: Rp" + (int)hitungPajak() + " (" + persenTotal + "%)");
        }
    }
}

public class kelompok12 {
    public static void main(String[] args) {
        System.out.println("=== WARUNG MAKAN ===\n");

        Makanan makananBiasa = new Makanan("Nasi Goreng", 15000);
        MakananPedas makananPedas = new MakananPedas("Seblak", 12000, 4);
        MakananManis makananManis = new MakananManis("Donat", 8000, 60);

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