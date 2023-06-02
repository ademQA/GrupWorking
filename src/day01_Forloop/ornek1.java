package day01_Forloop;

import java.util.Scanner;

public class ornek1 {
    public static void main(String[] args) {
        //Kullanicidan pozitif bir tamsayi alin,
        // 1’den girilen sayiya kadar(girilen sayi dahil) 7 ila bolunebilen sayilari yazdirin.
        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen pozitif bir tsmayı giriniz");
        int sayi= scanner.nextInt();
        if (sayi>0) {
            for (int i = 1; i <= sayi; i++) {
                if (i % 7 == 0) {
                    System.out.println(i);
                }
            }
        }else {
            System.out.println("hatalı giriş yaptınız lütfen pozitif bir sayı giriniz");
        }

    }
}
