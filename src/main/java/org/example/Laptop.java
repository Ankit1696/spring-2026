package org.example;

public class Laptop implements Computer{
    @Override
    public void startWork() {
        IO.println("Started working with Laptop");
    }
}
