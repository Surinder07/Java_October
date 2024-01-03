package jan2;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {

        // how to create a hashmap
        //   Key  -- Value  init cap = 16, load - 75%
        // load factor --> defined how many times a map should be resized
        // internally - array list of LinkedList
        Map<String, Integer> marks = new HashMap<>();

        marks.put("Maths", 25);
        marks.put("English", 100);
        marks.put("Science", 100);
        marks.put("Computer", 99);
        marks.put("Computer", 99);
        marks.put("Java",88);
        marks.put("Java",2000000);

        marks.put(null, 100);
        marks.put(null, null);

        System.out.println("Maths marks : "+marks.get("Maths"));
        System.out.println(marks.getOrDefault("Java", 10000));

        marks.putIfAbsent("Hindi", 80);
        marks.putIfAbsent("Computer", 20);
        System.out.println(marks);

        //System.out.println(marks.isEmpty());
        System.out.println(marks.containsValue(1));
        System.out.println(marks.containsKey("Java"));
        marks.replace("Hindi", 75);
        marks.replace("Computer", 99, 88);
        System.out.println(marks);
        System.out.println(marks.containsKey("Maths"));
        System.out.println(marks.containsValue(125));





        //



    }
}
