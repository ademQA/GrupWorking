package day08;
import java.util.Scanner;
public class C01_ArrayBasSon {
//soru1:N elemanlı bir dizi bulunmaktadır. Klavyeden girilen sayılar
//diziye, bir tane baştan bir tane sondan olmak üzere
//yerleştirilmektedir. Örneğin ilk sayı birinci elemana, ikinci
//sayı N’inci elemana, üçüncü sayı ikinci elemana, dördüncü sayı
//N-1’inci elemana... şeklinde yerleştirilmektedir. N tane sayıyı
//klavyeden okuyup diziye yerleştiren ve diziyi ekranda
//görüntüleyen programı yazınız.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dizinin boyutunu girin: ");
        int n = scanner.nextInt();
        int[] dizi = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print((i+1) + ". sayıyı girin: ");
            int eleman = scanner.nextInt();
            if (i % 2 == 0) {
                // Başa ekle
                dizi[i/2] = eleman;
            } else {
                dizi[n-1-i/2] = eleman;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(dizi[i] + " ");
        }
    }
}