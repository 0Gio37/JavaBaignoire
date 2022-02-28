package georges.baignoire;

public class Robinet implements Runnable{

    public Baignoire baignoire;
    public int volumeDebite;

    public Robinet(Baignoire baignoire, int volumeDebite) {
        this.baignoire = baignoire;
        this.volumeDebite = volumeDebite;
    }


    public void debite(){
        int volApresDebit = baignoire.getVolumeActuel() + this.volumeDebite;

        if (volApresDebit == baignoire.getVolumeMax()) {
            baignoire.setVolumeActuel(volApresDebit);
            System.out.println("Volume max de la baignoire atteint : "+ baignoire.getVolumeMax());
        } else if(volApresDebit < baignoire.getVolumeMax() ){
            baignoire.setVolumeActuel(volApresDebit);
            System.out.println("Volume après debit : "+ baignoire.getVolumeActuel());
        } else{
            System.out.println("avec ce débit supp, la baignoire débordera !");
        }
    }


    @Override
    public void run() {
        debite();
    }
}
