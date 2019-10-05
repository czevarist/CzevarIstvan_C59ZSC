
package kettes;

class RegularPolygon
{
    private int n;
    private double side;
    private double x;
    private double y; 

    public RegularPolygon()
    {
        this.n=3;
        this.side=1;
        this.x=0;
        this. y=0;

    }

    public RegularPolygon(int n, double side) {
        this.n = n;
        this.side = side;
        this.x = 0;
        this.y = 0;
    }

    public RegularPolygon(int n, double side, double x, double y) {
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
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

    public double getParimeter()
    {
        return this.n * this.side;
    }
    
     public double getArea()
    {
        return (1.0/4.0) * this.n * (this.side * this.side) * (1.0 / Math.tan(Math.toRadians(180/this.n)));
    }

    @Override
    public String toString() {
        return "Ez az oldalhossz: " + this.side + "\n" + "Ez az oldalak száma: " + this.n + "\n" 
                + "A " + this.n + " oldalú sokszög középpontja: (" + this.x + ";" + this.y + ")"
                + "\nKerülete: " + this.getParimeter() + "\n" + "Területe: " + this.getArea();
    }
}

public class Ketto
{
    public static void main(String[] args)
    {
        RegularPolygon rp1 = new RegularPolygon();
        RegularPolygon rp2 = new RegularPolygon(6, 4);
        RegularPolygon rp3 = new RegularPolygon(10, 4, 5.6, 7.8);

        System.out.println(rp1);
        System.out.println(rp2);
        System.out.println(rp3);
    }
    
}
