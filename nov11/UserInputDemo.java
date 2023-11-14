package nov11;

import java.util.Scanner;

public class UserInputDemo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first name");
        String firstName = scanner.next();

        System.out.println("Enter the last name");
        String lastName = scanner.next();

        System.out.println(firstName +" "+lastName);





       /* System.out.println("Welcome to my calculator...");
        System.out.println("Best calculator in world");

        // which takes user input of primitive types
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the value of x : ");
        int x = scanner.nextInt(); // 10

        System.out.println("Enter the value of y : ");
        int y = scanner.nextInt();

        int sum = x + y;
        System.out.println("Sum  : "+sum);*/
    }
}
//   x= y= z=
//  take user input for 3 numbers and check which 1 is smaller.