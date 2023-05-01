package day08;

import java.util.Arrays;
//Soru4)Bir Java programında, iki farklı diziyi birleştirmek için nasıl bir kod yazarsınız?
public class C04_IkiArrayToplam {
    public static void main(String[] args) {
        int[] array1 = {1, 5, 3,8};
        int[] array2 = {2, 6, 9};

        int[] arrayBirlesim = new int[array1.length + array2.length];

        for (int i = 0; i < array1.length; i++) {
            arrayBirlesim[i] = array1[i];
        }
        for (int i = 0; i < array2.length; i++) {
            arrayBirlesim[array1.length + i] = array2[i];
        }
        System.out.println(Arrays.toString(arrayBirlesim));
    }

}
