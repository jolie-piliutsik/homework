/*Не используя вспомогательных объектов, переставить отрицательные элементы списка в конец,
а положительные - в начало списка.*/

package com.tasks.lesson6;

import java.util.*;

public class ChangingNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(-1);
        numbers.add(8);
        numbers.add(11);
        numbers.add(-19);
        numbers.add(2);
        numbers.add(3);
        Collections.sort(numbers);//сначала отсортируем элементы
        System.out.println(numbers);
        Collections.reverse(numbers);//сделаем обратный порядок элементов
        System.out.println(numbers);
    }
}