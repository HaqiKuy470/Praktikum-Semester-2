public class WithArithmeticException {
    public static void main(String[] args) {
        System.out.println("\n********* PROGRAM DENGAN EXCEPTION HANDLING *********\n");
        try {
            int hasil = 9 / 0; // penyebab exception
            System.out.println("Hasil pembagian = " + hasil);
            System.out.println("Pernyataan dalam blok try setelah bebas dari exception.");
        } catch (ArithmeticException exc) {
            System.err.println("ArithmeticException menangkap exception hasil pembagian oleh nol.");
            System.err.println("\nException yang ditangkap adalah : " + exc);
        }
        System.out.println("\nPernyataan di luar blok try-catch.");
    }
}