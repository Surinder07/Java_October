package dec12.inter;


// it should inherit from Bird and CanFly
public class Parrot extends Bird implements CanFly{
    @Override
    void eat() {
        System.out.println("Parrot is eating.. ");
    }

    @Override
    public void flying() {
        System.out.println("Parrot is flying..");
    }
}












