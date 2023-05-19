package day18_FilmYorumlari;

public class Yorum {
    private String yorumMetni;
    private String yorumYapaninIsmi;
    private double derecelendirmePuani;

    public Yorum(String yorumMetni, String yorumYapaninIsmi, double derecelendirmePuani) {
        this.yorumMetni = yorumMetni;
        this.yorumYapaninIsmi = yorumYapaninIsmi;
        this.derecelendirmePuani = derecelendirmePuani;
    }

    public String getYorumMetni() {
        return yorumMetni;
    }

    public String getYorumYapaninIsmi() {
        return yorumYapaninIsmi;
    }

    public double getDerecelendirmePuani() {
        return derecelendirmePuani;
    }
}
