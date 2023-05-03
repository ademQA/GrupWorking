package day11;

import java.util.Arrays;

public class C06_UcIleBolunenler {
    //Verilen Array listte bulunan 3 ile tam bolunen sayıları faeklı bir Array list e kopyalayınız.


    public static void main(String[] args) {

        int[] dizi = {2, 5, 3, 9, 12, 96, 17};
        int[] ucleBolunenler = ucleTamBolunenleriKopyala(dizi);
        System.out.println("Orjinal dizi: " + Arrays.toString(dizi));
        System.out.println("3 ile tam bölunenler" + Arrays.toString(ucleBolunenler));

    }

    public static int[] ucleTamBolunenleriKopyala(int[] dizi) {
        int[] ucleBolunenler = new int[dizi.length];
        int index = 0;
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] % 3 == 0) {
                ucleBolunenler[index] = dizi[i];
                index++;
            }

        }
        return Arrays.copyOf(ucleBolunenler, index);
    }
}