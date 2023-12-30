package dec30.misc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CollectionsClassDemo {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(90);
        list.add(90);
        list.add(70);
        list.add(90);
        list.add(60);
        System.out.println(list);
        System.out.println(Collections.min(list));
        System.out.println(Collections.max(list));
        System.out.println(Collections.frequency(list, 90));
        Collections.sort(list);
        System.out.println("List after sorting "+ list);

        // home take assignment for research
        // CopyOnWriteArrayList - thread safe arrayList

    }
}
