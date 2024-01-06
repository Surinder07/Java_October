package jan6;

import java.util.Comparator;

public class Vehicle {
    String brand;
    int makeYear;

    public Vehicle(String brand, int makeYear) {
        this.brand = brand;
        this.makeYear = makeYear;
    }


    @Override
    public String toString() {
        return "Vehicle{" +
                "brand='" + brand + '\'' +
                ", makeYear=" + makeYear +
                '}';
    }
}
