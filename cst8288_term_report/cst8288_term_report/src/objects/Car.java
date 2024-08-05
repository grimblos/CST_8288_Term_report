/*  Student Name: Michael Dagher
    Student ID: 041088202
    Course: CST8288_010
    Professor: George Kriger
    Assignment: Term Report
 */
package objects;

/**
 * Represents a car with a make, year, and top speed.
 */
public class Car {

    private String make;
    private int year;
    private int topSpeed;

    /**
     * Constructs a new Car with the specified make, year, and top speed.
     *
     * @param make     the make of the car
     * @param year     the year of the car
     * @param topSpeed the top speed of the car
     */
    public Car(String make, int year, int topSpeed) {
        this.make = make;
        this.year = year;
        this.topSpeed = topSpeed;
    }

    /**
     * Returns the make of the car.
     *
     * @return the make of the car
     */
    public String getMake() {
        return make;
    }

    /**
     * Sets the make of the car.
     *
     * @param make the make of the car
     */
    public void setMake(String make) {
        this.make = make;
    }

    /**
     * Returns the year of the car.
     *
     * @return the year of the car
     */
    public int getYear() {
        return year;
    }

    /**
     * Sets the year of the car.
     *
     * @param year the year of the car
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * Returns the top speed of the car.
     *
     * @return the top speed of the car
     */
    public int getTopSpeed() {
        return topSpeed;
    }

    /**
     * Sets the top speed of the car.
     *
     * @param topSpeed the top speed of the car
     */
    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    /**
     * Returns a string representation of the car.
     *
     * @return a string representation of the car
     */
    @Override
    public String toString() {
        return String.format("Make: %s, Year: %d, Top Speed: %d", make, year, topSpeed);
    }
}
