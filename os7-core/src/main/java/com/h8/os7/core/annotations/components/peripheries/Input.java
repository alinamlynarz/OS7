package com.h8.os7.core.annotations.components.peripheries;

import com.h8.os7.core.annotations.components.address.Address;
import com.h8.os7.core.types.InputType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
public @interface Input {
    InputType type();
    Address address();
}
