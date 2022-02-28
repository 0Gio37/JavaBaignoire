package georges.baignoire;

public class Baignoire {

    public int volumeMax;
    public int volumeActuel;
    public int volumeFuite;

    public Baignoire(int volumeMax, int volumeFuite){
        this.volumeMax = volumeMax;
        this.volumeFuite = volumeFuite;
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

    public void fuite(){
        if(this.getVolumeActuel() > 0 && (this.getVolumeActuel() - this.volumeFuite > 0)){
            this.setVolumeActuel(this.getVolumeActuel() - this.volumeFuite);
            System.out.println(this.getVolumeActuel());
        } else{
            System.out.println("La beignoire est vidée");
        }
    }




}
