package org.example;

public class Desktop implements Computer{
    @Override
    public void startWork() {
        IO.println("Started working with Desktop");
    }
}
