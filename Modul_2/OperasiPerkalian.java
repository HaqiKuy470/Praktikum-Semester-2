public class OperasiPerkalian {

    static int kali(int a, int b) {
        return a * b;
    }

    static double kali(double a, double b) {
        return a * b;
    }

    static int kali(int a, int b, int c) {
        return a * b * c;
    }

    public static void main(String[] args) {
        System.out.println("2 bilangan (int) 1 * 9   = " + kali(1, 9));
        System.out.println("2 bilangan (double) 3.5 * 5 = " + kali(3.5, 5.0));
        System.out.println("3 bilangan (int) 2 * 3 * 3 = " + kali(2, 3, 3));
    }
}