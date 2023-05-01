package day06;

import java.util.Scanner;

public class C01_FAK {
    public static void main(String[] args) {
        //Bir kullanıcının girdiği bir sayının faktöriyelini hesaplayan bir program yazın.
        // Faktöriyel hesaplama işlemi bir metot içinde gerçekleştirilmeli ve
        // bu metotun geri dönüş değeri olarak faktöriyel değeri döndürülmelidir.
     faktoriyelHesapla();

    }

    public  static void faktoriyelHesapla(){
        int sayi;
        int faktoriyel=1;
        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen bir tam sayı giriniz: ");
        sayi=scanner.nextInt();

        if (sayi>0){
        for (int i = 1; i <=sayi; i++) {
        faktoriyel=faktoriyel*i;

        }
        }
        if (sayi<0) {
            System.out.println("hatalı giriş yaptınız ,pozitif tam sayı giriniz: ");
            return;
        }
      if (sayi==0){
          faktoriyel=1;}
        System.out.println(faktoriyel);

    }
}
