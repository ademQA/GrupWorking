package day20_CarProje;

public class Ozellikler {
    private String marka;
    private String model;
    private int yil;
    private double fiyat;
    private String yakit;
    private String vites;
    private String renk;
    private int km;

    public Ozellikler(String marka, String model, int yil, double fiyat, String yakit, String vites,
                      String renk, int km) {
        this.marka = marka;
        this.model = model;
        this.yil = yil;
        this.fiyat = fiyat;
        this.yakit = yakit;
        this.vites = vites;
        this.renk = renk;
        this.km = km;
    }


// Diğer getter ve setter metotlarını buraya ekleyebilirsiniz

    @Override
    public String toString() {
        return "Marka: " + marka +
                ", Model: " + model +
                ", Üretim Yılı: " + yil +
                ", Fiyat: " + fiyat +
                ", Yakıt Durumu: " + yakit +
                ", Vites Durumu: " + vites +
                ", Renk: " + renk +
                ", Kilometre: " + km;
    }
}


