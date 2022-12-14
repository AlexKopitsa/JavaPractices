// Class work 9
// JavaLabs4 Task 8.1 

package org.Java_labs.lab9;

public class Bread extends Item {
    String butter;
    Bread() {
        super();
        this.type = "flour product";
    }
    Bread (float price, String name, String butter) {
        super(price, name, "flour product");
        this.butter = butter;
    }
	public void setButter(String butter) {
        this.butter = butter;
    }
    public String getButter() {
        return butter;
    }
}
