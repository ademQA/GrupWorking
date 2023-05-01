package day07;

import java.util.Arrays;
import java.util.Scanner;

public class C02 {
    public static void main(String[] args) {
        //Bir kullanıcının girdiği bir dizideki çift sayıları bulan bir program yazın. Bulma işlemi bir metot içinde
        // gerçekleştirilmeli ve bu metotun geri dönüş değeri olarak çift sayıları içeren yeni bir dizi döndürülmelidir.

        System.out.println(Arrays.toString(ciftsayilariBul()));
    }
    public static int[] ciftsayilariBul(){

    int index=0;
    int sayac=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("dizinin eleman sayısını giriniz: ");
        int elemanSayisi=scanner.nextInt();
        int[] arr=new int[elemanSayisi];
        for (int i = 0; i < elemanSayisi; i++) {
            System.out.println("lütfen sayılarınızı giriniz: ");
           arr[i]=scanner.nextInt();
           if (arr[i]%2==0)
               sayac++;
        }
        int[] ciftsayilar=new int[sayac];
        for (int i = 0; i < elemanSayisi; i++) {
            if (arr[i]%2==0){
                ciftsayilar[index]=arr[i];
                index++;
            }
        }
        return ciftsayilar;
    }
}
