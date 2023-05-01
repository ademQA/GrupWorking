package day06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class C03 {
    public static void main(String[] args) {
        System.out.println(tersMetin());
    }
    //Kullanıcı tarafından girilen bir kelimeyi tersine çeviren bir program yazın. Kelimeyi tersine çevirme işlemi
    // bir metot içinde gerçekleştirilmeli ve bu metotun geri dönüş değeri olarak tersine çevrilmiş kelime döndürülmelidir.


    public  static List<String> tersMetin(){
        String kelime;
        Scanner scanner=new Scanner(System.in);
        System.out.println("bir metin giriniz: ");
        kelime= scanner.nextLine();
     String[]  tersKelime= kelime.split("");
        List<String>tersMetinList=new ArrayList<>();
        for (int i = tersKelime.length-1; i >=0 ; i--) {
         tersMetinList.add(tersKelime[i]);
        }

      return tersMetinList;
    }
}
