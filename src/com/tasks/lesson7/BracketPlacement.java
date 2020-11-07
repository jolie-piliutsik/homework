package com.tasks.lesson7;
/**
 * Задана строка, состоящая из символов «(», «)», «[», «]», «{», «}».
 * Проверить правильность расстановки скобок.
 * Использовать стек.
 */

import java.util.Stack;

public class BracketPlacement {
    public static void main(String[] args) {
        String string = "{}])";
        System.out.println("Скобки расставлены правильно: " + isPairCorrect(string));
    }

    public static boolean isPair(char opening, char closing) {
        if (opening == '(' && closing == ')') {
            return true;
        }
        if (opening == '[' && closing == ']') {
            return true;
        }
        if (opening == '{' && closing == '}') {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isPairCorrect(String value) {
        char[] chars = value.toCharArray();
        Stack<Character> brackets = new Stack<>();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '(' || chars[i] == '[' || chars[i] == '{') {
                brackets.push(chars[i]);
            }
            if (chars[i] == ')' || chars[i] == ']' || chars[i] == '}') {
                if (brackets.empty()) {
                    return false;
                } else if ((isPair(brackets.peek(), chars[i]))) {
                    if (brackets.peek() == '(' || brackets.peek() == '[' || brackets.peek() == '{') {
                        brackets.pop();
                    } else {
                        return false;
                    }
                }
            }
        }
        if (brackets.empty()) {
            return true;
        } else {
            return false;
        }
    }
}