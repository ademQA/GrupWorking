package day18;

public class Kare extends Sekiller{
    public Kare(double kenar) {
        this.kenar = kenar;
    }

    private double kenar;
    @Override
    public double alanHesapla() {
        return kenar*kenar;
    }

    @Override
    public double CevreHesapla() {
        return 4*kenar;
    }

    @Override
    public void hesapla() {
        System.out.println("iki boyutlu şekillerin hacmi hesaplanamaz");
    }
}
