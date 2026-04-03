import java.util.Scanner;

public class BiodataInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please Input Your Character: ");
        String karakter = input.nextLine();

        System.out.print("Please Input Your Name: ");
        String nama = input.nextLine();

        System.out.print("Please Input Your Hobby: ");
        String hobi = input.nextLine();

        System.out.println("\nHello... My Name is " + nama + ".");
        System.out.println("I'm a very " + karakter + " person.");
        System.out.println("My Hobby is " + hobi + ".");
    }
}