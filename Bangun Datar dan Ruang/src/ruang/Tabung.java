package ruang;

public class Tabung {
    double volume;
    double jari;
    final double PHI=3.14;
    public double VolumeTabung(double diameter,double t){
        jari = diameter/2;
        volume = (PHI*jari*jari)*t;
        return volume;
    }
}
