package day21_MapOrnekleri;
//Örneğin, anahtarları "A" ile başlayan ve değerleri çift sayı olan çiftleri bulmak istediğinizi varsayalım.
// Nasıl bir kod yazarsınız?
import java.util.HashMap;
import java.util.Map;

public class C01_MapFiltreleme {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Apple", 2);
        map.put("Banana", 3);
        map.put("Apricot", 4);
        map.put("Avocado", 6);
        map.put("Almond", 8);

        Map<String, Integer> filteredMap = new HashMap<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();

            if (key.startsWith("A") && value % 2 == 0) {
                filteredMap.put(key, value);
            }
        }

        System.out.println("Filtrelenmiş Map: " + filteredMap);
    }
}
