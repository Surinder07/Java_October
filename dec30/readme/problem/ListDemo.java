package dec30.readme.problem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
      List<Student> list = new ArrayList<>();
      list.add(new Student(101, "Arpinder", 20));
      list.add(new Student(102, "Pankaj", 22));
      list.add(new Student(103, "Kunal", 21));
      list.add(new Student(104, "Rajan", 24));
      list.add(new Student(105, "Ekam", 24));
      list.add(new Student(106, "Surinder", 28));
      list.add(new Student(107, "Sachin", 40));
      list.add(new Student(108, "Ranveer", 17));

      // filter the students with age greater than 21
        // filter with course

        Iterator<Student> iterator = list.listIterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.age > 20) {
                System.out.println(student);
            }
        }

    }
}
class Student{
    int id;
    String name;
    int age;

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}