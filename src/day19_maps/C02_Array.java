package day19_maps;

public class C02_Array {
    // Verilen bir array'de istenen bir elemanin var olup olmadigini ve varsa kac kere
    // kullanildigini yazdiran bir method olusturun

    public static void main(String[] args) {
        int[] array= {2,4,6,8,2,10,12,2,12,16,2};
        int eleman=12;

        int sayac=elemaninKacKereKullanildiğiniBul(array,eleman);

        if (sayac>0){
            System.out.println(eleman+ " elemanı dizi içinde buunuyor");
            System.out.println( eleman +  " elemanı " + sayac + " kez kullanılmıs");
        }else{
            System.out.println("eleman dizi içinde bulunmuyor");
        }

    }

    public static int elemaninKacKereKullanildiğiniBul(int [] array,int eleman){
        int sayac=0;

        for (int i = 0; i < array.length; i++) {

            if (array[i]==eleman){
                sayac++;
            }


        }
        return sayac;

    }

}

