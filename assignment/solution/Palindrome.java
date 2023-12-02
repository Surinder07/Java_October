package assignment.solution;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string you want to check");
        String s = scanner.next();
        boolean palindrome = isPalindrome(s);
        if(palindrome == true){
            System.out.println("String is palindrome");
        }else {
            System.out.println("Not a palindrome string");
        }

    }
    public static boolean isPalindrome(String input){

        for (int i = 0; i < input.length()/2; i++) {
            if(input.charAt(i) != input.charAt(input.length()-1-i)){
                return false;
            }
        }
        return true;
    }
}
