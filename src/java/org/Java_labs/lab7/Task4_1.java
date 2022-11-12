package org.Java_labs.lab7;
import java.util.Random;

public class Task4_1 {
    public static void main(String[] args) {
        int n = 17;
        Polinom[] listOfPolinoms = new Polinom[n];
        for (int i = 0; i < n; i++){
            float[] arrOfFloats = new float[10];
            for (int j = 0; j < 10; j++){
                float generatedFloat = new Random().nextFloat();
                arrOfFloats[j] = generatedFloat;
            }
            listOfPolinoms[i] = new Polinom(arrOfFloats);
        }
        for (Polinom polinom : listOfPolinoms){
            System.out.println(polinom);
        }
        float sumOfPolinoms = 0.0F;
        for (Polinom polinom : listOfPolinoms){
            for (float coefficients : polinom.coefs){
                sumOfPolinoms += coefficients;
            }
        }
        System.out.println("Sum: " + sumOfPolinoms);
    }
}
