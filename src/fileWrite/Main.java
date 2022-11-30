package fileWrite;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        fileWriter();
        fileReader();

    }

    private static void fileReader() {
        try (FileReader fileReader = new FileReader("java8Info.txt")) {
            Scanner scanner = new Scanner(fileReader);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (IOException e) {
            System.err.println("Не удается найти указанный файл.");
        }
    }
    private static void fileWriter() {
        try (FileWriter fileWriter = new FileWriter("java8Info.txt")) {
            fileWriter.write("~~~ Peaksoft House ~~~");
            fileWriter.write("\nCourse: Java");
            fileWriter.write("\nGroup: Java-8");
            fileWriter.write("\nStudents: 61 ");
            fileWriter.write("\nMentors: Rahim, Maksat, Muhammed ");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
