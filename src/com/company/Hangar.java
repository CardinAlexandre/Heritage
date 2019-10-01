package com.company;

class Hangar {
    public static void main(String[] args) {
        //reference
        Car car = new Car("Ducati",300000);
        Boat boat = new Boat("Dan Bilzerian", 300000);
        //utilisation setters
        car.setKilometers(30000);
        boat.setKilometers(30000);
        car.setBrand("Bentley");
        boat.setBrand("Titanic");
        // utilisation getters
        System.out.println("Je suis une " + car.getBrand() + " et je fais " + car.doStuff() + "!");
        System.out.println("Je suis un " + boat.getBrand() + " et je fais " + boat.doStuff() + "!");
    }
}
