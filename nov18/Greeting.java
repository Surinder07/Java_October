package nov18;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        // input from user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name ");
        String name = scanner.next();

        System.out.println("Enter your greeting ");
        String greeting  = scanner.next();

        System.out.println("Enter your Language ");
        String lang  = scanner.next();

        System.out.println(greeting(name, greeting));
    }

    public static String greeting(String name, String greeting){
        return greeting + name;
    }


    public static String greeting(String name, String greeting, String spanish){
        return spanish +" "+ name;
    }
}

// name
// language   : Spanish - languages , French, spanish, English, Hindi, Punjabi

// based on language print out : greeting
//  Ola Surinder

// method overloading vs method overriding [inheritance ]