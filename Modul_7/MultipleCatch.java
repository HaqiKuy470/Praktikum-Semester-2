public class MultipleCatch {
    public static void main(String[] args) {
        System.out.println("\n********* MENGGUNAKAN MULTIPLE CATCH *********\n");
        try {
            int[] array = new int[9]; 
            array[9] = 13; // penyebab ArrayIndexOutOfBoundsException (indeks max adalah 8)
            System.out.println("Elemen array indeks ke 9 adalah " + array[9]);
        } catch (ArrayIndexOutOfBoundsException exc) {
            System.err.println("Anda mengakses array di luar indeks yang dideklarasikan.");
        } catch (NegativeArraySizeException exc) {
            System.err.println("Anda mendeklarasikan array dengan ukuran negatif.");
        } catch (Exception exc) {
            System.err.println("Terjadi kesalahan umum: " + exc);
        }
    }
}