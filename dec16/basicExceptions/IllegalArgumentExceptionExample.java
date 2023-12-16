package dec16.basicExceptions;

public class IllegalArgumentExceptionExample {
    public static void main(String[] args) {
        int negativeValue = -5;

        if (negativeValue < 0) {
            throw new IllegalArgumentException("Value must be non-negative");
        }
    }
}
