public class DemoBoolean {
    public static void main(String[] args) {
        boolean b;

        b = true;
        System.out.println("Nilai b = " + b);
        if (b) System.out.println("Statemen awal dieksekusi");

        b = false;
        System.out.println("Nilai b = " + b);
        if (b) {

        } else {
            System.out.println("Statemen akhir dieksekusi");
        }

        System.out.println("\n--- Hasil Perbandingan ---");
        System.out.println("4 <= 2 mengembalikan nilai " + (4 <= 2));
        System.out.println("11 > 9 mengembalikan nilai " + (11 > 9));
        System.out.println("5 > 5 mengembalikan nilai " + (5 > 5));
    }
}