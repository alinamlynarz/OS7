package com.h8.compiler.core;

import com.h8.compiler.common.Logger;
import com.h8.compiler.core.reflection.ClassFileLoader;

import java.util.List;

public class CompilationContextBuilder extends CompilationContext {
    public CompilationContextBuilder() {}

    public CompilationContextBuilder withWorkingDirectory(String workingDirectory) {
        this.setWorkingDirectory(workingDirectory);
        Logger.log(CompilationContextBuilder.class, "Working directory: {1}", workingDirectory);

        buildClassList();

        return this;
    }

    private void buildClassList() {
        try {
            List<Class> classList = new ClassFileLoader(this.getWorkingDirectory()).listAllClasses();
            Logger.log(CompilationContextBuilder.class, "Found {1} classes", classList.size());
            this.setClassList(classList);
        } catch (Exception e) {
            //TODO!!!
            e.printStackTrace();
        }
    }

    public CompilationContext getContext() {
        return (CompilationContext) this;
    }
}
