package day09;

import java.util.Scanner;

public class C03 {

/*
        Kullanicidan asagidaki sartlari saglayan bir sifre isteyin
        kullanici uygun sifre girinceye kadar yeniden sifre isteyin
        sifrenin kontrolunu bir method'da yapip
        sifre uygunsa true
        degilse false dondurun

        - ilk harf kucuk harf olmali
        - son karakter rakam olmali
        - sifre bosluk icermemeli
        - uzunlugu en az 10 karakter olmali
     */

public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen sifre giriniz : ");

        String sifre = "";
        boolean sifreDogruMu = false;

        while (! sifreDogruMu  ){
        sifre = scanner.next();
        sifreDogruMu=(sifregecerliMi(sifre));

        }

        }

public static boolean sifregecerliMi(String sifre){

        int sayac = 0;

        // - ilk harf kucuk harf olmali
        char ilkHarf =sifre.charAt(0);
        if (!(ilkHarf>'a' && ilkHarf<'z')){
        System.out.println("Lutfen sifrenin ilk harfini kucuk giriniz ");
        sayac++;
        }

        // - son karakter rakam olmali

        char sonkarakter = sifre.charAt(sifre.length()-1);
        if (!(sonkarakter<='9' && sonkarakter>'0')){
        System.out.println("Lutfen sifrenin son karakter rakam giriniz");
        sayac++;
        }

        // - sifre bosluk icermemeli

        if (sifre.contains(" ")){
        System.out.println("Lutfen sifreyi bosluksuz giriniz");
        sayac++;
        }
        // - uzunlugu en az 10 karakter olmali

        if (sifre.length()<10){

        System.out.println("Lutfen sifreyi 10 karakter veya daha uzun giriniz");
        sayac++;
        }

        boolean sifreGecerliMi = true;
        if (sayac==0){
        System.out.println("Sifre basarili");
        sifreGecerliMi =true;
        }else {
        System.out.println("Sifre gecersiz. Lutfen tekrar giriniz");
        sifreGecerliMi = false;

        }

        return sifreGecerliMi;
        }
        }
