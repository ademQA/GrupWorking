package day04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C01Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacciHesapla());

    }

    public static List<Integer>fibonacciHesapla(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen bir sayı giriniz: ");
        int sayi=scanner.nextInt();
        List<Integer>fibonacciList=new ArrayList<>();
        int a=0;
        int b=1;
        int toplam=0;
        fibonacciList.add(a);
        fibonacciList.add(b);
        for (int i = 1; i < sayi-1; i++) {
          toplam=a+b;      //a:0  b:1  toplam:1   ---a:1  b:1 toplam:2----toplam:5  ---toplam:8
          a=b;  //a:1  ---a:1---a:2--a:3---b:5
          b=toplam; //b:1--- b:2  ---b:3---b:5  ---a:8
          fibonacciList.add(toplam);
        }

return fibonacciList;
    }


}
