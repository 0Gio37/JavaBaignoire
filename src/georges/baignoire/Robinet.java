package georges.baignoire;

public class Robinet {

    public Baignoire baignoire;
    public int volumeDebite;

    public Robinet(Baignoire baignoire, int volumeDebite) {
        this.baignoire = baignoire;
        this.volumeDebite = volumeDebite;
    }


    public void debite(){
        if (baignoire.getVolumeActuel() + this.volumeDebite == baignoire.getVolumeMax()) {
            baignoire.setVolumeActuel(baignoire.getVolumeActuel() + this.volumeDebite);
            System.out.println("Volume max de la baignoire atteint : "+ baignoire.getVolumeMax());

        } else if(baignoire.getVolumeActuel() + this.volumeDebite < baignoire.getVolumeMax() ){
            baignoire.setVolumeActuel(baignoire.getVolumeActuel() + this.volumeDebite);
            System.out.println("Volume total versé :"+ baignoire.getVolumeActuel());
        } else{
            System.out.println("avec ce débit supp, la baignoire va déborder !");
        }


    }



}
