// Simpan file ini dengan nama: Main.java

class Makanan {
    private String nama;
    private double harga;

    public Makanan(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public String getNama() { return nama; }
    public double getHarga() { return harga; }

    // Menggunakan VOID: Langsung mencetak hasil tanpa return nilai
    public void tampilkanDetail() {
        double pajak = harga * 0.10;
        System.out.println("=== " + nama + " ===");
        System.out.println("Harga : Rp" + (int)harga);
        System.out.println("Pajak : Rp" + (int)pajak + " (10%)");
    }
}

class MakananPedas extends Makanan {
    private int levelPedas;

    public MakananPedas(String nama, double harga, int level) {
        super(nama, harga);
        this.levelPedas = level;
    }

    // Overriding metode void
    @Override
    public void tampilkanDetail() {
        double persentasePajak = 0.10 + (levelPedas * 0.02);
        double pajak = getHarga() * persentasePajak;
        int totalPersen = (int)(persentasePajak * 100);

        System.out.println("=== " + getNama() + " (Pedas) ===");
        System.out.println("Harga : Rp" + (int)getHarga());
        System.out.println("Level : " + levelPedas);
        System.out.println("Pajak : Rp" + (int)pajak + " (" + totalPersen + "%)");
    }
}

class MakananManis extends Makanan {
    private int kadarGula;

    public MakananManis(String nama, double harga, int gula) {
        super(nama, harga);
        this.kadarGula = gula;
    }

    @Override
    public void tampilkanDetail() {
        double tambahan = (kadarGula > 50) ? 0.05 : 0;
        double pajak = getHarga() * (0.10 + tambahan);
        int totalPersen = (tambahan > 0) ? 15 : 10;

        System.out.println("=== " + getNama() + " (Manis) ===");
        System.out.println("Harga : Rp" + (int)getHarga());
        System.out.println("Gula  : " + kadarGula + "gr");
        System.out.println("Pajak : Rp" + (int)pajak + " (" + totalPersen + "%)");
    }
}

public class Mbg {
    public static void main(String[] args) {
        System.out.println("DAFTAR TRANSAKSI WARUNG\n");

        // Polimorfisme
        Makanan[] pesanan = {
            new Makanan("Nasi Goreng", 15000),
            new MakananPedas("Seblak", 12000, 4),
            new MakananManis("Donat", 8000, 60)
        };

        for (Makanan m : pesanan) {
            m.tampilkanDetail(); // Memanggil metode void
            System.out.println();
        }
    }
}