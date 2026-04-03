public class UjiBus3 {
    public static void main(String[] args) {
        Bus3 bus = new Bus3(40);
        bus.addPenumpang(15);
        bus.getPenumpang(24); // benar
        bus.getPenumpang(10); // salah
    }
}