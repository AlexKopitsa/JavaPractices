// Class work 9
// JavaLabs4 Task 8.1 

package org.Java_labs.lab9;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        double a, b, c;
        WrongType io = new WrongType();
        try {
            SquareRootEquation qadr1 = new SquareRootEquation(2, -6, 4);
            qadr1.solution();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        try {
            SquareRootEquation qadr2 = new SquareRootEquation(1, 2, 3);
            qadr2.solution();
        } catch (DiscriminantEqnException e) {
            e.printStackTrace();
        }
        try {
            SquareRootEquation qadr3 = new SquareRootEquation(0, 2, 3);
            qadr3.solution();
        } catch (SquareRootEquation e) {
            e.printStackTrace();
        }
        try {
            System.out.println("Input a, b, c: ");
            a = io.readDouble();
            b = io.readDouble();
            c = io.readDouble();
            SquareRootEquation qadr = new SquareRootEquation(a, b, c);
            qadr.solution();
            qadr.printRoots();
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }
    }
}
