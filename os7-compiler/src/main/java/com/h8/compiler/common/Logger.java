package com.h8.compiler.common;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
    private static final DateFormat DATE_FORMAT = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

    public static void log(Class sender, String message, Object... args) {
        String formattedMessage = StringFormatter.format(message, args);
        log(sender, formattedMessage);
    }

    public static void log(Class sender, String message) {
        Date date = new Date();
        System.out.println(StringFormatter.format("{1} [{2}] : {3}",
                DATE_FORMAT.format(date), sender.getSimpleName(), message));
    }
}
