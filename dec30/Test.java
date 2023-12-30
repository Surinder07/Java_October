package dec30;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

     /*   // loop
        System.out.println("List using for loop ");
        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));
            //list.remove(20);
        }*/
      // -3 -2 -1 0 1 2 3
       /* // ehnaced for loop -- for each loop
        System.out.println("List using for each loop ");
        for (Integer element : list){
            list.remove(new Integer(10));
            System.out.println(element);
        }*/

        // Iterator
        System.out.println("Iterator ");
        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()){

            Integer element = iterator.next();
            if(element == 30){
                iterator.remove();
                //list.remove(10); this will throw ConcurrentModificationException
                // while using iterator use iterator.remove() method to remove element in collection
            }
        }
        System.out.println(list);
    }
}

// List of numbers -, Strings 1 , 10 ,
// for loop, for each and iterator ,