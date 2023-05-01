package day05_Array;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class C02_ArrayList {
    public static void main(String[] args) {
        System.out.println(sonUcHarf());
        // kullanıcıdan kelimelerden oluşan bir arrayin boyutunu ve kelimeleri alıp,
        // o arraydeki en uzun kelimeyi bulup, for each döngüsü kullanarak
        // son 3 harfi büyük harfle yazdıran ,
        // bir method oluşturun
    }
    public static String sonUcHarf (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kelime dizisinin boyutunu giriniz:");
        int boyut = scanner.nextInt();
        String[] arr=new String[boyut];
        String enUzunKelime =" ";
        String sonUcHarf=" ";
        List<String>arrList= new ArrayList<>();
        for (int i = 0; i < boyut; i++) {
            System.out.println("lütfen arr elemanlarını giriniz:");
            arr[i] = scanner.next();
        }
        for (String herbiri : arr      ) {
            arrList.add(herbiri);
        }
        for (int i = 0; i < arrList.size(); i++) {
            if (arrList.get(i).length()>enUzunKelime.length()){
                enUzunKelime=arrList.get(i);
                sonUcHarf=enUzunKelime.substring(enUzunKelime.length()-3);
            }
        }
        return sonUcHarf;
    }
        }

