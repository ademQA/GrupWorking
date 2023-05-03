package day11;

import java.util.Arrays;

public class C05_GeometrikOrta {
    // Verilen Arrayde bulunan degerlerin geometrik ortalamasını hesaplayan
    //mehod olusturalim

    public static void main(String[] args) {
        int[] dizi = {4,9};
        int toplam = toplamiHesapla(dizi);
        geometrikOrtHesapla(dizi);
        System.out.println("Dizi: "+ Arrays.toString(dizi));
        System.out.println("Elemanlar Toplamı: "+toplam);
        System.out.println("Geometrik ortalama:"+geometrikOrtHesapla(dizi));
    }
    public static int toplamiHesapla(int[] dizi){
        int toplam = 0;
        for (int i = 0; i <dizi.length; i++) {
            toplam += dizi[i];

        }
        return toplam;

    }

    public static double geometrikOrtHesapla(int[]dizi){
        double carpma = 1;
        for (int i = 0; i <dizi.length; i++) {
            carpma*=dizi[i];


        }
        double geoOrtalama = Math.pow(carpma,1.0/ dizi.length);
        return geoOrtalama;

    }

}
