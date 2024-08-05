/*  Student Name: Michael Dagher
    Student ID: 041088202
    Course: CST8288_010
    Professor: George Kriger
    Assignment: Term Report
 */
package aggregate;

import iterator.Iterator;

/**
 * Represents an aggregate object that can be iterated over.
 *
 * @param <T> the type of elements in the aggregate
 */
public interface Aggregate<T> {

    /**
     * Creates an iterator for iterating over the elements in the aggregate.
     *
     * @return an iterator for the aggregate
     */
    Iterator<T> createIterator();
}
