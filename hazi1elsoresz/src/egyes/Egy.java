
package egyes;

class Pont
{
    private double x, y;

    public Pont(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}

public class Egy {
    public static void main(String[] args) {
        Pont p1 = new Pont(1,2);
        Pont p2 = new Pont(3,4);
        Pont p3 = new Pont(5,6);
        Pont p4 = new Pont(7,8);
        p1.setY(5 + p1.getY());
        p2.setY(5 + p2.getY());
        p3.setX(-3.4 + p3.getX());
        p4.setX(-3.4 + p4.getX());

        System.out.println(p1.getY() + "\n" + p2.getY() + "\n" + p3.getX() + "\n" + p4.getX());
    }
}