package day03;

import java.util.Scanner;

public class C01_HesapMakinesi {
     /* Problem Tanımı :
    Basit 4 işlem yapan bir hesap makinesi kodlayınız...
    Kullanıcıdan yapacağı işlemi işlem sembolü ile seçmesini sağlayınız.
    Kullanıcıdan iki sayı girmesini isteyiniz.
    Girilen iki sayi ve seçilen işleme göre doğru sonucu ekrana yazdırınız.
    */

    public static void hesapMakinesi() {
        Scanner scan = new Scanner(System.in);
        System.out.println("*****************************");
        System.out.println("+ : Toplama Işlemi :\n" +
                "- : Cıkarma Işlemi :\n" +
                "* : Carpma Islemi :\n" +
                "/ : Bölme Islemi:");
        System.out.println("******************************");
        System.out.println("Lütfen yapacagınız işlemin sembolünü seçiniz:");
        String islem = scan.nextLine();
        double a;
        double b;
        switch (islem) {
            case "+":
                System.out.println("Birinci sayi");
                a = scan.nextDouble();
                System.out.println("ikinci sayi");
                b = scan.nextDouble();
                System.out.println("Girilen değerlerin toplamı: " + (a + b));
                break;
            case "-":
                System.out.println("Birinci sayi");
                a = scan.nextDouble();
                System.out.println("ikinci sayi");
                b = scan.nextDouble();
                System.out.println("Girilen değerlerin Farkı: " + (a - b));
                break;
            case "*":
                System.out.println("Birinci sayi");
                a = scan.nextDouble();
                System.out.println("ikinci sayi");
                b = scan.nextDouble();
                System.out.println("Girilen değerlerin çarpımı: " + (a * b));
                break;
            case "/":
                System.out.println("Birinci sayi");
                a = scan.nextDouble();
                System.out.println("ikinci sayi");
                b = scan.nextDouble();
                System.out.println("1.sayının 2.sayıya bölümü: " + (a / b));
                break;
            default: {
                System.out.println("Gecersiz İşlem... tekrar deneyiniz...");
                hesapMakinesi();
            }

        }
    }

    public static void main(String[] args) {
        hesapMakinesi();
    }

}
