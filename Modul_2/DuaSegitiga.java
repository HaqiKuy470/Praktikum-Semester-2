import java.util.Scanner;

public class DuaSegitiga {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Input bilangan: ");
        int n = input.nextInt();

        System.out.println("\nSegitiga sama sisi, sisi=" + n);
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("\nSegitiga siku-siku dengan alas=" + n + ", tinggi=" + n);
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}