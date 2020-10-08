package com.tasks.lesson5;

import java.util.regex.*;

public class NumberOfOccurrences {
    public static void main(String[] args) {
        String string1 = new String("За тридевять земель, ЗА в тридесятом государстве жил-был царь с царицею.");
        String string2 = new String("зА");

        Pattern pattern = Pattern.compile(string2.toLowerCase());
        Matcher matcher = pattern.matcher(string1.toLowerCase());
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        System.out.println(count);
    }
}