package org.example.tp.i.reponse;

// Code client
public class Demo {
    public static void main(String[] args) {
        Workable employee = new Employee();
        employee.work();

        Eatable eatableEmployee = (Eatable) employee;
        eatableEmployee.eat();

        Sleepable sleepableEmployee = (Sleepable) employee;
        sleepableEmployee.sleep();

        Workable robot = new Robot();
        robot.work();
    }
}

// Interfaces spécifiques
interface Workable {
    void work();
}

interface Eatable {
    void eat();
}

interface Sleepable {
    void sleep();
}

// Implémentation pour Employee
class Employee implements Workable, Eatable, Sleepable {
    @Override
    public void work() {
        System.out.println("Employee is working");
    }

    @Override
    public void eat() {
        System.out.println("Employee is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Employee is sleeping");
    }
}

// Implémentation pour Robot
class Robot implements Workable {
    @Override
    public void work() {
        System.out.println("Robot is working");
    }
}
