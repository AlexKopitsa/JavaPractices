package org.Java_labs.lab3;

public class Task1_4 {
    public static class Measure{
        float a ;
    }

    public static void main(String[] args) {
        Measure x = new Measure();
        Measure y = x;
        x.a = 9.0f;
        System.out.println(y.a);
        System.out.println(x.a);

    }

}
