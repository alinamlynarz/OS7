package com.h8.os7.core.input;

import com.h8.os7.core.common.Callback;

public abstract class Input<T> {
    public T get() {
        return null;
    }

    public void onValueChanged(Callback<T> callback) {}
}
