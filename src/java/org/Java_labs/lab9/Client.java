// Class work 9
// JavaLabs4 Task 8.1 

package org.Java_labs.lab9;

public class Client {
    String name;
    String surname;
    double balance;
    public Client(){
    };
    public Client(String name, String surname, double balance){
        this.name = name;
        this.surname = surname;
        this.balance = balance;
    }
    public Item order(EnumerateProducts product, String name, float price){
        if (this.balance < price) {
            System.out.println("\nshop.Client doesn't have enough money\n");
            return new Item();
        } else if (product == EnumerateProducts.MEAT) {
            Meat meat = new Meat(price, name, "fresh");
            this.balance -= price;
            return meat;
        } else if (product == EnumerateProducts.BREAD) {
            BREAD bread = new Bread(price, name, "black");
            this.balance -= price;
            return bread;
        }
        return new Item();
    }
	public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
	public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getSurname() {
        return surname;
    }
	public void setBalance(double balance) {
        this.balance = balance;
    }
    public double getBalance() {
        return balance;
    }
}
