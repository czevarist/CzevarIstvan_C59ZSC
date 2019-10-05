
package hatos;

class LinearEquation {
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;

    public LinearEquation(int a, int b, int c, int d, int e, int f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public int getD() {
        return d;
    }

    public int getE() {
        return e;
    }

    public int getF() {
        return f;
    }

    public boolean isSolvable() {
        if ((this.a * this.d) - (this.b * this.c) == 0) {
            return false;
        }

        return true;
    }

    public double getX() {
        return (this.e * this.d - this.b * this.f) / (this.a * this.d - this.b * this.c);
    }

    public double getY() {
        return (this.a * this.f - this.e * this.c) / (this.a * this.d - this.b * this.c);
    }

    @Override
    public String toString() {
        if (!isSolvable()) {
            return "The equation has no solution.";
        }

        return "X: " + getX() + ", Y: " + getY();
    }
}

public class Hat {
    
    public static void main(String[] args) {
        LinearEquation le1 = new LinearEquation(1, 2, 3, 4, 5, 6);
        LinearEquation le2 = new LinearEquation(6, 7, 8, 9, 10, 11);
        LinearEquation le3 = new LinearEquation(5, 9, 4, 12, 8, 1);

        System.out.println(le1);
        System.out.println(le2);
        System.out.println(le3);
    }
    
}
