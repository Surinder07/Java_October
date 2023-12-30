package dec23;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentMain {
    public static void main(String[] args) {
        //  Generic type object - it accepts any type of value
        // type checking is done at comp
        Student<Integer, Integer> student = new Student<>(101,202);
        Student<String, String> student2 = new Student<>("01121Abc", "Rajan");

    }
}
