package day15;

import java.util.Arrays;

public class C01ArrayEleman {
    //Dizinin elemanlarını,Elemanlarının karesini,Çift Sayılarını ve çift sayıların toplamını bulan 4method yazınız
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        System.out.print("Arrayın elemanları:");
        arrayYazdir(arr);
        System.out.print("Arrayın elemanlarının kareleri:");
        elemanlarinKaresiniHesapla(arr);
        System.out.print("Arrayın çiftsayı olan elemanları:");
        ciftSayiHesapla(arr);
        System.out.print("Arrayın çiftsayı olan elemanlarının toplamı:");
        ciftSayiToplamHesapla(arr);
    }

    private static void ciftSayiToplamHesapla(int[] arr) {
        int toplam=0;
        for (int i = 0; i < arr.length; i++) {
          toplam+=arr[i];
        }
        System.out.println(toplam);
    }

    private static void arrayYazdir(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    private static void ciftSayiHesapla(int[] arr) {
       int sayac=0;
        for (int each:arr) {
            if (each%2==0){
              arr[sayac]  =each;
              sayac++;
            }
            else
            {
                arr[sayac]  =0;
                sayac++;
            }

        }
        System.out.println(Arrays.toString(arr));
    }

    private static void elemanlarinKaresiniHesapla(int[] arr) {
        int[] arr2=new int[arr.length];  //Bu adımda yeni bir array tanımlayıp sonucu yeni array e atadık.
        for (int i = 0; i < arr.length; i++) {
            arr2[i]=arr[i]*arr[i];
        }
        System.out.println(Arrays.toString(arr2));
    }

}
