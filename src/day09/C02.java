package day09;

import java.util.Arrays;
import java.util.Scanner;

public class C02 {
    public static void main(String[] args) {
        //soru1:N elemanlı bir dizi bulunmaktadır. Klavyeden girilen sayılar
        //diziye, bir tane baştan bir tane sondan olmak üzere
        //yerleştirilmektedir. Örneğin ilk sayı birinci elemana, ikinci
        //sayı N’inci elemana, üçüncü sayı ikinci elemana, dördüncü sayı
        //N-1’inci elemana... şeklinde yerleştirilmektedir. N tane sayıyı
        //klavyeden okuyup diziye yerleştiren ve diziyi ekranda
        //görüntüleyen programı yazınız.

        Scanner scanner=new Scanner(System.in);
        System.out.println("arrayın boyutunu giriniz: ");
        int n=scanner.nextInt();
        int[]dizi=new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println((i+1)+". elemanı giriniz:");
            int eleman=scanner.nextInt();
            //n=5  i=0    eleman=4----i=1     eleman=8;   i=2   eleman=5;
            //dizi[i]=eleman; ----dizi[n-1]=8;

        if (i%2==0)
            dizi[i/2]=eleman;
        else
            dizi[n-1-i/2]=eleman;
        }
        System.out.println(Arrays.toString(dizi));
    }
}
