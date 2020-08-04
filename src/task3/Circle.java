package task3;

public class Circle implements Shape {
    public double radius; //радиус круга

    //конструктор
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public double getPerimeter() {
        return radius * 2 * Math.PI;
    }


    public static void main(String[] args) {
        Circle circleRunner = new Circle(10);
        System.out.println("Площадь круга: " + circleRunner.getArea());
        System.out.println("Периметр круга: " + circleRunner.getPerimeter());
    }

}

