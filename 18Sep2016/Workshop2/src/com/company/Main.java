package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Vehicle arr[] = new Vehicle[5];

        arr[0] = new Vehicle("White",34232,1996);
        arr[1] = new Bus("Multicolor",12451,1990);
        arr[2] = new Car("Black",4544,2005);
        arr[3] = new Truck("Multicolor",7845,1990);
        arr[4] = new SportsCar("RED",71245,2007);

        Random r = new Random();
        int num = r.nextInt(5);
        System.out.println("NUM = "+num);
        Workshop workshop = new Workshop("Ghazi Workshop");
        workshop.provideService(arr[num]);

    }
}
