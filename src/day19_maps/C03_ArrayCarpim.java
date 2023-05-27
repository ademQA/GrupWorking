package day19_maps;

public class C03_ArrayCarpim {
    //   Verilen 2 katli bir array'de bulunan tum sayilarin carpinini bize yazdiran bir
    //   method olusturun

    public static void main(String[] args) {
        int [][] array = {{1,2,3},{4,5,6},{7,3,9,5}};

        tumSayilarinCarpiminiYazdir(array);

    }

    public static void tumSayilarinCarpiminiYazdir (int [][]array){
        int carpim=1;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                carpim*=array[i][j];
            }


        }
        System.out.println("Tüm sayilarin carpimi:"+ carpim);

    }
}
