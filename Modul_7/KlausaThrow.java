public class KlausaThrow {
    public static void main(String[] args) {
        String input = "Throw RuntimeException";
        System.out.println("\n********* MENGGUNAKAN KLAUSA THROW *********\n");
        try {
            if (input.equals("Throw RuntimeException")) {
                throw new RuntimeException("Melempar Exception"); // Melempar exception secara manual
            } else if (input == null) {
                throw new NullPointerException();
            }
            System.out.println("Input adalah: " + input);
        } catch (Exception exc) {
            System.err.println("Exception ditangkap di sini.");
            System.err.println("\nException yang ditangkap adalah : " + exc);
        }
    }
}
