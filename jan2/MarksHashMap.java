package jan2;

import java.util.*;

public class MarksHashMap {
    public static void main(String[] args) {

        Map<String, Integer> marks = new HashMap<>();

        marks.put("Maths", 25); // entry (K,V)
        marks.put("English", 100);
        marks.put("Science", 100);
        marks.put("Computer", 99);
        marks.put("Java",88);

        /*List<Integer> list = new ArrayList<>();
        list.add(100); // entry */

        Set<Map.Entry<String, Integer>> entries = marks.entrySet();

        // for each loop

        for (Map.Entry<String, Integer> ent: entries) {
           // System.out.println(ent.getKey());
             System.out.println(ent.getValue());
        }
        // 10 minutes
        // iterator
        // take names of countries with their current prime ministers
        // loop over
        // print the list of prime ministers and countries separately.






       /* Collection<Integer> values = marks.values();
        System.out.println(values);

        Set<String> keys = marks.keySet();
        System.out.println(keys);*/
    }
}
