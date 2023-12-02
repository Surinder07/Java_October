package dec2.oops;

public class Student {
    int rollno; // 201
    String name;

    public Student() {
        System.out.println("Default constructor... ");
    }

    public Student(int rollno) { // 101
        System.out.println("1 argument const : "+rollno); // 101
        this.rollno = rollno; // 101
    }
    public Student(int rollno, String name) { // 101
        this(rollno); // 101
        this.rollno = 201;
        this.name = name;
    }

    public void showDetails(){
        System.out.println("Roll no "+ rollno);
        System.out.println("Name "+ name);
    }

    public static void main(String[] args) {

        Student student = new Student(101, "Rajan");
        student.showDetails();
    }
}


// Employee object - name , email , salary
// create no argument const , creat 1 agr const, 2 arg , 3 arg const
// call no arg const from const 1
// 1 from 2
// 2 from 3