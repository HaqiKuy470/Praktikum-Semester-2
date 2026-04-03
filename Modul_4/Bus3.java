public class Bus3 {
    private int penumpang;
    private int maxPenumpang;

    public Bus3(int maxPenumpang) {
        this.maxPenumpang = maxPenumpang;
        penumpang = 0;
    }

    public void addPenumpang(int penumpang) {
        int temp = this.penumpang + penumpang;
        if (temp > maxPenumpang) {
            System.out.println("Penumpang melebihi kuota");
        } else {
            this.penumpang = temp;
        }
    }

    public void getPenumpang(int password) {
        if (password == 24) { 
            System.out.println("Password Benar");
            System.out.println("Penumpang sekarang: " + penumpang);
        } else {
            System.out.println("Password Salah");
        }
    }

    public void cetak() {
        System.out.println("Penumpang bus sekarang: " + penumpang);
        System.out.println("Penumpang maks seharusnya: " + maxPenumpang);
    }
}