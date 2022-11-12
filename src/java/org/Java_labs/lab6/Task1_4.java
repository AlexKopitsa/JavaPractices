package org.Java_labs.lab6;

class ProtectedClass{
    protected int res = 0;
    protected void func(int x){
        res = 5 * x + 5;
        System.out.printf(res);
    }
}
public class Task1_4 {
    public static void main(String[] args){
        ProtectedClass pc = new ProtectedClass();
        pc.func(5); 
    }
}
