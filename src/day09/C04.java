package day09;

public class C04 {
    /*

        N pozitif bir tamsayı olmak üzere, N sayısının pozitif bölenlerinin toplamı (n)’dir.
        Eğer (n) > 2*N ise bu özelliği taşıyan sayılar zengin sayılardır.

        Örneğin;

        12 sayısının pozitif bölenleri: 1, 2, 3, 4, 6, 12

        (n) = 1 + 2 + 3 + 4 + 6 + 12 = 28

        2*N = 2*12 = 24 ‘tür.

        (n) > 2*N olduğu için de 12 zengin sayıdır.

        Soru: 10 ile 100 arasindaki zengin sayilari bulunuz.

        */



    public static void main(String[] args) {


        int toplam = 0;
        for (int i = 10; i <=100 ; i++) {

            for (int j = 1; j <= i ; j++) {

                if (i % j == 0){

                    toplam = toplam + j;
                }

            }

            if (toplam>2*i){

                System.out.println(i+" sayisi zengin sayidir.");
            }

            toplam  = 0;
        }

    }

}

