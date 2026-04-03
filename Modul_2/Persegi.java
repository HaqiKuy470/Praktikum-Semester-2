import java.io.*;

public class Persegi {
    public static void main(String[] args) {
        BufferedReader data = new BufferedReader(new InputStreamReader(System.in));
        String x = "";
        int hitungLuas = 0;
        
        System.out.println("---Luas Persegi----");
        System.out.print("Masukkan nilai sisi: ");
        
        try {
            x = data.readLine();
            int angka = Integer.parseInt(x);
            hitungLuas = angka * angka;
            System.out.println("Luas persegi dengan sisi " + x + " adalah " + hitungLuas);
        } catch (Exception e) {
            System.out.println("Error: Input harus berupa angka!");
        }
    }
}