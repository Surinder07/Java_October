package dec5;

public class Vehicle {
    String color;
    String model;

    public Vehicle(String color, String model) {
        this.color = color;
        this.model = model;
    }

    public void printDetails(){
        System.out.println("Color : "+color);
        System.out.println("model : "+model);
    }
}

class Car extends Vehicle{

    String bodyType;

    public Car(String color, String model, String bodyType) {
        super(color, model);
        this.bodyType = bodyType;
    }

    public void displayCar(){
        System.out.println(bodyType);
    }
}

class  Hyundai extends Car{

    String engineType;

    public Hyundai(String color, String model, String bodyType, String engineType) {
        super(color, model, bodyType);
        this.engineType = engineType;
    }

    public void displayHyundai(){
        System.out.println(color);
        System.out.println(model);
        System.out.println(engineType);
    }
}

class VehicleDemo {
    public static void main(String[] args) {

       /* Car car = new Car("Red", "Honda","Sedan");
        car.printDetails();
        Vehicle vehicle = new Vehicle("Blue","Tesla");
        vehicle.printDetails();*/
        Hyundai hyundai = new Hyundai("Green","Elantra","Sedan","Petrol");
        hyundai.displayHyundai();
        hyundai.printDetails();
        hyundai.displayCar();

    }
}

/*
multiv level
A
|
B
|
C*

          Heirarchical                   multiple [not in java class]
           A                            A show(String a)              B show(String a)
         |  |                                                |
        B   C                                                C
                                        C c = new C();
                                         c.show();  // Diamond problem


              Hierachical :
              BankAccount : String accountHolder, double  balance
              method : displayInfo, addFunds, withdraw funds, balance()

              Savings                        Checking Account
              double interest rate           double overdraft limit

                      Savings          Checking checking = new Checking();

/
 */
