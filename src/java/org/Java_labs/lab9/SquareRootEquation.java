// Class work 9
// JavaLabs4 Task 8.1 

package org.Java_labs.lab9;

public class SquareRootEquation {
    private double a, b, c, x1, x2;
    SquareRootEquation () {}
    SquareRootEquation (double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public void setEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double discriminant() throws DiscriminatorException {
        double d = b * b - 4 * a * b;
        if (d < 0) {
            throw new DiscriminatorException("Can't solve complex numbers equation", a, b, c, d);
        }
        return d;
    }
    public void solution() throws DiscriminatorException, SREException {
        try {
            if (a == 0) throw new SREException("It's not a square root equation");
            double d = discriminant();
            double x1 = (- b - Math.sqrt(d)) / (2 * a);
            double x2 = (- b + Math.sqrt(d)) / (2 * a);
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
            this.x1 = x1;
            this.x2 = x2;
        } catch (SREException e) {
            System.out.println(e);
            throw new SREException("Division by 0");
        } catch (DiscriminatorException e) {
            throw e;
        }
    }
    public void printRoots() {
        System.out.println("Roots: x1 = " + x1 + ", x2 = " + x2);
    }
}
