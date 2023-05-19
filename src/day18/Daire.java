package day18;

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
    public double CevreHesapla() {
        return 2*Math.PI*yariCap;
    }

    @Override
    public void hesapla() {

    }
}
