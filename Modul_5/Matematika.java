class Mahasiswa {
    private String nama;
    private int angkatan;

    public Mahasiswa() { 
        this.nama = "Siwi";
        this.angkatan = 2013;
    }

    public Mahasiswa(String nama, int angkatan) {         this.nama = nama;
        this.angkatan = angkatan;
    }

    public void info() {
        System.out.println("\nIdentitas Mahasiswa: ");
        System.out.println("Nama     : " + this.nama);
        System.out.println("Angkatan : " + this.angkatan);
    }
}
