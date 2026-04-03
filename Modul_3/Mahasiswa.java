class Mahasiswa extends CivitasAkademika {
    String nama;
    String nim;

    public Mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    @Override
    public void tampilkanKampus() {
        super.tampilkanKampus(); 
        System.out.println("Nama Mahasiswa: " + nama);
        System.out.println("NIM: " + nim);
    }
}