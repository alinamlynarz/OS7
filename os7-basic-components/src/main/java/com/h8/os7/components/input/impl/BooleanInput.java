package com.h8.os7.components.input.impl;

import com.h8.os7.components.input.Input;
import com.h8.os7.core.interfaces.Callback;

/**
 * Boolean input periphery component
 */
public class BooleanInput extends Input<Boolean> {
    /**
     * An event handler can be defined at positive edge
     * @param callback
     *      Method to be called when event occurs
     */
    public void onPositiveEdge(Callback<Boolean> callback) {}

    /**
     * An event handler can be defined at negative edge
     * @param callback
     *      Method to be called when event occurs
     */
    public void onNegativeEdge(Callback<Boolean> callback) {}
}
