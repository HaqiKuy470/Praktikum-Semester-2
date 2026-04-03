public class UjiBus {
    public static void main(String[] args) {
        Bus busMini = new Bus();
        busMini.penumpang = 5;
        busMini.maxPenumpang = 15;
        busMini.cetak();

        busMini.penumpang = busMini.penumpang + 5;
        busMini.cetak();

        busMini.penumpang = busMini.penumpang - 2;
        busMini.cetak();

        busMini.penumpang = busMini.penumpang + 8;
        busMini.cetak();
    }
}