package day20_CarProje;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Car {
    private static Map<Integer, Ozellikler> ikinciElArabaMap = new HashMap<>();
    private static int carId = 1;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean cikis = true;

        while (cikis) {
            System.out.println("1. Araba Ekle");
            System.out.println("2. Arabaları Listele");
            System.out.println("3. Çıkış");
            System.out.print("Seçiminizi yapın: ");
            int secim = scanner.nextInt();
            scanner.nextLine(); // Boş satırı oku

            switch (secim) {
                case 1:
                    aracEkle();
                    break;
                case 2:
                    araclariListele();
                    break;
                case 3:
                    // System.exit(0);
                    cikis = false;
                    break;
                default:
                    System.out.println("Geçersiz seçim. Lütfen tekrar deneyin.");
            }
          //  System.out.println();
        }
    }

    public static void aracEkle() {
        System.out.print("Marka: ");
        String marka = scanner.nextLine();
        System.out.print("Model: ");
        String model = scanner.nextLine();
        System.out.print("Üretim Yılı: ");
        int yil = scanner.nextInt();
        scanner.nextLine(); // Boş satırı oku
        System.out.print("Fiyat: ");
        double fiyat = scanner.nextDouble();
        scanner.nextLine(); // Boş satırı oku
        System.out.print("Yakıt Durumu: ");
        String yakit = scanner.nextLine();
        System.out.print("Vites Durumu: ");
        String vites = scanner.nextLine();
        System.out.print("Renk: ");
        String renk = scanner.nextLine();
        System.out.print("Kilometre: ");
        int km = scanner.nextInt();
        scanner.nextLine(); // Boş satırı oku

        Ozellikler ikincielAraba = new Ozellikler(marka, model, yil, fiyat, yakit, vites, renk, km);
        ikinciElArabaMap.put(carId, ikincielAraba);
        System.out.println("Araba kaydedildi. Kayıt No: " + carId);
        carId++;
    }

    public static void araclariListele() {
        System.out.println("----- Arabalar -----");
        for (Map.Entry<Integer, Ozellikler> entry : ikinciElArabaMap.entrySet()) {
            int carId = entry.getKey();
           Ozellikler ikincielAraba = entry.getValue();
            System.out.println("Kayıt No: " + carId);
            System.out.println(ikincielAraba);
            System.out.println("-------------------");
        }
    }
}





