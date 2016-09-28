package com.h8.compiler.core.reflection;

import com.h8.compiler.common.Logger;
import com.h8.compiler.core.CompilationContext;
import com.h8.os7.core.annotations.components.structure.Component;
import com.h8.os7.core.annotations.components.structure.Controller;
import com.h8.os7.core.annotations.components.structure.Interface;

import java.lang.annotation.Annotation;

public class ClassAnnotationProcessor {
    public void printClassAnnotations(CompilationContext ctx) {
        for (Class c : ctx.getClassList()) {
            printClassAnnotations(c, Component.class);
            printClassAnnotations(c, Controller.class);
            printClassAnnotations(c, Interface.class);
        }
    }

    private void printClassAnnotations(Class objectClass, Class annotationClass) {
        Annotation annotation = objectClass.getAnnotation(annotationClass);
        if (annotation != null) {
            Logger.log(ClassAnnotationProcessor.class, "Class '{1}' is annotated as '{2}'",
                    objectClass.getSimpleName(), annotation.annotationType());
        }
    }
}
