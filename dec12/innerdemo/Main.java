package dec12.innerdemo;

class OuterClass{
    int x = 20;

    class InnerClass{
        int y = 10;
        public void insideInnerMethod(){
            System.out.println("Inside inner method ");
        }
    }
}
public class Main {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        outerClass.x = 20;
        System.out.println(outerClass.x);


        // how to call inner class
        // need ? ==== encapsulation ,

        OuterClass.InnerClass innerClassObject = outerClass.new InnerClass();
        innerClassObject.insideInnerMethod();

    }
}
