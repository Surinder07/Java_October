package dec16.basicExceptions;

public class ClassCastExceptionExample {
    public static void main(String[] args) {
        try {
            Object object = new Integer(42);
            String str = (String) object; // This will throw a ClassCastException
        } catch (ClassCastException e) {
            System.out.println("ClassCastException: " + e.getMessage());
        }
    }
}
