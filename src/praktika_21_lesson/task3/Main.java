package praktika_21_lesson.task3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            String name = scanner.nextLine();
            int age = scanner.nextInt();
            Student student = new Student(name,age);
            if (!name.matches("[a-zA-Zа-яА-Я]*")) {
                throw new WordError("\"Цифра jазганга болбойт\"");
            }
            System.out.println(student);
        } catch (WordError e) {
            System.out.println(e.getMessage());
        }catch (InputMismatchException e) {
            System.out.println("\"Буква жазганга болбойт\"");
        }
    }
}
