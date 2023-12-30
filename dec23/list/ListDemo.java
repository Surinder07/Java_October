package dec23.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        // upcasting
        List<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(30);
        list.add(50);
        list.add(null);
        list.add(null);
        System.out.println("Old List " + list);

        System.out.println(list.get(4));

       /* List<Integer> list2 = new ArrayList<>();
        list2.add(3213);
        list2.addAll(list);

        System.out.println("New List "+list2);*/


        List apples = new ArrayList(50);
        List vegetables = new ArrayList(apples);

        System.out.println(list.contains(10));

        // 10 minutes



    }
}
