public class TestLingkaran {
    public static void main(String[] args) {
        Lingkaran l1 = new Lingkaran();
        
        Lingkaran l2 = new Lingkaran(10.0);
        
        Lingkaran l3 = new Lingkaran(100.0);

        System.out.println("Luas Lingkaran 1 (r=1)   : " + l1.luas());
        System.out.println("Luas Lingkaran 2 (r=10)  : " + l2.luas());
        System.out.println("Luas Lingkaran 3 (r=100) : " + l3.luas());
    }
}
