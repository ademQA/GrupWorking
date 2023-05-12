package day14;

import java.util.Scanner;

public class OBEB_OKEK {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Birinci sayıyı girin: ");
        int sayi1 = scanner.nextInt();

        System.out.print("İkinci sayıyı girin: ");
        int sayi2 = scanner.nextInt();

        int obeb = obebBul(sayi1, sayi2);
        int okek = okekBul(sayi1, sayi2, obeb);

        System.out.println("OEBB: " + obeb);
        System.out.println("OKEK: " + okek);
    }

    public static int obebBul(int sayi1, int sayi2) {
        while (sayi1 != sayi2) {
            if (sayi1 > sayi2)
                sayi1 -= sayi2;
            else
                sayi2 -= sayi1;
        }

        return sayi1;
    }

    public static int okekBul(int sayi1, int sayi2, int obeb) {
        return (sayi1 * sayi2) / obeb;
    }
}
