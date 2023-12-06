package dec5;

public class Student {
    String name;
    int rollno;
    Address address; // Has a relationship

    // streetno, houseno., city , priovince, country, postalcode
    public Student(String name, int rollno, Address address) {
        this.name = name;
        this.rollno = rollno;
        this.address = address;
    }

    public void printDetails(){
        System.out.println(name);
        System.out.println(rollno);
        System.out.println(address);
    }

    public static void main(String[] args) {
        Address address = new Address("101 chopin", "Toronto", "L3K 3R4","CA");
        Student student = new Student("Rajan",101, address);
        student.printDetails();
    }
}

// Ekam has a car [which type, what color, what brand, what model ]
// Name = first name, middle name, last name, preferred name, pet name