package nov11;

import java.util.Scanner;

public class SwitchDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to my calculator");
        System.out.println("1. Press 1 for addition");
        System.out.println("2. Press 2 for subtraction");
        System.out.println("3. Press 3 for multiplication");
        System.out.println("4. Press 4 for division");
        System.out.println("5. Press 5 for modulus");
        System.out.println("Invalid input ");

        int input = scanner.nextInt();

        // integer
        switch (input){
            case 1:

                break;

            case 2 :
                System.out.println("Pressed switch case 2 ");
              break;

            case 3 :
                System.out.println("Pressed switch case 3 ");
                break;

            default:
                System.out.println("Invalid input ");
        }
        // do you want to continue ? (Y , N )
    }
}
// user input
//

// create a calculator all the options
// put default ---invalid input

/*
IVR system
 1. Press 1 for english [switch case ]
      ---> 1. Press 1 for Mobile   [if else ]
          ----> 1. Press 1 for Billing
          ----> 2. Press 2 for Tech support
          ----> 3. Press 3 for cancellation
      ---- 2. Press 2 for internet
      ---->    1. Press 1 for Billing
          ----> 2. Press 2 for Tech support
          ----> 3. Press 3 for cancellation
      ----> 3. Press 3 for Tv
          ----> 1. Press 1 for Billing
          ----> 2. Press 2 for Tech support
          ----> 3. Press 3 for cancellation
      ----> 4. Press for customer support
          ----> 1. Press 1 for Billing
          ----> 2. Press 2 for Tech support
          ----> 3. Press 3 for cancellation
      ----> 5. Press 5 to return to previous menu

2. Press 2 for french




 */
