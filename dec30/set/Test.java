package dec30.set;

import java.util.*;

public class Test {
    public static void main(String[] args) {

       /* Set<Integer> set = new TreeSet<>();

        set.add(10);
        set.add(20);
        set.add(30);
        set.add(30);
        set.add(50);
        set.add(60);
        set.add(15);
        System.out.println(set);*/

        Set<Integer> set2 = new LinkedHashSet<>();

        set2.add(10);
        set2.add(20);
        set2.add(30);
        set2.add(30);
        set2.add(50);
        set2.add(60);
        set2.add(15);
        set2.add(null);
        System.out.println(set2);

        // 10, 12, 53, 23, 43,43, 55, 22, 11, 12, 33, 12, 43, 53,55,22,33
        // print without any duplicates

        List<Integer> list = Arrays.asList(10, 12, 53, 23, 43, 43, 55, 22, 11, 12, 33, 12, 43, 53, 55, 22, 33);

        System.out.println(list);

    }
}
