package com.tasks.lesson8.task3;

/**
 * Нужно создать простейший класс с полями и методами. Провести с ним процессы сериализации и десериализации.
 */

import java.io.*;

public class SerializationDeserializationExample {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File file = new File(String.join(File.separator, "src", "com", "tasks", "lesson8", "task3", "filmInfo.txt"));
        writeObject(file);
        readObject(file);
    }

    private static void readObject(File file) throws IOException, ClassNotFoundException {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file))) {
            Object object = objectInputStream.readObject();
            System.out.println(object);
        }
    }

    private static void writeObject(File file) throws IOException {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file))) {
            Film film = new Film("Devchata", 92, "melodrama");
            objectOutputStream.writeObject(film);
        }
    }
}