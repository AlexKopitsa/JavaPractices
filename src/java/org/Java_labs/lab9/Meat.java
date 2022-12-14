// Class work 9
// JavaLabs4 Task 8.1 

package org.Java_labs.lab9;

public class Meat extends Item{
    String state;
    Meat(){
        super();
        this.type = "animal";
    }
    Meat(float price, String name, String state){
        super(price, name, "animal");
        this.state = state;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
}
