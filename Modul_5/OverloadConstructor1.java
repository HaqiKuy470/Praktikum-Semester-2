public class OverloadConstructor1 {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa("Surya", 2012);
        mhs1.info();

        Mahasiswa mhs2 = new Mahasiswa();
        mhs2.info();
    }
}
