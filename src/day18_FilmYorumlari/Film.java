package day18_FilmYorumlari;

import java.util.ArrayList;

public class Film {
    private String ad;
    private String yonetmen;
    private ArrayList < String > oyuncular;
    private ArrayList <Yorum> yorumlar;

    public Film(String ad, String yonetmen, ArrayList<String> oyuncular) {
        this.ad = ad;
        this.yonetmen = yonetmen;
        this.oyuncular = oyuncular;
        this.yorumlar=new ArrayList<Yorum>();
    }
    public void yorumEkle(Yorum yorum) {
        this.yorumlar.add(yorum);
    }

    public String getAd() {
        return ad;
    }

    public String getYonetmen() {
        return yonetmen;
    }

    public ArrayList<String> getOyuncular() {
        return oyuncular;
    }

    public ArrayList<Yorum> getYorumlar() {
        return yorumlar;
    }
}
