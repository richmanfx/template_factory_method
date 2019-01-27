package ru.r5am;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

/**
 * Created by Zoer on 20.12.2016.
 * Пример реализации паттерна Фабрика (FactoryMethod)
 *
 */
class FactoryMethod {

    private static final Logger log = LogManager.getLogger(FactoryMethod.class);

    public static void main(String[] args) {

        // Две разные страницы
        BasePage page1 = new PageCreatorA().factoryMethod();
        BasePage page2 = new PageCreatorB().factoryMethod();

        // Остальной код работает с созданными страницами единообразно через общий интерфейс
        log.info(String.format("%s, класс %s", page1.getPageName(), page1.getClass()));
        log.info(String.format("%s, класс %s", page2.getPageName(), page2.getClass()));

    }

}

/**
 * Общий интерфейс всех страниц
 */
interface BasePage {
    String getPageName();
}

/**
 * Реализация страницы A
 */
class PageA implements BasePage {
    // Реализация метода интерфейса
    public String getPageName() {
        return "Это страница PageA";
    }
}

/**
 * Реализация страницы B
 */
class PageB implements BasePage {
    // Реализация метода интерфейса
    public String getPageName() {
        return "Это страница PageB";
    }
}

/**
 * Базовый класс фабрики с переопределяемым при создании объекта методом
 */
abstract class Creator {
    public abstract BasePage factoryMethod();
}

/**
 * Конкретный класс страницы A
 */
class PageCreatorA extends Creator {
    @Override
    public BasePage factoryMethod() {
        return new PageA();
    }
}

/**
 * Конкретный класс станицы B
 */
class PageCreatorB extends Creator {
    @Override
    public BasePage factoryMethod() {
        return new PageB();
    }
}
