/*Создать список оценок учеников ArrayList, заполнить случайными числами
Найти самую высокую оценку с использованием итератора*/

package com.tasks.lesson6;

import java.util.*;

public class Marks {
    public static void main(String[] args) {
        List<Integer> marks = new ArrayList<>();
        for (int i = 0; i < 25; i++) { //создаём рандомный список оценок 25 учеников
            int range = 11;
            int mark = (int) (Math.random() * range);
            marks.add(mark);
        }
        System.out.println("Оценки учеников: " + marks);

        int max = marks.get(0);
        for (Integer m : marks) { //определяем самую высокую оценку
            if (m > max) {
                max = m;
            }
        }
        System.out.println("Самая высокая оценка: " + max);
    }
}