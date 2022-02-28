package georges.baignoire;

public class Main {

    public static void main(String[] args) {
        Baignoire baignoire = new Baignoire(200);
        Robinet robinet = new Robinet(baignoire, 150);
        robinet.debite();
        robinet.debite();


    }

}
