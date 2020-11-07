package com.tasks.lesson8.task2;

/**
 * Задание 2: Прочитать текст Java-программы и удалить из него все «лишние» пробелы
 * и табуляции, оставив только необходимые для разделения операторов.
 * При выполнении следующих задания для вывода результатов
 * создавать  файл средствами класса File. Новый файл должен заменить входной но с другим именем.
 */

import java.io.*;

public class Task2 {
    public static void main(String[] args) throws IOException {

        // считываем поток Example.java
        File file = new File(String.join(File.separator, "src", "com", "tasks", "lesson8", "task2", "Example.java"));
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String value;
            while ((value = bufferedReader.readLine()) != null) {
                //удаляем лишние пробелы
                String result = value.replaceAll("\\s+", " ");
                System.out.println(result);

                //записываем поток в новый файл
                File fileWriter = new File(String.join(File.separator, "src", "com", "tasks", "lesson8", "task2", "Example.txt"));
                try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileWriter, true))) {
                    bufferedWriter.newLine();
                    bufferedWriter.append(result);
                }
            }
        }
    }
}