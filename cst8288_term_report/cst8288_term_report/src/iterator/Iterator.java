/*  Student Name: Michael Dagher
    Student ID: 041088202
    Course: CST8288_010
    Professor: George Kriger
    Assignment: Term Report
 */
package iterator;

/**
 * Represents an iterator that can iterate over a collection of elements.
 *
 * @param <T> the type of elements being iterated
 */
public interface Iterator<T> {

    /**
     * Returns {@code true} if the iteration has more elements.
     *
     * @return {@code true} if there are more elements to iterate over
     */
    boolean hasNext();

    /**
     * Returns the next element in the iteration.
     *
     * @return the next element in the iteration
     * @throws NoSuchElementException if the iteration has no more elements
     */
    T next();
}
