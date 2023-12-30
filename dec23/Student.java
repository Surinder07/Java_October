package dec23;

public class Student<T,R> {
    T id;
    R name;

    public Student(T id, R name) {
        this.id = id;
        this.name = name;
    }


    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }

    public R getName() {
        return name;
    }

    public void setName(R name) {
        this.name = name;
    }

    public void printDetails(){
        System.out.println("Student id : " + id);
        System.out.println("Student Name : " +name);
    }
}
