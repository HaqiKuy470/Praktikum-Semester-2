
class Makanan {
    private String nama;
    private double harga;

    public Makanan(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public String getNama() { return nama; }
    public double getHarga() { return harga; }

    public double hitungPajak() {
        return harga * 0.10;
    }

    public void tampilkanInfo() {
        System.out.println(nama + " | Rp" + (int)harga);
        System.out.println("Pajak: Rp" + (int)hitungPajak() + " (10%)");
    }
}

class MakananPedas extends Makanan {
    private int levelPedas;

    public MakananPedas(String nama, double harga, int level) {
        super(nama, harga); 
        this.levelPedas = level;
    }

    @Override
    public double hitungPajak() {
        // Logika: 10% + (Level * 2%)
        double persentasePajak = 0.10 + (levelPedas * 0.02);
        return getHarga() * persentasePajak;
    }

    @Override
    public void tampilkanInfo() {
        int totalPersen = 10 + (levelPedas * 2);
        System.out.println(getNama() + " | Rp" + (int)getHarga() + " | Level: " + levelPedas);
        System.out.println("Pajak: Rp" + (int)hitungPajak() + " (" + totalPersen + "%) <- (10% + " + levelPedas + "x2%)");
    }
}

class MakananManis extends Makanan {
    private int kadarGula;

    public MakananManis(String nama, double harga, int gula) {
        super(nama, harga);
        this.kadarGula = gula;
    }

    @Override
    public double hitungPajak() {
        double tambahan = (kadarGula > 50) ? 0.05 : 0;
        return getHarga() * (0.10 + tambahan);
    }

    @Override
    public void tampilkanInfo() {
        String ket = (kadarGula > 50) ? " (10% + 5% karena gula >50)" : " (10%)";
        System.out.println(getNama() + " | Rp" + (int)getHarga() + " | Gula: " + kadarGula + "gr");
        System.out.println("Pajak: Rp" + (int)hitungPajak() + ket);
    }
}

public class Mava {
    public static void main(String[] args) {
        System.out.println("=== WARUNG MAKAN ===\n");

        Makanan[] daftarPesanan = {
            new Makanan("Nasi Goreng", 15000),
            new MakananPedas("Seblak", 12000, 4),
            new MakananManis("Donat", 8000, 60)
        };

        for (Makanan m : daftarPesanan) {
            m.tampilkanInfo();
            System.out.println(); 
        }
    }
}