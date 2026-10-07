package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args){
        System.out.println("Printing old way");
        IO.println("Printing new way");


        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Computer com = context.getBean(Computer.class);
        com.startWork();
    }
}