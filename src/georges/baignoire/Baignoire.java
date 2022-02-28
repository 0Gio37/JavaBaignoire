package georges.baignoire;

public class Baignoire implements Runnable{

    public int volumeMax;
    public int volumeActuel;
    public int volumeFuite;

    public Baignoire(int volumeMax, int volumeFuite){
        this.volumeMax = volumeMax;
        this.volumeFuite = volumeFuite;
        this.volumeActuel = 50;
    }

    public int getVolumeMax() {
        return volumeMax;
    }

    public int getVolumeActuel() {
        return volumeActuel;
    }

    public void setVolumeActuel(int volumeActuel) {
        this.volumeActuel = volumeActuel;
    }

    public void setVolumeFuite(int volumeFuite) {
        this.volumeFuite = volumeFuite;
    }


    public void fuite() {

        while(this.getVolumeActuel() - this.volumeFuite > 0) {
            this.setVolumeActuel(this.getVolumeActuel() - this.volumeFuite);
            System.out.println("Niveau baignoire : " + this.getVolumeActuel());
        }
        if (this.getVolumeActuel() - this.volumeFuite == 0) {
            this.setVolumeActuel(this.getVolumeActuel() - this.volumeFuite);
            System.out.println("Niveau baignoire : " + this.getVolumeActuel());
            System.out.println("la baignoire est vide");
        } else {
            System.out.println("la baignoire est déjà vidée");
        }
    }


        /*if(this.getVolumeActuel() == 0){
            this.setVolumeFuite(this.volumeFuite - 1);
            System.out.println("Volume fuite après colmatage :"+this.volumeFuite);
        }
        if(this.getVolumeActuel() > 0 && (this.getVolumeActuel() - this.volumeFuite > 0)){
            this.setVolumeActuel(this.getVolumeActuel() - this.volumeFuite);
            System.out.println("Volume après fuite : " + this.getVolumeActuel());
        } else{
            System.out.println("La beignoire est vidée");
        }
    }*/

    @Override
    public void run() {
        fuite();
    }



}
