package day15;

import java.util.Scanner;

public class C03_Valueof {
    public static void main(String[] args) {

        int a=123;
        String sayiString = "123";
        int sayi = Integer.valueOf(sayiString);

        System.out.println("Sayı: " + sayi);
        System.out.println("-------------------");
        Scanner scanner=new Scanner(System.in);
        System.out.println("bir kelime giriniz");
        String kelime=scanner.next();
        System.out.println(String.valueOf(1234));
        System.out.println(Integer.valueOf(kelime));

    }
    }

