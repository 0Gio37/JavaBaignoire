package georges.baignoire;

public class Robinet implements Runnable{

    public Baignoire baignoire;
    public int volumeDebite;

    public Robinet(Baignoire baignoire, int volumeDebite) {
        this.baignoire = baignoire;
        this.volumeDebite = volumeDebite;
    }


    public void debite(){

        while(baignoire.getVolumeActuel() + this.volumeDebite < baignoire.getVolumeMax()){
            baignoire.setVolumeActuel(baignoire.getVolumeActuel() + this.volumeDebite);
            System.out.println(" Niveau après débit de "+this.volumeDebite+" = " + baignoire.getVolumeActuel());
        }
        if(baignoire.getVolumeActuel() + this.volumeDebite == baignoire.getVolumeMax()){
            baignoire.setVolumeActuel(baignoire.getVolumeActuel() + this.volumeDebite);
            System.out.println(" Niveau après débit = " + baignoire.getVolumeActuel());
            System.out.println("==> la baignoire est à ras bord <==");
        }else {
            System.out.println("==> la baignoire débordera au prochain débit <==");
        }


    }


    @Override
    public void run() {
        debite();
    }
}
