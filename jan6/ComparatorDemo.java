package jan6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {
    public static void main(String[] args) {

        List<Vehicle> list = new ArrayList<>();
        list.add(new Vehicle("Honda",2019 ));
        list.add(new Vehicle("Hyundai",2022 ));
        list.add(new Vehicle("Audi",2023 ));
        list.add(new Vehicle("Merc",2016 ));
        list.add(new Vehicle("BMW",2015 ));
        list.add(new Vehicle("VW",2024 ));

        Collections.sort(list, new BrandComparator());

        for (Vehicle l: list ) {
            System.out.println(""+l.brand  +"  "+l.makeYear);

        }

        //Comparator

        // Mobile class - brand , price
        // take comparator , implement comparator
        // compare using the price





       /* List<Integer> list2 = new ArrayList<>();
        list2.add(10);
        list2.add(20);
        Collections.sort(list2);*//*

        // Comparable
        Collections.sort(list);
        System.out.println(list);

        // make a student object , name and age
        // sort based on the age.*/
    }
}
//