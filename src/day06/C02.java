package day06;

import java.util.Scanner;

public class C02 {
    public static void main(String[] args) {
        //Kullanıcı tarafından girilen bir kelimeyi tersine çeviren bir program yazın. Kelimeyi tersine çevirme işlemi
        // bir metot içinde gerçekleştirilmeli ve bu metotun geri dönüş değeri olarak tersine çevrilmiş kelime döndürülmelidir.
        System.out.println(tersMetin());
    }
    public  static String tersMetin(){
        String kelime;
        String tersKelime="";
        Scanner scanner=new Scanner(System.in);
        System.out.println("bir metin giriniz: ");
        kelime= scanner.nextLine();
        for (int i = kelime.length()-1; i >=0 ; i--) {
            tersKelime+=kelime.charAt(i);
        }
        return tersKelime;
    }
}
