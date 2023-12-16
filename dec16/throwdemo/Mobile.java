package dec16.throwdemo;


import java.util.Scanner;

public class Mobile {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the age");
        int age = scanner.nextInt();
        try {

            getAge(age);
        }
        catch (InvalidAgeException e ){

        }

    }

    public static void getAge(int age) throws InvalidAgeException {


            if (age < 18) {
                //throw new RuntimeException("You are not eligible to vote");
                throw new InvalidAgeException("You are not eligible to vote, age less than 18");
                }
             else {
                System.out.println("You can vote");
            }



    }
}

/*

throw
throws

// custom exceptions

 */
