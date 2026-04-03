public class Gajah extends Hewan {
    public static void testClassMethod() {
        System.out.println("The Class Method in Gajah...");
    }
    @Override
    public void testInstanceMethod() {
        System.out.println("The Instance method in Gajah...");
    }

    public static void main(String[] args) {
        Gajah myGajah = new Gajah();
        Hewan myHewan = myGajah;
        
        Hewan.testClassMethod();
        myHewan.testInstanceMethod();
    }
}