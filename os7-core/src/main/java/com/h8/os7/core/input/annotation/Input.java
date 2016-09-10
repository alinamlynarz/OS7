package com.h8.os7.core.input.annotation;

import com.h8.os7.core.common.annotation.address.Address;
import com.h8.os7.core.input.type.InputType;

public @interface Input {
    InputType type();
    Address address();
}
