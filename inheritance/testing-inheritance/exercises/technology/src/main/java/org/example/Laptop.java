package org.example;

public class Laptop extends Computer{

    private boolean isJavaWorking;

    //constructor
    public Laptop(String brand, int year, String condition) {
        super(brand, year, condition);
        this.isJavaWorking = false;
    }

    //getter

    //methods

    public boolean isJavaWorking() {
        return isJavaWorking = false;
    }

    public void hasIJ(){
        if(isJavaWorking = true){
            System.out.println("installed and working IntelliJ.");
        }else{
            System.out.println("uninstalled and not working IntelliJ.");
        }
    }
}
