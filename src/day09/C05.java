package day09;

import java.util.Arrays;
import java.util.Scanner;

public class C05 {
   /*

    Verilen bir array’e istenen bir elemani ekleyip bize donduren bir method yazin,
        eski array’e yenidegeri atayin.
     */

    public static void main(String[] args) {

        int [] arr ={2,3,6,5,9};


        System.out.println(Arrays.toString(yeniArray(arr)));

    }
    public static int [] yeniArray(int [] arr){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen 2 adet sayi giriniz: ");
        int sayi = scanner.nextInt();

        int sayi2 = scanner.nextInt();


        int [] yeniarr = new int[arr.length+2];

        for (int i = 0; i < arr.length ; i++) {

            yeniarr[i]=arr[i];

        }
        yeniarr[arr.length-1+1]=sayi;

        yeniarr[yeniarr.length-1]=sayi2;

        // System.out.println(Arrays.toString(yeniarr));

        return yeniarr;
    }
}

