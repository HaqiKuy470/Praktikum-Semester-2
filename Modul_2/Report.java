import java.io.*;

public class Report {
    public static String bacaInputan() {
        String baca = "";
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader buf = new BufferedReader(input);
        try {
            baca = buf.readLine();
        } catch (IOException e) {
            System.out.println("Error!");
        }
        return baca;
    }

    public static void main(String[] args) {
        System.out.print("Masukkan nama: ");
        String name = bacaInputan();
        
        System.out.print("Masukkan nilai matematika: ");
        int nilaiMatematika = Integer.parseInt(bacaInputan());
        
        System.out.println("\n--- Report ---");
        System.out.println("Nama: " + name);
        System.out.println("Matematika: " + nilaiMatematika);
    }
}