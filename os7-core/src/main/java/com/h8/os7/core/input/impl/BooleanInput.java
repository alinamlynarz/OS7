package com.h8.os7.core.input.impl;

import com.h8.os7.core.input.Input;

public class BooleanInput extends Input {
    public boolean isSet() {
        return false;
    }

    public void onPositiveEdge(Runnable callback) {

    }

    public void onNegativeEdge(Runnable callback) {

    }
}
