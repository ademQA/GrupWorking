package day17_Sekiller;

public class Ucgen extends Sekiller{
    private double kenar1;
    private double kenar2;
    private double kenar3;

    public Ucgen(double kenar1, double kenar2, double kenar3) {
        this.kenar1 = kenar1;
        this.kenar2 = kenar2;
        this.kenar3 = kenar3;
    }

    @Override
    public double alanHesapla() {
        double u=(kenar1+kenar2+kenar3)/2;
        return Math.sqrt(u*(u-kenar1)*(u-kenar2)*(u-kenar3));
    }

    @Override
    public double cevreHesapla() {
        return kenar1+kenar2+kenar3;
    }
}
