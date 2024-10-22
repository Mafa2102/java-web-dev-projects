package org.example;

public class Computer extends AbstractEntity {

    //3 properties
    private String brand;
    //private double price;
    private int year;
    private String condition;
    private boolean isWorking = false;

    //constructor
    public Computer (String brand, int year, String condition){
        this.brand = brand;
        //this.price = price;
        this.year = year;
        this.condition = condition;
        //this.isWorking = isWorking;
    }

    //getters
    public String getBrand() {
        return this.brand;
    }

//    public double getPrice() {
//        return price;
//    }

    public int getYear() {
        return year;
    }

    public String getCondition() {
        return condition;
    }

//    public boolean isWorking() {
//        return isWorking;
//    }


    //methods
    public void chargeDevice(){
        this.isWorking = true;
        System.out.println("The " + brand + " is working.");
    }



}

