package com.kreitek.pets.controllers;

public class LoggerSingleton {
    private static LoggerSingleton instance;
    private int counterDebug;

    private LoggerSingleton() {
        this.counterDebug = 0;
    }

    public static LoggerSingleton getInstance() {
        if(instance == null) {
            instance = new LoggerSingleton();
        }
        return instance;
    }

    public void debug(String message) {
        this.counterDebug++;
        System.out.println("[debug]["+this.counterDebug+"]-"+message);
    }
}
