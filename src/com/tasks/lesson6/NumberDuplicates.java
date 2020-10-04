/*Создать коллекцию, наполнить её случайными числами.
Удалить повторяющися числа.*/

package com.tasks.lesson6;

import java.util.*;

public class NumberDuplicates {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(); //создаём список из 15 случайных чисел от 0 до 25
        for (int i = 0; i < 15; i++) {
            int range = 25;
            int number = (int) (Math.random() * range);
            numbers.add(number);
        }
        System.out.println(numbers); //выведем этот список

        Set<Integer> numbersWithoutDoubles = new HashSet<>(); //Set не позволяет содержать дублирующиеся элементы
        numbersWithoutDoubles.addAll(numbers); //поэтому добавляем в HashSet числа из ArrayList
        System.out.println(numbersWithoutDoubles);
    }
}