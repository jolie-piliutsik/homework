package com.tasks.lesson5;

/**
 * Напишите метод, заменяющий все вхождения слова "бяка" на "[вырезано цензурой]
 */

public class Byaka {
    public static void main(String[] args) {
        String string = "Nfenwk бяка jwijffwuj бяка";
        System.out.println(replace(string));
    }

    public static String replace(String value) {
        return value.replace("бяка", "[вырезано цензурой]");
    }
}