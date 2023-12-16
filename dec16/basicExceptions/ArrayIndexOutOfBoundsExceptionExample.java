package dec16.basicExceptions;

public class ArrayIndexOutOfBoundsExceptionExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        System.out.println(numbers[5]); // This will throw an ArrayIndexOutOfBoundsException
    }
}
