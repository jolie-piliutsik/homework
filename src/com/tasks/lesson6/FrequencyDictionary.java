/**
 * Имеется текст. Следует составить для него частотный словарь.
 */

package com.tasks.lesson6;

import java.util.*;

public class FrequencyDictionary {

    public static void main(String[] args) {
        String text = "Старика одолела слабость и дурнота; " +
                "он почти ничего не видел. Но, опустив бечеву гарпуна, " +
                "он стал медленно перебирать ее в изрезанных руках, " +
                "а когда зрение вернулось, он увидел, что рыба лежит " +
                "на спине, серебряным брюхом кверху. Рукоятка гарпуна торчала " +
                "наискось из ее спины, а море вокруг было окрашено кровью ее сердца. " +
                "Сначала пятно было темное, словно голубую воду на целую милю вглубь " +
                "заполнила стая рыб. Потом пятно расплылось и стало похоже на облако. " +
                "Серебристая рыба тихо покачивалась на волнах.";
        System.out.println(calculateFrequency(text));
    }

    private static Map<String, Integer> calculateFrequency(String text) {
        Map<String, Integer> result = new HashMap<>();
        String[] text2 = text
                .replace(".", "")
                .replace(",", "")
                .split(" ");

        for (String word : text2) {
            Integer count = result.get(word);
            Integer count2 = count == null ? 1 : count + 1;
            result.put(word, count2);
        }
        return result;
    }
}