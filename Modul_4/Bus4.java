public class Bus4 {
    private double penumpang;
    private double maxPenumpang;
    private double counter; 

    public Bus4(double maxPenumpang) {
        this.maxPenumpang = maxPenumpang;
        this.penumpang = 0;
        this.counter = 0; 
    }

    public void addPenumpang(double penumpang) {
        double temp = this.penumpang + penumpang;
        if (temp > maxPenumpang) {
            System.out.println("Penumpang melebihi kuota");
        } else {
            this.penumpang = temp;
            this.counter++; 
        }
    }

    public double getAverage() {
        if (counter == 0) return 0;
        return penumpang / counter; 
    }

    public void cetak() {
        System.out.println("Penumpang bus sekarang: " + penumpang);
        System.out.println("Penumpang maks seharusnya: " + maxPenumpang);
        System.out.println("Rata-rata penumpang: " + getAverage()); 
    }

    public static void main(String[] args) {
        Bus4 bus = new Bus4(40);
        bus.cetak();

        bus.addPenumpang(15);
        bus.cetak();

        bus.addPenumpang(5);
        bus.cetak();

        bus.addPenumpang(26);
        bus.cetak();
    }
}
