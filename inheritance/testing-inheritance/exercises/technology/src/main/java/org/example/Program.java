package org.example;

import java.sql.SQLOutput;

public class Program {
    public static void main(String[] args){
        SmartPhone iPhone = new SmartPhone("Apple",2024, "new");
        iPhone.setMemorySize(200);
        System.out.println("Device's number is " + iPhone.getId());
        System.out.println("My " +iPhone.getCondition()+ " phone has " + iPhone.getMemorySize() + "G memory and it is " + iPhone.getYear() + " model.");

        Laptop macBook = new Laptop("Apple",2022, "old");
        System.out.println("\nDevice's number is " + macBook.getId());
        System.out.println("My " + macBook.getCondition() + " " + macBook.getBrand() + " laptop has " );
        macBook.hasIJ();
        macBook.chargeDevice();


    }
}
