package org.example.tp.d.reponse;

public class Car {
    private final Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        engine.start();
    }
}


interface Engine {
    void start();
}


class ElectricEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Electric engine started.");
    }
}

class GasolineEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Gasoline engine started.");
    }
}

