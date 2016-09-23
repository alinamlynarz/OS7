package com.h8.compiler.common;

public class StringFormatter {
    public static String format(String message, Object... args) {
        String formattedMessage = message;
        int index = 1;
        for (Object a : args) {
            String placeHolder = "{" + index + "}";
            formattedMessage = formattedMessage.replace(placeHolder, a.toString());
            index++;
        }
        return formattedMessage;
    }
}
