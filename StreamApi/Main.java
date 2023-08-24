package StreamApi;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String fileName = "data.txt";
        String dataToSave = "Це приклад даних для збереження у файлі.";

        // Збереження даних у файл
        saveToFile(fileName, dataToSave);
        System.out.println("Дані збережено у файлі: " + fileName);

        // Зчитування даних з файлу та виведення на екран
        String readData = readFromFile(fileName);
        System.out.println("Дані, прочитані з файлу " + fileName + ":");
        System.out.println(readData);
    }

    // Зберігає отриману строку у файл
    public static void saveToFile(String fileName, String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Зчитує дані з файлу та повертає його користувачу
    public static String readFromFile(String fileName) {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content.toString();
    }


}