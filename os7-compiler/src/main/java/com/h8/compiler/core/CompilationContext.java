package com.h8.compiler.core;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

public class CompilationContext {
    @Getter
    @Setter
    String workingDirectory;

    @Getter
    @Setter
    List<Class> classList;
}
