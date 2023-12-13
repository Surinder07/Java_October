package dec12.innerdemo;

interface Furniture{
    void assemble();
}

abstract class Test{
    abstract void test();
}

public class MainFur {

    public void show(){
        Test test = new Test() {
            @Override
            void test() {

            }
        };
    }

    public static void main(String[] args) {
        MainFur fur = new MainFur();
        fur.test();
    }

    public void test() {

        // in java 8 this can be converted to lambda
        Furniture chair = new Furniture() {
            @Override
            public void assemble() {
                System.out.println(" Assembling the chair");
            }
        };

       /* Furniture desk = () -> System.out.println("Assembling the desk");
        desk.assemble();*/


        chair.assemble();

        Furniture table = new Furniture() {
            @Override
            public void assemble() {
                System.out.println("Assembling the table");
            }
        };
        table.assemble();
    }

}

// Annoymous inner class