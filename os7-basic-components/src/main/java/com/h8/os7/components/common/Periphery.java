package com.h8.os7.components.common;

/**
 * Generic abstract periphery component containing a value
 * which can be reflected with I/O
 * @param <T>
 *     Generic type adequate to S7 type
 */
public abstract class Periphery<T> {
    protected T value;
}
