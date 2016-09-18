package com.h8.compiler.endpoints;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    private static final DateFormat DATE_FORMAT = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(String.format("%1$2s [%2$2s] : %3$2s", DATE_FORMAT.format(date), "test", "test"));
    }
}
