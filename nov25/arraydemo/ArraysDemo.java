package nov25.arraydemo;

import java.util.Scanner;

public class ArraysDemo {
    public static void main(String[] args) {
        //int x = 10;
        // size
       // int[] numbers = {10,20,30,40,50,60,70,80,90,100};

        int[] num = new int[5];
       /* String[] names = {"Rajan","Arpinder","Pankaj"};
        System.out.println(names[2]);*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the elements of array");

        for (int i = 0; i <num.length ; i++) {
            num[i] = scanner.nextInt();
        }

        // 0  .........9 --- length =

        for (int i = 0; i < num.length ; i++) {
            System.out.println(num[i]);
        }

    }
}

