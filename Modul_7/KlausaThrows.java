public class KlausaThrows {
    public static void uji(int angka) throws NullPointerException, ArithmeticException {
        if (angka < 0) {
            throw new NullPointerException("KESALAHAN: Null Pointer Exception");
        } else {
            throw new ArithmeticException("KESALAHAN Arithmetic Exception");
        }
    }

    public static void main(String[] args) {
        System.out.println("\n********* MENGGUNAKAN KLAUSA THROWS *********\n");
        try {
            uji(-12); // Memanggil method yang mendeklarasikan throws
        } catch (Exception exc) {
            System.err.println("Exception ditangkap di sini");
            System.err.println("\n\tPemberitahuan!!! \n" + exc.getMessage());
        }
    }
}
