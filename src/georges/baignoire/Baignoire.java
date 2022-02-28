package georges.baignoire;

public class Baignoire {

    public int volumeMax;
    public int volumeActuel;

    public Baignoire(int volumeMax){
        this.volumeMax = volumeMax;
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
}
