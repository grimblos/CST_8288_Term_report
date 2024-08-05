/*  Student Name: Michael Dagher
    Student ID: 041088202
    Course: CST8288_010
    Professor: George Kriger
    Assignment: Term Report
 */
package aggregate;

import iterator.HouseIterator;
import iterator.Iterator;
import objects.House;

/**
 * Represents a neighborhood that contains a collection of houses.
 */
public class Neighborhood implements Aggregate<House> {

    private House[] houses;
    private int developedLots;
    private int totalLots;

    /**
     * Constructs a new Neighborhood with the specified total number of lots.
     *
     * @param totalLots the total number of lots in the neighborhood
     */
    public Neighborhood(int totalLots) {
        this.totalLots = totalLots;
        this.houses = new House[totalLots];
        this.developedLots = 0;
    }

    /**
     * Adds a house to the neighborhood.
     *
     * @param house the house to add
     * @throws IllegalStateException if the neighborhood is at capacity
     */
    public void addHouse(House house) {
        if (developedLots < totalLots) {
            houses[developedLots++] = house;
        } else {
            throw new IllegalStateException("Neighborhood is at capacity");
        }
    }

    /**
     * Returns the number of developed lots in the neighborhood.
     *
     * @return the number of developed lots
     */
    public int getDevelopedLots() {
        return developedLots;
    }

    /**
     * Returns the house at the specified address.
     *
     * @param address the address of the house
     * @return the house at the specified address
     * @throws IndexOutOfBoundsException if the address is not in the neighborhood
     */
    public House getHouse(int address) {
        if (address < 0 || address >= totalLots) {
            throw new IndexOutOfBoundsException("Address not in neighborhood");
        }
        return houses[address];
    }

    /**
     * Creates and returns an iterator for iterating over the houses in the neighborhood.
     *
     * @return an iterator for iterating over the houses
     */
    @Override
    public HouseIterator createIterator() {
        return new HouseIterator(this);
    }
}
