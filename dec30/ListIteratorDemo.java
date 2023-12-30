package dec30;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(50);
        list.add(50);
        list.add(null);
        list.add(null);


        ListIterator<Integer> listIterator = list.listIterator();

        System.out.println("List Iterator Next");
        while (listIterator.hasNext()){

            System.out.println(listIterator.next());
        }

        System.out.println("List Iterator previous");
        while (listIterator.hasPrevious()){

            System.out.println(listIterator.previous());
            //System.out.println(listIterator.previousIndex());
        }

    }
}


