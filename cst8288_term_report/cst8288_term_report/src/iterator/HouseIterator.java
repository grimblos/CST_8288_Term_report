/*  Student Name: Michael Dagher
    Student ID: 041088202
    Course: CST8288_010
    Professor: George Kriger
    Assignment: Term Report
 */
package iterator;

import aggregate.Neighborhood;
import objects.House;

import java.util.NoSuchElementException;

/**
 * Iterator implementation for iterating over a collection of houses in a neighborhood.
 */
public class HouseIterator implements Iterator<House> {

    private Neighborhood neighborhood;
    private int address;

    /**
     * Constructs a new HouseIterator for the specified neighborhood.
     *
     * @param neighborhood the neighborhood to iterate over
     */
    public HouseIterator(Neighborhood neighborhood) {
        this.neighborhood = neighborhood;
        this.address = 0;
    }

    /**
     * Returns {@code true} if the iteration has more houses.
     *
     * @return {@code true} if the iteration has more houses
     */
    @Override
    public boolean hasNext() {
        return address < neighborhood.getDevelopedLots();
    }

    /**
     * Returns the next house in the iteration.
     *
     * @return the next house in the iteration
     * @throws NoSuchElementException if the iteration has no more houses
     */
    @Override
    public House next() {
        if (!hasNext()) {
            throw new NoSuchElementException("House not found.");
        }
        return neighborhood.getHouse(address++);
    }

    /**
     * Returns the next house in the iteration that has no occupants.
     *
     * @return the next empty house in the iteration
     * @throws NoSuchElementException if no empty house is found
     */
    public House nextEmpty() {
        while (hasNext()) {
            House emptyHouse = next();
            if (emptyHouse != null && emptyHouse.getOccupants() == 0) {
                return emptyHouse;
            }
        }
        throw new NoSuchElementException("No empty houses available.");
    }
}
