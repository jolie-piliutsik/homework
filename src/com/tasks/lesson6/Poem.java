/*Занести стихотворения одного автора в список.
Провести сортировку по возрастанию длин строк*/

package com.tasks.lesson6;

import java.util.*;

public class Poem {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Шаганэ ты моя, Шаганэ!");
        list.add("Потому, что я с севера, что ли,");
        list.add("Я готов рассказать тебе поле,");
        list.add("Про волнистую рожь при луне.");
        list.add("Шаганэ ты моя, Шаганэ.");

        Comparator<String> stringComparator = new Comparator<String>() { //создаём Comparator для сравнения строк
            @Override                                                    //по количеству символов
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(), o2.length());
            }
        };

        list.sort(stringComparator);

        for (String value : list) {
          System.out.println(value);
        }
    }
}