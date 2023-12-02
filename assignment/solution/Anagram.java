package assignment.solution;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string you want to check");
        String first = scanner.next();

        System.out.println("Enter the second string you want to check");
        String second = scanner.next();

        boolean palindrome = isAnagram(first, second);
        if(palindrome == true){
            System.out.println("Strings are anagram");
        }else {
            System.out.println("Not anagram");
        }

    }

    public static boolean isAnagram(String first, String second){

        if(first.toLowerCase().length() == second.toLowerCase().length()){
            char[] firstArray = first.toCharArray();
            char[] secondArray = second.toCharArray();

            Arrays.sort(firstArray);
            Arrays.sort(secondArray);

            if(Arrays.equals(firstArray, secondArray)){
                return true;
            }
        }
        return false;
    }
}
