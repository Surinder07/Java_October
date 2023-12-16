package dec16;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        try {
            int[] arr = new int[5];
            arr[0] = 10;
            arr[1] = 10;
            arr[2] = 10;
            arr[3] = 10;
            arr[4] = 10;
            arr[5] = 10;
        }

        catch (ArrayIndexOutOfBoundsException | ArithmeticException e){
            e.printStackTrace();
        }

        System.out.println("Hello world ");

    }
}
/*

make a division ---
use scanner input
double num




 */