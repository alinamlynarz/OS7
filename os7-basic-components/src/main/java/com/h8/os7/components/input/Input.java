package com.h8.os7.components.input;

import com.h8.os7.core.interfaces.Callback;
import com.h8.os7.core.interfaces.Periphery;

/**
 * Input periphery component
 * @param <T>
 *     Generic type adequate to S7 type
 */
public abstract class Input<T> implements Periphery<T> {
    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    /**
     * Getter of input value
     * @return
     *      Input value
     */
    public T get() {
        return value;
    }

    /**
     * An event handler can be defined at value change
     * @param callback
     *      Method to be called when event occurs
     */
    public void onValueChanged(Callback<T> callback) {}
}
