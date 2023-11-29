package nov25.arraydemo;

import java.util.Scanner;

public class ArrayTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your elements");
        int arr[] = new int[5];

        for (int i = 0; i <arr.length ; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println();
        System.out.println("print the elements of array");
      /*  for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }*/
        
        // for each - enchaced for loop 

        // for every element in array , return that element
        for (int element : arr) {
            System.out.println(element);
        }
    }
}

/*
   array  int  --->  2, 3 , 4, 5 ,6, 7, 8, 999,100



 */