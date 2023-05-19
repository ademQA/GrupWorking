package day18;

public class Runner {
    public static void main(String[] args) {

        Sekiller dikdortgen=new Dikdortgen(4,9);
        Sekiller kare=new Kare(3);
        Sekiller daire=new Daire(4);
        Sekiller ucgen=new Ucgen(6,8,10);

        System.out.println("Dikdörtgenin Cevresi: "+dikdortgen.CevreHesapla());
        System.out.println("Dikdörtgenin Alanı: "+dikdortgen.alanHesapla());

        System.out.println("Karenin Alanı: "+kare.alanHesapla());
        System.out.println("Karenin Cevresi: "+kare.CevreHesapla());
        kare.hesapla();

        System.out.println("Ucgenin Cevresi: "+ucgen.CevreHesapla());
        System.out.println("Ucgenin Alanı: "+ucgen.alanHesapla());

        System.out.println("Dairenin Alanı: "+daire.alanHesapla());
        System.out.println("Dairenin Cevresi: "+daire.CevreHesapla());

    }
}
