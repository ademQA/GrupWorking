package day11;

import java.util.Scanner;

public class C04_SesliHarfleriKaldıran {
    //Java'da kullanıcıdan bir metin alan ve bu metindeki sesli harfleri kaldıran bir program yazın.



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Metin girin: ");
        String metin = scanner.nextLine();


        // Metindeki sesli harfleri kaldırma


        String yeniMetin = metin.replaceAll("[aeiouAEIOU]", "");
        System.out.println("Sesli harfler kaldırıldıktan sonra: " + yeniMetin);


    }
}
