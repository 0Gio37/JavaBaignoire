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
            System.out.println("Niveau baignoire après fuite : " + this.getVolumeActuel());
        }
        this.setVolumeActuel(0);
        System.out.println("la baignoire est vide");
    }


    @Override
    public void run() {
        fuite();
    }



}
