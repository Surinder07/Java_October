package nov25.staticdemo;

public class Student {

     int id;
     String name;
     static String schoolName = "Pragra";

    public Student(int id, String name ) {
        this.id = id;
        this.name = name;
    }

    public void showDetails(){
         System.out.println(id);
         System.out.print(name);
         System.out.print(schoolName);
     }

    public static void main(String[] args) {
        Student student1 = new Student(101, "Chirag");
        student1.showDetails();

        Student student2 = new Student(102, "Rajan");
        student2.showDetails();

        Student student23 = new Student(102, "Rajan");
        student23.showDetails();


    }
}
