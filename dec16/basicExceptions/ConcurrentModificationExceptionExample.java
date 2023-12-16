package dec16.basicExceptions;

import java.util.ArrayList;
import java.util.List;

public class ConcurrentModificationExceptionExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        for (Integer number : numbers) {
            numbers.remove(number); // This will throw ConcurrentModificationException
        }
    }
}
