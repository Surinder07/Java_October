package nov14;

import java.util.Scanner;

public class RecapDemo {
    public static void main(String[] args) {

        // Scanner - user input
        // what it does?  How and why?
        Scanner scanner = new Scanner(System.in);
        // switch case :

        System.out.println("Enter your input");
        int input = scanner.nextInt();
        switch (input){
            case 1 :
                System.out.println("Fan");
                break;
            case 2 :
                System.out.println("Bulb ");
                break;

            case 3 :
                System.out.println("Tubelight ");
                break;

            default:
                System.out.println("wrong input");
    }




        /*

        if()
        else if()
        else if()
        else

         */






   /*     System.out.println("Enter the value of x : ");
        int x = scanner.nextInt();

        System.out.println("Enter the value of y :");
        int y = scanner.nextInt();

        int sum = x + y;

        System.out.println("Sum of two numbers : " +sum);

        // next()  --- cover till white space

        System.out.println("Enter name : ");
        String name = scanner.nextLine();
        System.out.println(name);

    */

    }
}


 /*
        if else ladder
        taking user input, scanner
        switch case

         */