package Masodik;

public class Teszt {
    public static void main(String[] args) {
         Triangle haromszog = new Triangle(1.0,1.5,1.0);
         haromszog.setColor("yellow");
         haromszog.setFilled(true);

        System.out.println("Terület: " + haromszog.getArea() + "\n" + "Kerület: " + haromszog.getPerimeter() + "\nSzine: " + haromszog.getColor() + "\nKitöltve:" + haromszog.isFilled());

    }
}
