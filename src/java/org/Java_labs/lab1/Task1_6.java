package org.Java_labs.lab1;

public class Task1_6 {
    public static void main(String[] args) throws NumberFormatException{
        float summ = 0;
        int counter = 0;
        for (String s : args) {
            float arg = Float.parseFloat(s);
            summ += arg;
            counter += 1;
//            System.out.println("Argument " + arg);
        }
        System.out.println("Summ "+summ);
        System.out.println("Count of args "+counter);
    }
}
