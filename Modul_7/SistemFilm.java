import java.io.*;

class RatingException extends Exception {
    public RatingException(String pesan) {
        super(pesan);
    }
}

public class SistemFilm {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("--- Input Data Film ---");
            System.out.print("Judul Film: ");
            String judul = br.readLine();
            
            System.out.print("Rating Film (1-10): ");
            int rating = Integer.parseInt(br.readLine());

            if (rating < 1 || rating > 10) {
                throw new RatingException("Rating harus di antara 1 sampai 10!");
            }

            System.out.println("\nFilm " + judul + " berhasil disimpan dengan rating " + rating);

        } catch (NumberFormatException e) {
            System.err.println("Kesalahan: Input rating harus berupa angka!");
        } catch (RatingException e) {
            System.err.println("Kesalahan Rating: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Kesalahan Input/Output terjadi.");
        } catch (Exception e) {
            System.err.println("Terjadi kesalahan tidak terduga: " + e);
        } finally {
            System.out.println("\nProses input selesai.");
        }
    }
}