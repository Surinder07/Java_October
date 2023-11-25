package nov25.arraydemo;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {

        int[] numbers = {10,20,30,40,50};

        int start = 0;  // index = 0
        int end = numbers.length -1;  // index = 4


        for (int i = 0; i <  numbers.length/2 ; i++) {

        }

        while(start < end){  // 0   < 4 , 1, 3  , 2,2

            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;
            start ++;
            end --;
        }

        for (int elements: numbers) {
            System.out.print(" "+elements);
        }
    }
}

// can you find largest and smallest  element of array
// sort an array
// search for element in array
