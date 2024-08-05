/*  Student Name: Michael Dagher
    Student ID: 041088202
    Course: CST8288_010
    Professor: George Kriger
    Assignment: Term Report
 */
package aggregate;

import iterator.CarIterator;
import iterator.Iterator;
import objects.Car;

/**
 * Represents a garage that contains a collection of cars.
 */
public class Garage implements Aggregate<Car> {

    private Car[] cars;
    private int size;
    private int capacity;

    /**
     * Constructs a new Garage with the specified capacity.
     *
     * @param capacity the maximum number of cars the garage can hold
     */
    public Garage(int capacity) {
        this.capacity = capacity;
        this.cars = new Car[capacity];
        this.size = 0;
    }

    /**
     * Adds a car to the garage.
     *
     * @param car the car to add
     * @throws IllegalStateException if the garage is full
     */
    public void addCar(Car car) {
        if (size < capacity) {
            cars[size++] = car;
        } else {
            throw new IllegalStateException("Garage is full.");
        }
    }

    /**
     * Returns the number of cars currently in the garage.
     *
     * @return the number of cars
     */
    public int getSize() {
        return size;
    }

    /**
     * Returns the car at the specified index.
     *
     * @param carIndex the index of the car
     * @return the car at the specified index
     * @throws IndexOutOfBoundsException if the index is out of range
     */
    public Car get(int carIndex) {
        if (carIndex < 0 || carIndex >= size) {
            throw new IndexOutOfBoundsException("Car index is outside of capacity");
        }
        return cars[carIndex];
    }

    /**
     * Creates and returns an iterator for iterating over the cars in the garage.
     *
     * @return an iterator for iterating over the cars
     */
    @Override
    public CarIterator createIterator() {
        return new CarIterator(this);
    }
}
