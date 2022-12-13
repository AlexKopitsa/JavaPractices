// Class work 9
// JavaLabs4 Task 8.1 

package org.Java_labs.lab9;

public class Item{
    float price;
    String name;
    String type;
    public Item(){
        this.name = "";
        this.type = "";
    }
    public Item(float price, String name, String type){
        this.price = price;
        this.name = name;
        this.type = type;
    }
    public float getPrice(){
        return price;
    }
    public void setPrice(float price){
        this.price = price;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }   
    public String getType(){
        return type;
    }   
    public void setType(String type){
        this.type = type;
    }    
    @Override
    public String toString(){
        return "shop.Item " + name + ", price " + price;
    }
    public static void main(String[] args){
        Client cl = new Client("Name", "Surname", 1500.0);
        Payment p = new Payment(cl);
        Item item1 = p.order(EnumerateProducts.MEAT, "Chicken", 120);
        Item item2 = p.order(EnumerateProducts.BREAD, "Butter black bread", 45);
        Item item3 = p.order(EnumerateProducts.MEAT, "Steak", 217);
        System.out.println("shop.Payment: " + p.sum_money);
    }
}
