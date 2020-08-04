package task3;

public class Square implements Shape {

    double side; //длина стороны квадрата

    //конструктор
    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    public static void main(String[] args) {
        Square squareRunner = new Square(2.5);
        System.out.println("Площадь квадрата: " + squareRunner.getArea());
        System.out.println("Периметр квадрата: " + squareRunner.getPerimeter());
    }
}
