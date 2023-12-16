package dec16;

import java.util.Scanner;

public class TestException {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first the number ");

        int num1 = scanner.nextInt();

        System.out.println("Enter the second number ");
        int num2 = scanner.nextInt();

        int div = 0;
        try {
            div = num1 / num2;
            System.out.println("Hello after exception ");

        }
        catch (ArithmeticException e){
            System.out.println(e);
        }
        System.out.println(div);





    }
}
