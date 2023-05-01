package day08;

public class C02_Array_Toplam {
//soru 2: 20 elemanlı bir dizinin 1. ve 2. elemanları toplamının yarısı başka bir
//dizinin ilk elemanı, 3. ve 4. elemanları toplamının yarısı 2. elemanı
//şeklindedir. Bu işlemi yapan programı yazınız

        public static void main(String[] args) {
            int[] dizi1 = {1, 5, 3, 7, 4, 8, 6, 2, 10, 9, 15, 12, 17, 14, 11, 19, 20, 16, 13, 18};

            double[] dizi2 = new double[10];

            for (int i = 0; i < 10; i++) {
                double toplam = dizi1[2*i] + dizi1[2*i+1];
                dizi2[i] = toplam / 2;

            }

            // Diziyi ekrana yazdır
            for (int i = 0; i < 10; i++) {
                System.out.print(dizi2[i] + " ");
            }
        }
    }



