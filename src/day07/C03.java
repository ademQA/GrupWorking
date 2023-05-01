package day07;

import java.util.Scanner;

public class C03 {

    static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        //Bir kullanıcıdan bir not girmesini isteyin ve bu nota göre harf notu hesaplayan bir program yazın. (Karar yapıları)

        notHesapla();
    }
    public static void notHesapla(){
        System.out.println("notunuzu 100 lük giriniz: ");
      int not=scanner.nextInt();
        if (not>100 || not<0) {
            System.out.println("hatalı giriş yaptınız: ");
            notHesapla();
        } else if (not>=90) {
            System.out.println("harf notunuz: AA");
        }
        else if (not>=80) {
            System.out.println("harf notunuz: AB");
        }
        else if (not>=75) {
            System.out.println("harf notunuz: BB");
        }
        else if (not>=60) {
            System.out.println("harf notunuz: BC");
        }
        else if (not>=50) {
            System.out.println("harf notunuz: CC");
        }
        else if (not>=45) {
            System.out.println("harf notunuz: DC");
        }
        else if (not>=30) {
            System.out.println("harf notunuz: DD");
        }
        else if (not>25) {
            System.out.println("harf notunuz: FF");
        }

    }
}
