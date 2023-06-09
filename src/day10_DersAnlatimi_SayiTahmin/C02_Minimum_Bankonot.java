package day10_DersAnlatimi_SayiTahmin;

import java.util.Scanner;
//kullanıcının girdiği TL miktarını en az banknot sayısına çeviren programı array kullanarak yapınız.
//int[] bankonatlar = {200, 100, 50, 20, 10, 5, 1};
// Örneğin Lütfen Testirlik Maaşınızı TL Olarak Girin: 8642
//Minimum banknot sayısı:
//43 x 200 TL
//2 x 20 TL
//2 x 1 TL
//Toplam Kullanılan Bankonot Sayısı: 47


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
            paraMiktari =paraMiktari%bankonatlar[i];
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
