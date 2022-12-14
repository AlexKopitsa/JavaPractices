// Class work 9
// JavaLabs4 Task 8.1 

package org.Java_labs.lab9;

class SREException extends ArithmeticException {
    private final String detail;
    SREException(String message) {
        detail = message;
    }
    @Override
    public String toString() {
        return detail;
    }
}
class DiscriminatorException extends ArithmeticException {
    private final double a;
    private final double b;
    private final double c;
    private final double d;
    DiscriminatorException(String message, double a, double b, double c, double d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    @Override
    public String toString() {
        return "Discriminator is " + d + " for a, b, c: " + a + ", " + b + ", " + c;
    }
}
