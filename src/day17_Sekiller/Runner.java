package day17_Sekiller;

public class Runner {
    public static void main(String[] args) {
        Sekiller dikdortgen=new Dikdortgen(4,8);
        Sekiller daire=new Daire(3);
        Sekiller ucgen=new Ucgen(12,10,10);
        Sekiller kare=new Kare(5);

        System.out.println("Dikdörtgenin Alanı: "+dikdortgen.alanHesapla());
        System.out.println("Dikdörtgenin Çevresi: "+dikdortgen.cevreHesapla());

        System.out.println("Dairenin Alanı: "+daire.alanHesapla());
        System.out.println("Dairenin Çevresi: "+daire.cevreHesapla());

        System.out.println("Üçgenin Alanı: "+ucgen.alanHesapla());
        System.out.println("Üçgenin Çevresi: "+ucgen.cevreHesapla());

        System.out.println("Karenin Alanı: "+kare.alanHesapla());
        System.out.println("Karenin Çevresi: "+kare.cevreHesapla());
    }
}
