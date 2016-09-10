package com.h8.os7.core.input.annotation;

import com.h8.os7.core.common.annotation.address.BitAddress;
import com.h8.os7.core.common.annotation.address.WordAddress;
import com.h8.os7.core.input.type.InputType;

public @interface Input {
    InputType type();
    BitAddress bitAddress() default @BitAddress(0.0);
    WordAddress wordAddress() default @WordAddress(0);
}
