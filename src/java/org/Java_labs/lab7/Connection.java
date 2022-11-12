package org.Java_labs.lab7;

public class Connection {
    private boolean available;
    Connection() {
        available = true;
    }
    public void connect() {
        System.out.println("connecting");
    }
    public boolean isAvailable() {
        return available;
    }
}
