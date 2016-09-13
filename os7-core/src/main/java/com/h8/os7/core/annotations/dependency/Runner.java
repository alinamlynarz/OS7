package com.h8.os7.core.annotations.dependency;

import com.h8.os7.core.types.RunnerType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
public @interface Runner {
    RunnerType value();
}
