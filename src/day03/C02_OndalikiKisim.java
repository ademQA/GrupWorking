package day03;

import java.util.Scanner;

public class C02_OndalikiKisim {
    /*
     Kullanıcının girdiği ondalık sayının sadece ondalık kısmındaki rakamlarını, kendisinden önce bir yıldız
    isaretiyle yazdırmak için gereken kodu yazınız.
    Örnegin; 75.4238 ==> *4*2*3*8

     */


    public static void main(String[] args) {

        ondalikliKisim();
    }


    public static void ondalikliKisim() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen ondalikli bir sayi giriniz: ");
        Double girilenSayi = scanner.nextDouble();
        String ondalikliRakamlar = girilenSayi.toString();

        int index = ondalikliRakamlar.indexOf('.');

        String yeniOndalikli = "";

        for (int i = index + 1; i <= ondalikliRakamlar.length() - 1; i++) {
            yeniOndalikli += ondalikliRakamlar.charAt(i)+" *";

        }

        yeniOndalikli = yeniOndalikli.substring(0, yeniOndalikli.length() - 1);
        System.out.println(yeniOndalikli);


    }
}

