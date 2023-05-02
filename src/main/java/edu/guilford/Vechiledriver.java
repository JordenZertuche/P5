package edu.guilford;

import java.util.Arrays;

public class Vechiledriver {
        public static void main(String[] args) {
            Car car1 = new Car("Toyota", "Camry", 2021, 4);
            Car car2 = new Car("Honda", "Accord", 2022, 4);
            Car car3 = new Car("Nissan", "Altima", 2023, 4);
            Car car4 = new Car("Ford", "Mustang", 2024, 2);
            Car car5 = new Car("Chevrolet", "Corvette", 2025, 2);
    
            Truck truck1 = new Truck("Ford", "F-150", 2021, 2000);
            Truck truck2 = new Truck("Chevrolet", "Silverado", 2022, 2500);
            Truck truck3 = new Truck("Dodge", "Ram", 2023, 3000);
            Truck truck4 = new Truck("Toyota", "Tacoma", 2024, 3500);
            Truck truck5 = new Truck("Nissan", "Titan", 2025, 4000);
    
            Motorcycle motorcycle1 = new Motorcycle("Harley-Davidson", "Softail", 2021, 2);
            Motorcycle motorcycle2 = new Motorcycle("BMW", "S1000RR", 2022, 2);
            Motorcycle motorcycle3 = new Motorcycle("Honda", "Gold Wing", 2023, 3);
            Motorcycle motorcycle4 = new Motorcycle("Yamaha", "YZF-R1", 2024, 2);
            Motorcycle motorcycle5 = new Motorcycle("Kawasaki", "Ninja", 2025, 2);
    
            // use inherited method
            car1.start_engine();
            truck1.start_engine();
            motorcycle1.start_engine();
    
            // use abstract method
            for (Vehicle vehicle : Arrays.asList(car1, car2, car3, car4, car5, truck1, truck2, truck3, truck4, truck5, motorcycle1, motorcycle2, motorcycle3, motorcycle4, motorcycle5)) {
                System.out.println(vehicle.get_description());
                }
                 // use polymorphism
        Vehicle fastest = motorcycle2;
        System.out.println("The fastest motorcycle is: " + fastest.get_description());
        fastest = car3;
        System.out.println("The fastest car is: " + fastest.get_description());
        fastest = truck5;
        System.out.println("The fastest truck is: " + fastest.get_description());
                //another way to use polymorphism
        Vehicle[] vehicles = {car1, car2, car3, car4, car5, truck1, truck2, truck3, truck4, truck5, motorcycle1, motorcycle2, motorcycle3, motorcycle4, motorcycle5};
    
        // use Comparable interface
        Arrays.sort(vehicles);
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.get_description());

        }
    }
}
