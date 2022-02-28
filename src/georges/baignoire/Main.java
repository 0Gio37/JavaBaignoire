package georges.baignoire;

public class Main {

    public static void main(String[] args) {
        Baignoire baignoire = new Baignoire(300, 10);
        Robinet robinet = new Robinet(baignoire, 90);
        Thread threadBaignoire = new Thread(baignoire);
        Thread threadRobinet = new Thread(robinet);

        //robinet.debite();
        //baignoire.fuite();


        threadBaignoire.start();
        threadRobinet.start();

/*        System.out.println(threadBaignoire.getPriority());
        System.out.println(threadBaignoire.getState());
        System.out.println(threadBaignoire.isAlive());
        System.out.println(threadBaignoire.isDaemon());
        System.out.println(threadBaignoire.getName());
        System.out.println(threadBaignoire.getUncaughtExceptionHandler());
        System.out.println(threadBaignoire.isInterrupted());
        System.out.println(threadBaignoire.getId());
        System.out.println(threadRobinet.getId());*/








    }
}
