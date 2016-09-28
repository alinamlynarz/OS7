package com.h8.compiler.endpoints;

import com.h8.compiler.common.Logger;
import com.h8.compiler.core.CompilationContext;
import com.h8.compiler.core.CompilationContextBuilder;
import com.h8.compiler.core.reflection.ClassAnnotationProcessor;

public class Main {

    public static void main(String[] args) {
        Logger.log(Main.class, "Building compilation context:");

        String workingDirectory = getWorkingDirectory(args);
        CompilationContext ctx = new CompilationContextBuilder()
                .withWorkingDirectory(workingDirectory)
                .getContext();

        new ClassAnnotationProcessor().printClassAnnotations(ctx);
    }

    private static String getWorkingDirectory(String[] args) {
        return args != null && args.length > 0 ? args[0] : System.getProperty("user.dir");
    }
}
