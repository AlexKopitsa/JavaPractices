// Class work 9
// JavaLabs4 Task 8.1 

package org.Java_labs.lab9;
import java.util.Scanner;
import java.util.InputMismatchException;

public class WrongType {
    static Scanner sc = new Scanner(System.in);
    private double d;
    public double readDouble() throws InputMismatchException {
        try {
            d = sc.nextDouble();
        } catch(InputMismatchException e) {
            System.out.println("Can't convert to double");
            throw e;
        }
        return d;
    }
}
