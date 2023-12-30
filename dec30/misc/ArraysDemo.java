package dec30.misc;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraysDemo {
    public static void main(String[] args) {
        int[] numbers = {10, 12, 53, 23, 43, 43, 55, 22, 11, 12, 33,54};
        //int i = Arrays.binarySearch(numbers, 12);
        int i1 = Arrays.binarySearch(numbers, 1, 6, 12);
        System.out.println(i1);


        // sort
        Arrays.sort(numbers);
        for (int elements: numbers) {
            System.out.print(" "+elements);
        }


        // convert array to list
        List<int[]> ints = Arrays.asList(numbers);
        System.out.println(ints);

        List<Integer> list = Arrays.asList(10, 23, 23, 45, 334, 3, 4, 3);
        System.out.println(list);

        // Java 9
        List<Integer> list1 = List.of(12, 344, 24, 3,3 , 34, 3, 43, 4, 3, 6, 43);


    }
}
