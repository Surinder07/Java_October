package dec16.basicExceptions;

public class NumberFormatExceptionExample {
    public static void main(String[] args) {
        String notANumber = "abc";
        int num = Integer.parseInt(notANumber); // This will throw a NumberFormatException
    }
}
