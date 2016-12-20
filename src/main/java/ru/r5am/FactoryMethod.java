package ru.r5am;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by Zoer on 20.12.2016.
 * Пример реализации паттерна Фабрика (FactoryMethod)
 *
 * -
 */

class FactoryMethod {
    // Создать логер
    public static final Logger log = LogManager.getLogger(FactoryMethod.class);
    public static void main(String[] args) {
        System.out.println("Привет!");
        log.info("Привет в лог!");
    }
}