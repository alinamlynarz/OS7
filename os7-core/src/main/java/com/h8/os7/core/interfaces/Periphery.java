package com.h8.os7.core.interfaces;

/**
 * Generic interface of periphery component containing a value
 * which can be reflected with I/O
 * @param <T>
 *     Generic type adequate to S7 type
 */
public interface Periphery<T> {
    /**
     * Setter for input reflection
     * @param value
     *      Input value
     */
    void setValue(T value);

    /**
     * Getter for output reflection
     * @return
     *      Output value
     */
    T getValue();
}
