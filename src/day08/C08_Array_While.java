package day08;

import java.util.Scanner;
import java.util.Arrays;
public class C08_Array_While {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("İlk dizi boyutunu girin: ");
        int size1 = scanner.nextInt();

        int[] array1 = new int[size1];
        for (int i = 0; i < size1; i++) {
            System.out.print((i + 1) + ". sayıyı girin: ");
            array1[i] = scanner.nextInt();
        }

        System.out.print("İkinci dizi boyutunu girin: ");
        int size2 = scanner.nextInt();

        int[] array2 = new int[size2];
        for (int i = 0; i < size2; i++) {
            System.out.print((i + 1) + ". sayıyı girin: ");
            array2[i] = scanner.nextInt();
        }

        int[] sumArray = addArrays(array1, array2);

        System.out.println("Toplam dizisi: " + Arrays.toString(sumArray));
    }

    public static int[] addArrays(int[] array1, int[] array2) {
        int size = Math.max(array1.length, array2.length);
        int[] sumArray = new int[size];

        int i = 0;
        while (i < array1.length && i < array2.length) {
            sumArray[i] = array1[i] + array2[i];
            i++;
        }
        while (i < array1.length) {
            sumArray[i] = array1[i];
            i++;
        }

        while (i < array2.length) {
            sumArray[i] = array2[i];
            i++;
        }


        return sumArray;
    }
}
