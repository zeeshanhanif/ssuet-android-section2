package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /*Vehicle v = new Vehicle("White",34232,1996);
        Bus b = new Bus("Multicolor",12451,1990);
        Car c = new Car("Black",4544,2005);
        Truck t = new Truck("Multicolor",7845,1990);
        SportsCar sc = new SportsCar("RED",71245,2007);*/
        Vehicle v = new Vehicle("White",34232,1996);
        Bus b = new Bus("Multicolor",12451,1990);
        Car c = new Car("Black",4544,2005);
        Truck t = new Truck("Multicolor",7845,1990);
        SportsCar sc = new SportsCar("RED",71245,2007);

        Workshop workshop = new Workshop("Ghazi Workshop");
        workshop.provideService(sc);

    }
}
