package com.h8.compiler.endpoints;

import com.h8.compiler.common.Logger;
import com.h8.compiler.core.CompilationContext;

public class Main {
    private static CompilationContext ctx;

    public static void main(String[] args) {
        Logger.log(Main.class, "Building compilation context:");
        ctx = new CompilationContext();

        String workingDirectory = getWorkingDirectory(args);
        Logger.log(Main.class, "Working directory: %1$s", workingDirectory);
        ctx.setWorkingDirectory(workingDirectory);
    }

    private static String getWorkingDirectory(String[] args) {
        return args != null && args.length > 0 ? args[0] : System.getProperty("user.dir");
    }
}
