package nov25.staticdemo;

public class StaticMethodDemo {

    public static void show(){
        StaticMethodDemo s  = new StaticMethodDemo();
         s.display();
    }

    public  void display(){
        System.out.println("Display method");
    }

    public static void main(String[] args) {

        StaticMethodDemo.show();



    }
}
