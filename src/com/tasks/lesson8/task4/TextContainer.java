package com.tasks.lesson8.task4;

@SaveToFile(file = "/file.txt")
public class TextContainer {
    public String text = "text container";

    @Saving()
    public static void saveText() {
        System.out.println("Текст сохранен");
    }
}