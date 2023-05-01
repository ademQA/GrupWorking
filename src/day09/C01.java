package day09;

import java.util.Arrays;

public class C01 {
    public static void main(String[] args) {
        //verilen 2 array birleştiren program.
        int[] arr1={1,5,3,8};
        int[] arr2={2,7,8,9};

        int[]arrBirlesim=new int[arr1.length+arr2.length];

        for (int i = 0; i <=arr1.length-1 ; i++) {
            arrBirlesim[i]=arr1[i];
            arrBirlesim[arr1.length+i]=arr2[i];
        }

     //   for (int j = 0; j < arr2.length; j++) {
       //     arrBirlesim[arr1.length+j]=arr2[j];
      //  }
        System.out.println(Arrays.toString(arrBirlesim));
    }
}
