package day21_MapOrnekleri;
//verilen Map içindeki en küçük ve en büyük değere sahip anahtarları bulun
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class C02_MaptekiMakveMinDegerleri {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Apple", 5);
        map.put("Banana", 3);
        map.put("Carrot", 7);
        map.put("Durian", 5);
        map.put("Elderberry", 3);

        List<String> minKeys = new ArrayList<>();
        List<String> maxKeys = new ArrayList<>();

        int minValue = Integer.MAX_VALUE;
        System.out.println(minValue);
        int maxValue = Integer.MIN_VALUE;
        System.out.println(maxValue);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            int value = entry.getValue();

            if (value < minValue) {
                minValue = value;
                minKeys.clear();
                minKeys.add(entry.getKey());
            } else if (value == minValue) {
                minKeys.add(entry.getKey());
            }

            if (value > maxValue) {
                maxValue = value;
                maxKeys.clear();
                maxKeys.add(entry.getKey());
            } else if (value == maxValue) {
                maxKeys.add(entry.getKey());
            }
        }

        System.out.println("En küçük değere sahip anahtar(lar): " + minKeys);
        System.out.println("En büyük değere sahip anahtar(lar): " + maxKeys);
    }
}
