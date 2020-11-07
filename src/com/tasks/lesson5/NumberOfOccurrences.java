package com.tasks.lesson5;

/**
 * Имеются 2 строки. Напишите метод, возвращающий количество вхождений одной строки в другую.
 */

import java.util.regex.*;

public class NumberOfOccurrences {
    public static void main(String[] args) {
        String string1 = "bhfbf 1234 jiljger 123 jfiejk 123 123";
        String string2 = "123";
        System.out.println(countNumber(string1, string2));
    }

    public static int countNumber(String string1, String string2) {
        Pattern pattern = Pattern.compile(string2);
        Matcher matcher = pattern.matcher(string1);
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        return count;
    }
}