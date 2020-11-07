package com.tasks.lesson5;

/**
 * Напишите метод для поиска самой длинной строки в массиве
 */

public class TheLongestString {
    public static void main(String[] args) {
        String[] string = new String[3];
        string[0] = new String("Не следует, однако, забывать о том, что новая");
        string[1] = new String("Значимость этих проблем настолько");
        string[2] = new String("Таким образом");
        System.out.println("Самая длинная строка: " + searchString(string));
    }

    public static String searchString(String[] value) {
        int maxLength = 0;
        String maxLengthString = null;

        for (int i = 0; i < value.length; i++) {
            if (value[i].length() > maxLength) {
                maxLength = value[i].length();
                maxLengthString = value[i];
            }
        }
        return maxLengthString;
    }
}