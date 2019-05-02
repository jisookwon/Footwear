package com.company;

public class Car {

    private String color;
    private String carName;
    //private String performing;


    public Car() {
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getCarName() {
        return carName;
    }
    public static void accelerating(){
        System.out.println(" is accelerating");
    }
    public static void starting(){
        System.out.println(" is starting");
    }
    public static void stopped(){
        System.out.println(" is stopped");
    }
    public static void setSpeed(int speed){
        int s=speed;
        System.out.println(" is going " + s + " mph");
    }

}
