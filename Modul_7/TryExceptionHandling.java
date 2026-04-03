class CreateExceptionHandling extends Exception {
    private int bilangan;
    CreateExceptionHandling(String pesan, int nilai) {
        super(pesan);
        bilangan = nilai;
    }
    public int getBilangan() { return bilangan; }
}

public class TryExceptionHandling {
    public static int hitungFaktorial(int n) throws CreateExceptionHandling {
        if (n < 0) throw new CreateExceptionHandling("Bilangan tidak boleh negatif", n);
        int hasil = 1;
        for (int i = n; i >= 1; i--) hasil *= i;
        return hasil;
    }

    public static void main(String[] args) {
        System.out.println("\n********* MEMBUAT CLASS EXCEPTION SENDIRI *********\n");
        try {
            System.out.println("Hasil 5! = " + hitungFaktorial(5));
            System.out.println("Hasil -5! = " + hitungFaktorial(-5));
        } catch (CreateExceptionHandling exc) {
            System.err.println("Bilangan = " + exc.getBilangan());
            exc.printStackTrace(); // Menampilkan alur kesalahan
        }
    }
}
