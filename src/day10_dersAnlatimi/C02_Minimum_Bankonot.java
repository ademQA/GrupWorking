package day10_dersAnlatimi;

import java.util.Scanner;
//kullanıcının girdiği TL miktarını en az banknot sayısına çeviren programı array kullanarak yapınız.
public class C02_Minimum_Bankonot {
    public static void main(String[] args) {
        int toplamKullanılanBankonotSayisi=0;
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen Testirlik Maaşınızı TL Olarak Girin: ");
        int paraMiktari = input.nextInt();

        int[] bankonatlar = {200, 100, 50, 20, 10, 5, 1};
        int[] kullanilanBankonotlar = new int[7];

        for (int i = 0; i < bankonatlar.length; i++) {
            kullanilanBankonotlar[i] = paraMiktari / bankonatlar[i];
            paraMiktari %= bankonatlar[i];
        }
        System.out.println("Minimum banknot sayısı:");
        for (int i = 0; i < bankonatlar.length; i++) {
            if (kullanilanBankonotlar[i] > 0) {
                System.out.println(kullanilanBankonotlar[i] + " x " + bankonatlar[i] + " TL");
                toplamKullanılanBankonotSayisi+=kullanilanBankonotlar[i];
            }
        }System.out.println("Toplam Kullanılan Bankonot Sayısı: "+toplamKullanılanBankonotSayisi);

    }
}
