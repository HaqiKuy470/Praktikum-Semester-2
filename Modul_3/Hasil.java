public class Hasil {
    public static void main(String[] args) {
        Tabung tbg = new Tabung(); 
        System.out.println("--- Lingkaran ---");
        System.out.println("Jari-Jari Lingkaran : " + tbg.jari);
        System.out.println("Phi Lingkaran       : " + tbg.phi);
        System.out.println("Luas Lingkaran      : " + tbg.luas());
        System.out.println("Keliling Lingkaran  : " + tbg.keliling());

        System.out.println("\n--- Tabung ---");
        System.out.println("Volume Tabung Adalah : " + tbg.volume());
        System.out.println("Luas Tabung Adalah   : " + tbg.luasPermukaan());
    }
}