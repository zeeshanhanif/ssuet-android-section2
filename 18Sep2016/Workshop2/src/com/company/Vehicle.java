package com.company;

/**
 * Created by zeeshanhanif-pc on 9/18/2016.
 */
public class Vehicle {

    public String color;
    public int registrationNo;
    public int model;

    public Vehicle(){

    }

    public Vehicle(String color, int registrationNo, int model){
        this.color = color;
        this.registrationNo = registrationNo;
        this.model = model;
    }

    public void doService(){
        System.out.println("Vehicle Service");
    }


}
