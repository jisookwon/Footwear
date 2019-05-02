package com.company;

import java.util.ArrayList;

public class CarApp {

    public static void main(String[] args) {

        ArrayList<Car> carArray = new ArrayList<Car>();

        Car car1 = new Car();
        car1.setColor("red");
        car1.setCarName("Porsche");
        //car1.setPerforming();

        Car car2 = new Car();
        car2.setColor("blue");
        car2.setCarName("Jetta");
        //car2.setPerforming();

        carArray.add(car1);
        carArray.add(car2);
        int speed=0;
        for (Car c:carArray){

            System.out.print("The " + c.getColor() +" "+ c.getCarName());
            starting();
            accelerating();
            speed=50;
            setSpeed(speed);
            stopped();

        }
    }

   /* private static void accelerating(){
        System.out.println(" is accelerating");
    }
    private static void starting(){
        System.out.println(" is starting");
    }
    private static void stopped(){
        System.out.println(" is stopped");
    }
    private static void setSpeed(int speed){
        int s=speed;
        System.out.println(" is going " + s + " mph");
    }*/
}
