
package harmas;


class Rectangle {
    private double width = 1.0;
    private double height = 1.0;

    public Rectangle() {
        this.width = 4.2;
        this.height = 2.8;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    double getArea() {
        return this.width * this.height;
    }

    double getParimeter() {
        return (this.width + this.height) * 2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                ", parimeter=" + getParimeter() +
                ", area=" + getArea() +
                '}';
    }
}


public class Harom {
    
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(4, 40);
        Rectangle r2 = new Rectangle(3.5, 35.9);
        System.out.println(r1);
        System.out.println(r2);
    }
    
}
