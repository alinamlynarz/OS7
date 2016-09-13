package com.h8.os7.components.output;

import com.h8.os7.core.interfaces.Periphery;

/**
 * Output periphery component
 * @param <T>
 *     Generic type adequate to S7 type
 */
public abstract class Output<T> implements Periphery<T> {
    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    /**
     * Setter for output value
     * @param value
     *      Output value
     */
    public void set(T value) {
        this.value = value;
    }
}
