package dec2.oops;


class Vehicle{ // parent class  , super class , base class

    int fuelCap;

    Vehicle(){
        fuelCap = 200;
        System.out.println("Vehchile class : "+fuelCap);
    }

}

class Car extends Vehicle{  // child , subclass , derived class
    int fuelCap;

    public Car() {

    }

    // this -- referes to current class, properties
    // super -- referes to the parent class properties
    public void showCarDetails(){
        System.out.println("Fule capacity "+ fuelCap);
    }

}
public class SuperDemo {
    public static void main(String[] args) {

        Car car = new Car();
        car.showCarDetails();
    }
}
