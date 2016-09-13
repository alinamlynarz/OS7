package com.h8.os7.components.common;

/**
 * Generic functional interface for callback methods.
 * @param <T>
 *     Generic type of a value returned.
 */
public interface Callback<T> {
    /**
     * Method is called when callback event occurs.
     * @param value
     *      Value returned at callback event.
     */
    void call(T value);
}
