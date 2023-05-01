package day08;

public class C03_Array_Iki_Boyutlu {
//soru3: İki boyutlu bir diziyi , tek boyutluya çeviren programı yazınız.
    public static void main(String[] args) {
        int[][] ikiBoyutluDizi = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int boyut1 = ikiBoyutluDizi.length;
        int boyut2 = ikiBoyutluDizi[0].length;
        int[] tekBoyutluDizi = new int[boyut1 * boyut2];
        int sayac = 0;

        for (int i = 0; i < boyut1; i++) {
            for (int j = 0; j < boyut2; j++) {
                tekBoyutluDizi[sayac++] = ikiBoyutluDizi[i][j];
            }
        }

        // Tek boyutlu diziyi ekrana yazdır
        for (int i = 0; i < tekBoyutluDizi.length; i++) {
            System.out.print(tekBoyutluDizi[i] + " ");
        }
    }
}
