package day05_Array;

import java.util.Scanner;

public class C01_Array {
    public static void main(String[] args) {
        System.out.println(sonUcHarfiDondurenMethod());
        // kullanıcıdan kelimelerden oluşan bir arrayin boyutunu ve kelimeleri alıp,
        // o arraydeki en uzun kelimeyi bulup, for each döngüsü kullanarak
        // son 3 harfi büyük harfle yazdıran ,
        // bir method oluşturun
    }

    public static String sonUcHarfiDondurenMethod(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kelime dizisinin boyutunu giriniz:");
        int boyut = scanner.nextInt();
        String[] arr=new String[boyut];
        String enUzunKelime =" ";
        for (int i = 0; i < boyut; i++) {
            System.out.println("lütfen arr elemanlarını giriniz:");
            arr[i]=scanner.next();
            if (arr[i].length()>=enUzunKelime.length()){
                enUzunKelime=arr[i];
            }
        }
        String sonUcHarf=(enUzunKelime.toUpperCase().substring(enUzunKelime.length()-3));
        return sonUcHarf;

    }
}
