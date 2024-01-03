package jan2;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {

        // synchronizedmap() - read
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        treeMap.put(1, 100);
        treeMap.put(3, 45300);
        treeMap.put(10, 1430);
        treeMap.put(2, 10430);
        //treeMap.put(null, 232);
        System.out.println(treeMap);

        // LinkedHashMap
        // insertion order is maintained
        // null is allowed

        LinkedHashMap<String, Integer> books = new LinkedHashMap<>();
        books.put("Harry Potter", 200);
        books.put("The power of Now", 100);
        books.put("Atomic Habbits", 300);
        books.put("4 hour work week", 400);
        books.put("Rich Dad poor dad", 1500);


        System.out.println(books);

    }
}
