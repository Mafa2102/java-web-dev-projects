package org.example;

public class SmartPhone extends Computer{

    private double memorySize;
    public SmartPhone(String brand, int year, String condition) {
        super(brand, year, condition);
        this.memorySize = memorySize;
    }

    public double getMemorySize(){
        return memorySize;
    }

    public void setMemorySize(double memorySize){
        this.memorySize = memorySize;
    }

    public void needSpace(){
        if(memorySize >= 256){
            System.out.println("There are some space for extra photos.");
        }else{
            System.out.println("There is not enough space for extra photos.");
        }
    }
}
