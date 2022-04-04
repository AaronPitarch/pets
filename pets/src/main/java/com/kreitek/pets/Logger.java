package com.kreitek.pets;

import com.kreitek.pets.infraestructure.bd.DbService;

public class Logger {

    int contador;
    static Logger instance;

    public Logger() {
        contador = 0;
    }

    public void debug(String debug) {
        System.out.println("[debug]" + "[" + contador + "] - " + debug);
        contador ++;
    }

    public static Logger getInstance() {
        if (instance == null) {
            synchronized(Logger.class) {
                if (instance == null) {
                    instance = new Logger();
                }
            }
        }
        return instance;
    }
}
