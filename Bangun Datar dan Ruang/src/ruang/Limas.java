package ruang;

public class Limas {
    float volume;

    public float VolumeLimas(double pjg, double lebar, double tinggi){
        volume = (float) (pjg*lebar*tinggi/3);
        return volume;
    }

}
