package dec12;

public abstract class Test {
    abstract void test();

    void show(){
        System.out.println("show method... ");
    }
}
class Testing extends Test{

    void test(){
        System.out.println("test method");
    }
}

class Main{
    public static void main(String[] args) {
        // you can make object of abstract classes
        //Test test = new Test();

        // Parent class ref ----- child class object
        Test testing = new Testing();
        testing.test();
    }
}
