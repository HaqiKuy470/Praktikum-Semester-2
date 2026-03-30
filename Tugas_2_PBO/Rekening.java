public class Rekening {

    static class RekeningBank {

        private String namaPemilik;
        private double saldo;

        public RekeningBank(String nama, double saldoAwal) {
            this.namaPemilik = nama;
            if (saldoAwal > 0) {
                this.saldo = saldoAwal;
            } else {
                this.saldo = 0;
            }
        }

        public String getNamaPemilik() {
            return namaPemilik;
        }

        public double getSaldo() {
            return saldo;
        }

        public void menabung(double jumlah) {
            if (jumlah > 0) {
                saldo += jumlah;
                System.out.println("Berhasil menabung: Rp" + jumlah);
            } else {
                System.out.println("Jumlah tabungan harus positif!");
            }
        }

        public void tarikTunai(double jumlah) {
            if (jumlah > 0 && jumlah <= saldo) {
                saldo -= jumlah;
                System.out.println("Berhasil menarik: Rp" + jumlah);
            } else {
                System.out.println("Saldo tidak cukup atau jumlah tidak valid!");
            }
        }
    }

    public static void main(String[] args) {
        RekeningBank akunSaya = new RekeningBank("Budi Utomo", 500000);

        System.out.println("Pemilik: " + akunSaya.getNamaPemilik());
        System.out.println("Saldo awal: Rp" + akunSaya.getSaldo());

        akunSaya.menabung(200000);
        akunSaya.tarikTunai(100000);

        System.out.println("Saldo akhir: Rp" + akunSaya.getSaldo());
    }
}