package com.tasks.lesson8.task4;
/**
 *  * Задание 4:
 *  * Написать класс TextContainer, который содержит в себе строку. С помощью механизма аннотаций указать
 *  * 1) в какой файл должен сохраниться текст 2) метод, который выполнит сохранение. Написать класс Saver,
 *  * который сохранит объект класса TextContainer.
 */

import java.lang.reflect.Method;

public class Saver {
    public static void main(String[] args) throws IllegalAccessException {
        TextContainer textContainer = new TextContainer();
        checkAnnotation(textContainer.getClass());
    }

    public static void checkAnnotation(Class<?> c) {
        if (c.isAnnotationPresent(SaveToFile.class)) {
            System.out.println(c.getAnnotation(SaveToFile.class));

            Method[] declaredMethods = c.getDeclaredMethods();
            for (Method declaredMethod : declaredMethods) {
                System.out.println(declaredMethod);
            }
        }
    }
}