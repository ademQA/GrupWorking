package day15;

public class C02_Array {
    public static void main(String[] args) {
        int[] dizi = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Dizinin elemanlarını yazdırma
        System.out.println("Dizinin Elemanları:");
        elemanlariYazdir(dizi);

        // Dizinin elemanlarının karelerini yazdırma
        System.out.println("\nDizinin Elemanlarının Kareleri:");
        kareleriYazdir(dizi);

        // Dizinin çift sayılarını yazdırma
        System.out.println("\nDizinin Çift Sayıları:");
        ciftleriYazdir(dizi);

        // Dizinin çift sayılarının toplamını bulma
        int ciftSayiToplami = ciftleriTopla(dizi);
        System.out.println("\nDizinin Çift Sayılarının Toplamı: " + ciftSayiToplami);
    }

    // Dizinin elemanlarını yazdıran method
    public static void elemanlariYazdir(int[] dizi) {
        for (int i = 0; i < dizi.length; i++) {
            System.out.print(dizi[i] + " ");
        }
    }

    // Dizinin elemanlarının karelerini yazdıran method
    public static void kareleriYazdir(int[] dizi) {
        for (int i = 0; i < dizi.length; i++) {
            int kare = dizi[i] * dizi[i];
            System.out.print(kare + " ");
        }
    }
    // Dizinin çift sayılarını yazdıran method
    public static void ciftleriYazdir(int[] dizi) {
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] % 2 == 0) {
                System.out.print(dizi[i] + " ");
            }
        }
    }
    // Dizinin çift sayılarının toplamını bulan method
    public static int ciftleriTopla(int[] dizi) {
        int toplam = 0;
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] % 2 == 0) {
                toplam += dizi[i];
            }
        }
        return toplam;
    }
}

