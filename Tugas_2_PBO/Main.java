public class Main {
    public static void main(String[] args) {
        RekeningBank akunSaya = new RekeningBank("Budi Utomo", 500000);

        System.out.println("Pemilik: " + akunSaya.getNamaPemilik());
        System.out.println("Saldo awal: Rp" + akunSaya.getSaldo());

        akunSaya.menabung(200000);
        akunSaya.tarikTunai(100000);

        System.out.println("Saldo akhir: Rp" + akunSaya.getSaldo());
    }
}