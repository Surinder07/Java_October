package dec16.basicExceptions;

public class NullPointerExceptionExample {
    public static void main(String[] args) {
        String text = null;
        System.out.println(text.length()); // This will throw a NullPointerException
    }
}


