package day21_MapOrnekleri;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
//verilen meyve-miktar çiftlerinin groupedMap olarak gruplandırılmasının nasıl yapıldığını belirtir.

public class C03_MapGruplama {
    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();
        map.put("Apple", 5);
        map.put("Banana", 3);
        map.put("Carrot", 7);
        map.put("Durian", 5);
        map.put("Elderberry", 3);

        HashMap<Integer, List<String>> groupedMap = new HashMap<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();

            if (!groupedMap.containsKey(value)) {
                groupedMap.put(value, new ArrayList<>());
            }

            groupedMap.get(value).add(key);
        }

        System.out.println("Gruplanmış Map: " + groupedMap);
    }
}
