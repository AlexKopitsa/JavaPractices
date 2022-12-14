// Class work 9
// JavaLabs4 Task 8.1 

package org.Java_labs.lab9;

public class Payment{
    static class Warehouse{
        public void get(Item item){
            System.out.println("Get shop.Item: " + item);
        }        
        public void find(Item item){
            System.out.println("Find shop.Item: " + item);
        }       
        public void sell(Item item){
            System.out.println("Sell shop.Item: " + item);
        }
    }    
    private Warehouse stock;
    private Client client;
    float sum_money;   
    public Payment(Client client){
        this.client = client;
        this.stock = new Warehouse();
        this.sum_money = 0;
    }   
    void setClient(Client c){
        this.client = c;
    }   
    Client getClient(){
        return client;
    }   
    public Item order(EnumerateProducts prod, String name, float price){
        Item item = this.client.order(prod, name, price);
        this.stock.find(item);
        this.stock.sell(item);       
        this.sum_money += price;    
        return item;
    } 
    public static void main(String[] args){
        Client cl = new Client("Name", "Surname", 1500.0);
        Payment p = new Payment(cl);
        Item item1 = p.order(EnumerateProducts.MEAT, "Chicken", 120);
        Item item2 = p.order(EnumerateProducts.BREAD, "Butter black bread", 20);
        Item item3 = p.order(EnumerateProducts.MEAT, "Steak", 217);     
        System.out.println("shop.Payment: " + p.sum_money);
    }
}
