public class Tabung extends Lingkaran { 
    float tinggi = 3;

    public double volume() {
        return luas() * tinggi;
    }

    public double luasPermukaan() {
        return (2 * luas()) + (keliling() * tinggi);
    }
}