package com.h8.os7.core.annotations.components.structure;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
public @interface Interface {
    String value();
}
