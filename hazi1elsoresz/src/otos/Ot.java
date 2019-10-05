
package otos;

class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        return (this.b * this.b) - (4 * this.a * this.c);
    }

    public double getRoot1() {
        if (getDiscriminant() < 0)
            return 0;

        return (-(this.b) + Math.sqrt(getDiscriminant())) / (2 * this.a);
    }

    public double getRoot2() {
        if (getDiscriminant() < 0)
            return 0;

        return (-(this.b) - Math.sqrt(getDiscriminant())) / (2 * this.a);
    }

    @Override
    public String toString() {
        double disc = getDiscriminant();
        if (disc > 0) {
            return getRoot1() + " " + getRoot2();
        } else if (disc == 0) {
            return getRoot1() + "";
        } else {
            return "The equation has no roots.";
        }
    }
}

public class Ot {
    public static void main(String[] args) {
        QuadraticEquation qe1 = new QuadraticEquation(1, -6, 9);

        System.out.println(qe1);
    }
}
