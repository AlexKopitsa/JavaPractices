package org.Java_labs.lab7;
import java.awt.*;
import java.util.Arrays;

public class Polinom {
    float[] coefficients;
    Polinom(float[] coefficients){
        this.coefficients = coefficients;
    }
    public float[] getСoefficients() {
        return coefficients;
    }
    public float[] setСoefficients(float[] coefficients) {
        this.coefficients = coefficients;
        return this.coefficients;
    }
    @Override
    public String toString() {
        return "Polinom {" + "coefficients: " + Arrays.toString(coefs) + '}';
    }
}
