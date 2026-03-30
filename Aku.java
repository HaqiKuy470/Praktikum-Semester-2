import java.util.Scanner;
public class Aku {
    public class mahasiswa{
        static int jumlah;
        int umur;
        String nama;
    } 
        public static void main(String[] args) {
                int a;
                int b = 10;
                Scanner input = new Scanner(System.in);
                System.out.print("Masukkan angka: ");
                a = input.nextInt();
                int c = a + b;
                System.out.println(c);
        }
}
