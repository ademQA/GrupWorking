package day10_DersAnlatimi_SayiTahmin;

import java.util.Scanner;

public class C03_MinimumBankonotArraysiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen TL miktarını girin: ");
        int amount = input.nextInt();

        int count200 = amount / 200;
        amount %= 200;

        int count100 = amount / 100;
        amount %= 100;

        int count50 = amount / 50;
        amount %= 50;

        int count20 = amount / 20;
        amount %= 20;

        int count10 = amount / 10;
        amount %= 10;

        int count5 = amount / 5;
        amount %= 5;

        int count1 = amount;

        System.out.println("Minimum banknot sayısı:");
        if (count200 > 0) {
            System.out.println(count200 + " x 200 TL");
        }
        if (count100 > 0) {
            System.out.println(count100 + " x 100 TL");
        }
        if (count50 > 0) {
            System.out.println(count50 + " x 50 TL");
        }
        if (count20 > 0) {
            System.out.println(count20 + " x 20 TL");
        }
        if (count10 > 0) {
            System.out.println(count10 + " x 10 TL");
        }
        if (count5 > 0) {
            System.out.println(count5 + " x 5 TL");
        }
        if (count1 > 0) {
            System.out.println(count1 + " x 1 TL");
        }


    }
}
