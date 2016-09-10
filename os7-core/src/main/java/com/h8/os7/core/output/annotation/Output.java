package com.h8.os7.core.output.annotation;

import com.h8.os7.core.common.annotation.address.BitAddress;
import com.h8.os7.core.common.annotation.address.WordAddress;
import com.h8.os7.core.output.type.OutputType;

public @interface Output {
    OutputType type();
    BitAddress bitAddress() default @BitAddress(0.0);
    WordAddress wordAddress() default @WordAddress(0);
}
