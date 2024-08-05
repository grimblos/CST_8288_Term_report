/*  Student Name: Michael Dagher
    Student ID: 041088202
    Course: CST8288_010
    Professor: George Kriger
    Assignment: Term Report
 */
package objects;

/**
 * Represents a house with a number of bedrooms, bathrooms, and occupants.
 */
public class House {

    private int bedrooms;
    private int bathrooms;
    private int occupants;

    /**
     * Constructs a new House with the specified number of bedrooms, bathrooms, and occupants.
     *
     * @param bedrooms the number of bedrooms in the house
     * @param bathrooms the number of bathrooms in the house
     * @param occupants the number of occupants in the house
     */
    public House(int bedrooms, int bathrooms, int occupants) {
        this.bedrooms = bedrooms;
        this.bathrooms = bathrooms;
        this.occupants = occupants;
    }

    /**
     * Returns the number of bedrooms in the house.
     *
     * @return the number of bedrooms
     */
    public int getBedrooms() {
        return bedrooms;
    }

    /**
     * Sets the number of bedrooms in the house.
     *
     * @param bedrooms the number of bedrooms
     */
    public void setBedrooms(int bedrooms) {
        this.bedrooms = bedrooms;
    }

    /**
     * Returns the number of bathrooms in the house.
     *
     * @return the number of bathrooms
     */
    public int getBathrooms() {
        return bathrooms;
    }

    /**
     * Sets the number of bathrooms in the house.
     *
     * @param bathrooms the number of bathrooms
     */
    public void setBathrooms(int bathrooms) {
        this.bathrooms = bathrooms;
    }

    /**
     * Returns the number of occupants in the house.
     *
     * @return the number of occupants
     */
    public int getOccupants() {
        return occupants;
    }

    /**
     * Sets the number of occupants in the house.
     *
     * @param occupants the number of occupants
     */
    public void setOccupants(int occupants) {
        this.occupants = occupants;
    }

    /**
     * Returns a string representation of the house.
     *
     * @return a string representation of the house
     */
    @Override
    public String toString() {
        return String.format("%d Bedrooms, %d Bathrooms. Total Occupants: %d", bedrooms, bathrooms, occupants);
    }
}
