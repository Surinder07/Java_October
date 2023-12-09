package dec9.poly;

class Coffee {
    private int price;
    public void makeCoffee(){
        System.out.println("Coffee is brewing ");
    }

    public void makeCoffee(int x, int y ){
        System.out.println("Coffee is brewing ");
    }
}

class TimHortons extends Coffee{

    public void makeCoffee(int x ) {
        System.out.println("Tim hortons coffee");
    }

}
public class CoffeeMain {
    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        coffee.makeCoffee();

        TimHortons timHortons = new TimHortons();
        timHortons.makeCoffee();

    }
}

// example : Grocery (Super class ) --- shopping and collectingPoints
// Costco, Walmart, No frills[], Panchvati[no specific of this ]
/*

final - variable--- constant
, final method--- you can not override ,
 final class -- can not be inherited / extend


 */