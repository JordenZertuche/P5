package edu.guilford;

import java.util.Arrays;
//create abstract class
abstract class Vehicle implements Comparable<Vehicle> {
    protected String make;
    protected String model;
    protected String color;
    protected int year; 
    protected int num_wheels;
    protected int num_doors;

//createa constructor
    public Vehicle(String make, String model, int year, int num_wheels, int num_doors) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.num_wheels = num_wheels;
        this.num_doors = num_doors;

    }
//create abstract method
    public abstract String get_description();

    public void start_engine() {
        System.out.println("the Engine is starting.");
    }

    public int compareTo(Vehicle other) {
        return this.get_num_wheels() - other.get_num_wheels();
    }

    protected abstract int get_num_wheels();
}
//create subclasses for car
class Car extends Vehicle {
    private int num_doors;

    public Car(String make, String model, int year, int num_doors) {
        super(make, model, year, num_doors, num_doors);
        this.num_doors = num_doors;
    }

    public String get_description() {
        return String.format("A %d %s %s with %d doors", this.year, this.make, this.model, this.num_doors);
    }

    protected int get_num_wheels() {
        return 4;
    }

    public void start_engine() {
        System.out.println("le Car is starting.");
    }

    public void drive() {
        System.out.println("The car is driving.");
    }

    public void park() {
        System.out.println("The car is parking.");
    }
}
//ceate subclass for truck
class Truck extends Vehicle {
    private int payload_capacity;

    public Truck(String make, String model, int year, int payload_capacity) {
        super(make, model, year, payload_capacity, payload_capacity);
        this.payload_capacity = payload_capacity;
    }

    public String get_description() {
        return String.format("A %d %s %s with a payload capacity of %d pounds", this.year, this.make, this.model, this.payload_capacity);
    }

    protected int get_num_wheels() {
        return 4;
    }

    public void start_engine() {
        System.out.println("truck is revving up.");
    }

    public void tow() {
        System.out.println("The truck is towing.");
    }

    public void haul() {
        System.out.println("The truck is hauling.");
    }
}
//create subclass for motorcycle
class Motorcycle extends Vehicle {
    private int num_wheels;

    public Motorcycle(String make, String model, int year, int num_wheels) {
        super(make, model, year, num_wheels, num_wheels);
        this.num_wheels = num_wheels;
    }

    public String get_description() {
        return String.format("A %d %s %s with %d wheels", this.year, this.make, this.model, this.num_wheels);
    }

    public void start_engine() {
        System.out.println("Motorcyle is Revving Up.");
    }

    public void wheelie() {
        System.out.println("The motorcycle is Shredding It!");
    }

    public void burnout() {
        System.out.println("The motorcycle is Burning Out!");
    }

    protected int get_num_wheels() {
        return this.num_wheels;
    }
}