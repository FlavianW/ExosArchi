package org.example.tp.d.reponse;

public class Demo {
    public static void main(String[] args) {

        Car electricCar = new Car(new ElectricEngine());
        electricCar.start();


        Car gasolineCar = new Car(new GasolineEngine());
        gasolineCar.start();
    }
}
