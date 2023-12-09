package dec9.poly;

class Shape{

    private double side;

    public double area(){
        return 0.0;
    }

    public void show(int x, int y ){

    }

}
class Rectangle extends Shape{

    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

}

class Square extends Shape{
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double area(){
        return side * side;
    }
}

/*class Triangle extends Shape{
    @Override
    public double area() {
        return super.area();
    }
}*/

class Circle extends Shape{
    private double radius;
    private double PI = 3.14;

    public double area(){
        return PI * radius * radius;
    }

}

public class ShapeMain {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(10,20);
        System.out.println("Area of rectangle :"+rectangle.area());

        Square square = new Square(5);
        System.out.println("Area of Square :"+ square.area());

    }
}
