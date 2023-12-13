package dec12.inter.veh;

public interface Vehicle {
    void run();
    void accerlate();
    void topSpeed();
    void brake();
}

class Book {

}
class Car implements Vehicle{

    @Override
    public void run() {
        System.out.println("Car is running.. ");
    }

    @Override
    public void accerlate() {
        System.out.println("can can acceralte at 200 KM/Hr");
    }

    @Override
    public void topSpeed() {
        System.out.println("Car has top speed of 250KM/hr");
    }

    @Override
    public void brake() {

    }

    public boolean hasCarPlay(){
        System.out.println("Car support Apple and android car play ");
        return true;
    }
}

class Truck implements Vehicle{

    @Override
    public void run() {

    }

    @Override
    public void accerlate() {

    }

    @Override
    public void topSpeed() {

    }

    @Override
    public void brake() {

    }
}
class Bus implements Vehicle{

    @Override
    public void run() {

    }

    @Override
    public void accerlate() {

    }

    @Override
    public void topSpeed() {

    }

    @Override
    public void brake() {

    }
}