/*  Student Name: Michael Dagher
    Student ID: 041088202
    Course: CST8288_010
    Professor: George Kriger
    Assignment: Term Report
 */

import aggregate.Garage;
import aggregate.Neighborhood;
import iterator.CarIterator;
import iterator.HouseIterator;
import objects.Car;
import objects.House;

/**
 * The main class demonstrating the use of the Iterator design pattern
 * with custom Car and House objects, including filtering functionality.
 */
public class main {

    public static void main(String[] args) {

        // Concrete Aggregates
        Garage newGarage = new Garage(10);
        Neighborhood newNeighborhood = new Neighborhood(25);

        // Loading concrete aggregates with data for testing.
        Car car1 = new Car("Ford", 1999, 85);
        Car car2 = new Car("Mazda", 2021, 130);
        Car car3 = new Car("Lamborghini", 2018, 200);
        Car car4 = new Car("Toyota", 2006, 120);
        House house1 = new House(3, 2, 4);
        House house2 = new House(2, 1, 1);
        House house3 = new House(4, 3, 0);
        House house4 = new House(1, 1, 1);
        newGarage.addCar(car1);
        newGarage.addCar(car2);
        newGarage.addCar(car3);
        newGarage.addCar(car4);
        newNeighborhood.addHouse(house1);
        newNeighborhood.addHouse(house2);
        newNeighborhood.addHouse(house3);
        newNeighborhood.addHouse(house4);

        // Concrete iterators
        CarIterator carIterator = newGarage.createIterator();
        HouseIterator houseIterator = newNeighborhood.createIterator();

        // Using concrete iterator CarIterator to iterate through concrete aggregate Garage
        while (carIterator.hasNext()) {
            System.out.println(carIterator.next());
        }

        // Using concrete iterator HouseIterator to iterate through concrete aggregate Neighborhood
        while (houseIterator.hasNext()) {
            System.out.println(houseIterator.next());
        }

        // Re-creating concrete iterators to test filtering
        carIterator = newGarage.createIterator();
        houseIterator = newNeighborhood.createIterator();

        // Testing filtering for each concrete iterator
        System.out.println("First car with a top speed above 100 KM/h:");
        System.out.println(carIterator.nextTopSpeed(100));
        System.out.println("First house with 0 occupants:");
        System.out.println(houseIterator.nextEmpty());
    }
}
