package com.h8.os7.components.output;

import com.h8.os7.components.common.Periphery;

/**
 * Output periphery component
 * @param <T>
 *     Generic type adequate to S7 type
 */
public abstract class Output<T> extends Periphery<T> {
    /**
     * Setter for output value
     * @param value
     *      Output value
     */
    public void set(T value) {
        this.value = value;
    }
}
