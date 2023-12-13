package dec12.innerdemo;

class Laptop{

    public void surfInternet(){
        System.out.println("surfing internet");
    }

    static class HardDrive{
        public void spin(){
            System.out.println("Hard drive spins");
        }
    }

    static class GraphicsCard{

    }
    static class  Motherboard{

    }

}

public class StaticInnerDemo {
    public static void main(String[] args) {

        Laptop.HardDrive hardDrive = new Laptop.HardDrive();
        hardDrive.spin();
    }
}
