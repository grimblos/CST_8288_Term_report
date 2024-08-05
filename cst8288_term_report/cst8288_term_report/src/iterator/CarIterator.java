/*  Student Name: Michael Dagher
    Student ID: 041088202
    Course: CST8288_010
    Professor: George Kriger
    Assignment: Term Report
 */
package iterator;

import aggregate.Garage;
import objects.Car;

import java.util.NoSuchElementException;

/**
 * Iterator implementation for iterating over a collection of cars in a garage.
 */
public class CarIterator implements Iterator<Car> {

    private Garage garage;
    private int carIndex;

    /**
     * Constructs a new CarIterator for the specified garage.
     *
     * @param garage the garage to iterate over
     */
    public CarIterator(Garage garage) {
        this.garage = garage;
        this.carIndex = 0;
    }

    /**
     * Returns {@code true} if the iteration has more cars.
     *
     * @return {@code true} if the iteration has more cars
     */
    @Override
    public boolean hasNext() {
        return carIndex < garage.getSize();
    }

    /**
     * Returns the next car in the iteration.
     *
     * @return the next car in the iteration
     * @throws NoSuchElementException if the iteration has no more cars
     */
    @Override
    public Car next() {
        if (!hasNext()) {
            throw new NoSuchElementException("Out of cars.");
        }
        return garage.get(carIndex++);
    }

    /**
     * Returns the next car in the iteration with a top speed greater than or equal to the specified speed.
     *
     * @param topSpeed the minimum top speed of the car
     * @return the next car with a top speed greater than or equal to the specified speed
     * @throws NoSuchElementException if no car with the specified top speed is found
     */
    public Car nextTopSpeed(int topSpeed) {
        while (hasNext()) {
            Car fastCar = next();
            if (fastCar != null && fastCar.getTopSpeed() >= topSpeed) {
                return fastCar;
            }
        }
        throw new NoSuchElementException(String.format("No cars above %d KM/h.", topSpeed));
    }
}
