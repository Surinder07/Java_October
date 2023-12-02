package dec2.oops;

class Iphone14{
    int size;
    String color;
    int ram;

    Iphone14(){

    }
    public Iphone14(int size, String color, int ram) {
        this.size = size;
        this.color = color;
        this.ram = ram;
    }

    public void showSpecifications(){
        System.out.println(size);
        System.out.println(color);
        System.out.println(ram);
    }
}
class Iphone15 extends Iphone14{

    public void showNewSpecifications(){
        System.out.println(size);
        System.out.println(color);
        System.out.println(ram);

    }
}
public class IphoneMain {
    public static void main(String[] args) {
        Iphone15 obj = new Iphone15();
        obj.showNewSpecifications();
    }
}
// Single inheritance
// create employee  - empd id , salary, role, email
// create Sr Manager   - empd id , salary, role, email, department
// employee -----> Manager
// create object of Manager

// Computer - machine
// web browser ----- google chrome
// Car -- honda
// Emirates is a airline
// Cricket is a sport
//Pizza is food

// IS-A

// Object class
