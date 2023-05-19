package day17_Sekiller;

public class Kare extends Sekiller{
    private double kenar;

    public Kare(double kenar) {
        this.kenar = kenar;
    }

    @Override
    public double alanHesapla() {
        return kenar*kenar;
    }

    @Override
    public double cevreHesapla() {
        return 4*kenar;
    }
}
