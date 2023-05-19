package day14;

import java.util.Scanner;

public class AmstrakSayi {
     /*
    Kullanıcıdan bir tamsayı alıp, bu sayının armstrong sayısı olup
     olmadığını ekrana yazdırın.

     371 => 3^3 + 7^3 + 1^3 = 371
     153=> 1^3 + 5^3 + 3^3 = 151
     1634 => 1^4 + 6^4 + 3^4 + 4^4 = 1634
     1 => 1^1 =1
     */


    public static int armstromgMu(int sayi) {


        int basamakSayisi = String.valueOf(sayi).length();
        int armstrong = 0;
        while (sayi != 0) {
            int sayiDegeri = sayi % 10;
            armstrong += Math.pow(sayiDegeri, basamakSayisi);
            sayi /= 10;

        }
        return armstrong;
    }

    public static void main(String[] args) {
        System.out.println("lutfen bir tamsayı girin");
        Scanner scanner = new Scanner(System.in);
        int sayi = scanner.nextInt();

        if (armstromgMu(sayi) == sayi) {
            System.out.println("Bu bir armstrong sayisidir");
        } else {
            System.out.println("armstrong sayisi degildir");
        }

    }
}
