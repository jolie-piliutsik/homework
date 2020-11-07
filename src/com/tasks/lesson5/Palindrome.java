package com.tasks.lesson5;

/**
 * Напишите метод, который проверяет, является ли слово палиндромом
 */

public class Palindrome {
    public static void main(String[] args) {
        String string = "шалаш";
        System.out.println("Слово является палиндромом: " + isPalindrome(string, string));
    }

    public static boolean isPalindrome(String value1, String value2) {
        for (int i = 0; i < value1.length(); i++) {
            if (value1.charAt(i) != value2.charAt(value2.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}