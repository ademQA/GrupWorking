package day17_Sekiller;

public class Daire extends Sekiller{

    private double yariCap;

    public Daire(double yariCap) {
        this.yariCap = yariCap;
    }

    @Override
    public double alanHesapla() {
        return Math.PI*yariCap*yariCap;
    }

    @Override
    public double cevreHesapla() {
        return 2*Math.PI*yariCap;
    }
}
