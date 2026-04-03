public class Scoope {
    int angka = 20;

    void infoScoope() {
        int angka1 = 12;
        System.out.println("angka di method: " + angka1);
        System.out.println("angka di kelas: " + this.angka);
        
        int modulus = angka % angka1;
        System.out.println("sisa hasil: " + modulus);
        
        float bagi = (float) angka / angka1;
        System.out.println("hasil bagi: " + bagi);
    }
}

