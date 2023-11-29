package nov28;

public class Student {
    int rollno;


    public Student(int rollno) {
        this.rollno = rollno;

    }

}
class Main{
    public static void main(String[] args) {

        String s1 = new String("Test");
        System.out.println(s1);

        Student student = new Student(105);
        System.out.println(student);

        Student student2 = new Student(105);
        System.out.println(student2);


     /*

     A  toString()
     |
     B

      */

        // toString() - which returns the string representation of object

    }
}
