public class TryCatchFinally {
    public static void main(String[] args) {
        System.out.println("\n********* MENGGUNAKAN BLOK TRY-CATCH-FINALLY *********\n");
        try {
            int hasil = 9 / 0;
            System.out.println("Hasil pembagian = " + hasil);
        } catch (ArithmeticException exc) {
            System.err.println("ArithmeticException menangkap exception.");
            System.err.println("\nException yang ditangkap adalah : " + exc);
        } finally {
            System.out.println("\nPernyataan dalam blok finally.");
        }
        System.out.println("\nPernyataan di luar blok try-catch-finally.");
    }
}