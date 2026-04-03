class Buku {
    private String judul, penyusun, kota, penerbit;
    private int tahun;

    public Buku(String penyusun, int tahun) {
        this.penyusun = penyusun;
        this.tahun = tahun;
    }

    public void setInfo(String judul) {
        this.judul = judul;
    }

    public void setInfo(String kota, String penerbit) {
        this.kota = kota;
        this.penerbit = penerbit;
    }

    public void tampilkan() {
        System.out.println("\nPenulisan Daftar Pustaka :");
        System.out.println(penyusun + ". " + tahun + ". " + judul + ". " + kota + ": " + penerbit + ".");
    }
}
