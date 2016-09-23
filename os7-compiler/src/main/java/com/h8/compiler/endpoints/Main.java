package com.h8.compiler.endpoints;

import com.h8.compiler.common.Logger;
import com.h8.compiler.core.CompilationContext;
import com.h8.compiler.core.reflection.ClassFileLoader;

import java.util.List;

public class Main {
    private static CompilationContext ctx;

    public static void main(String[] args) {
        Logger.log(Main.class, "Building compilation context:");
        ctx = new CompilationContext();

        String workingDirectory = getWorkingDirectory(args);
        Logger.log(Main.class, "Working directory: {1}", workingDirectory);
        ctx.setWorkingDirectory(workingDirectory);

        try {
            List<Class> classList = new ClassFileLoader(workingDirectory).listAllClasses();
            Logger.log(Main.class, "Found {1} classes", classList.size());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static String getWorkingDirectory(String[] args) {
        return args != null && args.length > 0 ? args[0] : System.getProperty("user.dir");
    }
}
