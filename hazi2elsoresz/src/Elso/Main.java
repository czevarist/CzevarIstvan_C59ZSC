package Elso;

class Circle extends GeometricShape{
    private double radius;
    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius,String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea()
    {
        return this.radius * this.radius * Math.PI;
    }

    public double getPerimeter()
    {
        return 2 * this.radius * Math.PI;
    }

    public double getDiameter()
    {
        return 2 * this.radius;
    }

}

class Rectangle extends GeometricShape {
    private double width;
    private double height;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width, double height, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea()
    {
        return this.height * this.width;
    }

    public double getPerimeter()
    {
        return 2 * (this.width + this.height);
    }

}




public class Main {
    public static void main(String[] args) {


        Circle circle = new Circle(1.0);
        System.out.println("A circle " + circle.toString());
        System.out.println("The radius is " + circle.getRadius());
        System.out.println("The area is " + circle.getArea());
        System.out.println("The diameter is " + circle.getDiameter());
        Rectangle rectangle = new Rectangle(2.0, 4.0);
        System.out.println(System.getProperty("line.separator") + "A rectangle " + rectangle.toString());
        System.out.println("The area is " + rectangle.getArea());
        System.out.println("The perimeter is " + rectangle.getPerimeter());
    }
}