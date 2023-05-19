package day18;

public class Dikdortgen extends Sekiller{
    private double kisaKenar;
    private double uzunKenar;

    public Dikdortgen(double kisaKenar, double uzunKenar) {
        this.kisaKenar = kisaKenar;
        this.uzunKenar = uzunKenar;
    }

    @Override
    public double alanHesapla() {
        return kisaKenar*uzunKenar;
    }

    @Override
    public double CevreHesapla() {
        return 2*(kisaKenar+uzunKenar);
    }

    @Override
    public void hesapla() {

    }
}
