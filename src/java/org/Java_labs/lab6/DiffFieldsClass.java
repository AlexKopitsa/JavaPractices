package org.Java_labs.lab6;

public class DiffFieldsClass {
    public static void print(){
        System.out.print("public");
    }
    private static void privatePrint(){ 
        System.out.printf("private"); 
    }
    protected static void protectedPrint(){ 
        System.out.printf("protected"); 
    }
    void defPrint(){
        System.out.printf("default");
    }
}