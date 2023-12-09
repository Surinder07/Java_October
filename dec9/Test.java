package dec9;

abstract class A {
    int x = 10;
    int z = 10;

    public A(int x, int z) {
        this.x = x;
        this.z = z;
    }
}
class B extends A{
    int y = 20;


    public B(int x, int s) {
        super(x, s);
    }
}

public class Test {
    public static void main(String[] args) {

    }
}
