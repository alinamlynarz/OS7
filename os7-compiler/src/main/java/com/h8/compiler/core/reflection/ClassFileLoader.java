package com.h8.compiler.core.reflection;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.file.DirectoryIteratorException;
import java.util.ArrayList;
import java.util.List;

import static java.net.URLClassLoader.newInstance;

public class ClassFileLoader {
    private static final String CLASS_EXTENSION = ".class";

    public List<Class> listAllClasses(String directoryName)
            throws MalformedURLException, ClassNotFoundException {
        URL[] urls = { new URL("file://" + directoryName) };
        URLClassLoader loader = newInstance(urls);
        File directory = new File(directoryName);
        return listAllClasses(loader, directory, directory);
    }

    private List<Class> listAllClasses(URLClassLoader loader, File root, File file)
            throws ClassNotFoundException {
        List<Class> list = new ArrayList<>();

        if (file != null) {
            if (file.isDirectory()) {
                for (File f : file.listFiles()) {
                    List<Class> subList = listAllClasses(loader, root, f);
                    list.addAll(subList);
                }
            } else if (file.getName().endsWith(CLASS_EXTENSION)) {
                list.add(getClass(loader, root, file));
            }
        }

        return list;
    }

    private Class getClass(URLClassLoader loader, File root, File file)
            throws ClassNotFoundException {
        String className = file.getAbsolutePath()
                .replace(root.getAbsolutePath() + "/", "")
                .replace(".class", "")
                .replace('/', '.');
        return loader.loadClass(className);
    }
}
