package jan2;

import java.util.*;

public class HashMapIt {
    public static void main(String[] args) {

        Map<String, Integer> stocks = new HashMap<>();
        stocks.put("Facbook", 100);
        stocks.put("Google", 200);
        stocks.put("Microsoft", 150);
        stocks.put("Tesla", 300);
        stocks.put("Amazon", 550);

        Set<Map.Entry<String, Integer>> entrySet = stocks.entrySet();

        Iterator<Map.Entry<String, Integer>> iterator = entrySet.iterator();

        while (iterator.hasNext()){
            Map.Entry<String, Integer> next = iterator.next();

            System.out.println(next.getValue());
            System.out.println(next.getKey());
        }
    }
}
