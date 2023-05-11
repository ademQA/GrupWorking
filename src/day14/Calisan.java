package day14;

public class Calisan {
    // Write a Java program to create a class called "Employee" with a name,
    //job title, and salary attributes, and methods to calculate and update salary.
    private String ad;
    private String isUnvani;
    private double maas;
    public Calisan (String ad,String isUnvani,double maas){
        this.ad =ad;
        this.isUnvani = isUnvani;
        this.maas=maas;
    }
    public String getAd(){
        return ad;
    }
    public String getIsUnvani(){
        return isUnvani;
    }
    public double getMaas(){
        return maas;
    }
    public void maasArtisiniHesapla (double oran){
        double artisiHesapla = maas * (oran / 100);
        maas +=artisiHesapla;
    }
    public void updateIsUnvani (String yeniIsUnvani){
        isUnvani = yeniIsUnvani;
    }
    public static void main(String[] args) {
        Calisan calisan = new Calisan("Murat Can","QA tester",20000);
        System.out.println("Calisanin İsmi :" + calisan.getAd());
        System.out.println("Calisanin İs Unvani :" + calisan.getIsUnvani());
        System.out.println("Calisanin Maasi :" + calisan.getMaas());
        calisan.maasArtisiniHesapla(10);
        calisan.updateIsUnvani("Senior Qa tester");
        System.out.println("Calisanin İsmi :" + calisan.getAd());
        System.out.println("Calisanin İs Unvani :" + calisan.getIsUnvani());
        System.out.println("Calisanin Maasi :" + calisan.getMaas());
    }
}
