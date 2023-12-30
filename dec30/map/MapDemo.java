package dec30.map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("Peter", 24);
        map.put("Parker", 54);
        map.put("John", 14);
        map.put("Smith", 65);
        map.put("Mike", 44);
        map.put("Sam", 54);
        map.put("Sam", 55);
        System.out.println(map);

        System.out.println(map.get("Parker"));
        System.out.println(map.getOrDefault("Sam", 0));

        // crete a map of phones with their prices
        // 5-6

    }
}
