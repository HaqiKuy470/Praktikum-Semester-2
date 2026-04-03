import java.util.Scanner;

class InvalidInputException extends Exception {
    public InvalidInputException(String pesan) {
        super(pesan);
    }
}

public class LoginSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userDb = "AkuJawa"; 
        String passDb = "JawaKeren123"; 

        try {
            System.out.println("=== LOGIN SYSTEM ARSHAKA DIGITAL ===");
            System.out.print("Username : ");
            String username = sc.nextLine();
            System.out.print("Password : ");
            String password = sc.nextLine();

            if (!username.matches("[a-zA-Z0-9]*") || !password.matches("[a-zA-Z0-9]*")) {
                throw new InvalidInputException("Login Failed: Dilarang menggunakan tanda baca!"); 
            }

            if (username.equals(userDb) && password.equals(passDb)) {
                System.out.println("Login Berhasil! Selamat Datang.");
            } else {
                throw new Exception("Login Failed: Username/Password Salah.");
            }

        } catch (InvalidInputException e) {
            System.err.println(e.getMessage()); 
        } catch (Exception e) {
            System.err.println(e.getMessage());
        } finally {
            System.out.println("Terima kasih telah menggunakan sistem login.");
        }
    }
}