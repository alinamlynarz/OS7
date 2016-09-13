package com.h8.os7.core.annotations.components.address;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
public @interface Address {
    double value();
}
