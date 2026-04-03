abstract class Kendaraan {
    String warna = "Hitam"; 

    public void nyalakanMesin() {
        System.out.println("Mesin menyala vroom!");
    }

    public abstract void caraBergerak(); 

    public static void main(String[] args) {
        Pesawat p = new Pesawat();
        p.nyalakanMesin();
        p.caraBergerak();
        p.terbang();
    }
}

interface FiturTerbang {
    int MAX_KETINGGIAN = 10000; 

    void terbang(); 
}

class Pesawat extends Kendaraan implements FiturTerbang {
    @Override
    public void caraBergerak() {
        System.out.println("Bergerak di landasan pacu lalu lepas landas.");
    }

    @Override
    public void terbang() {
        System.out.println("Terbang hingga " + MAX_KETINGGIAN + " kaki.");
    }
}