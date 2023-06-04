package day19_Maps;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
public class C04_Map_Stok_Takip {
    public static void main(String[] args) {
         /*
    Bir LinkedHashMap oluşturun ve içine ürünleri anahtar olarak ve
    stok miktarlarını değer olarak ekleyin. Kullanıcıdan bir ürün adı
    girdisi alarak, ilgili ürünün stok miktarını azaltan bir program yazın.
    Eğer stok miktarı 0'a düşerse, "Stokta yeterli ürün yok" şeklinde bir mesaj gösterin.
    */
        Map<String,Integer> urunStokDurumuMap = new LinkedHashMap<>();
        urunStokDurumuMap.put("Kalem" ,10);
        urunStokDurumuMap.put("Defter",15);
        urunStokDurumuMap.put("Kitap" ,20);
        urunStokDurumuMap.put("Silgi",10);
        System.out.println(urunStokDurumuMap);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hangi urunu almak istiyorsunuz :");
        String urun = scanner.nextLine();
        System.out.println("Kac tane almak istiyorsunuz :");
        int sayi = scanner.nextInt();
        for (Map.Entry<String,Integer>each:urunStokDurumuMap.entrySet()
        ) {
            String urunİsim = each.getKey();
            int adet = each.getValue();
            if (urunİsim.equalsIgnoreCase(urun)){
                if (sayi > adet) {
                    System.out.println("Stoktaki urun adetimizi asdiniz ... Urun adeti :" + adet);
                }else {
                    adet = adet - sayi;
                    each.setValue(adet);
                    System.out.println(urunStokDurumuMap);
                }
                if (each.getValue() == 0){
                    System.out.println("Stok durumu sıfır ");
                }
            }
            //   System.out.println(" - urun adi : " + urunİsim + " -stok durumu :" + adet);
        }


    }
}
