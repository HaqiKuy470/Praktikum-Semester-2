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
        System.out.println(nama + " | Rp" + harga);
        System.out.println("Pajak: Rp" + (int)hitungPajak() + " (10%)");
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
        int persenTotal = 10 + (level * 2);
        System.out.println(nama + " | Rp" + harga + " | Level: " + level);
        System.out.println("Pajak: Rp" + (int)hitungPajak() + " (" + persenTotal + "%) <- (10% + " + level + "x2% = " + persenTotal + "%)");
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
        System.out.println(nama + " | Rp" + harga + " | Gula: " + gula + "gr");
        
        if (gula > 50) {
            System.out.println("Pajak: Rp" + (int)hitungPajak() + " (15%) <- (10% + 5% karena gula >50)");
        } else {
            System.out.println("Pajak: Rp" + (int)hitungPajak() + " (10%)");
        }
    }
}

public class Cmbg {
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