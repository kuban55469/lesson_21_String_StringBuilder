package praktika_21_lesson.task1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Country[] values = Country.values();
        int num = scanner.nextInt();

        switch (num) {
            case 1 -> System.out.println(Arrays.toString(Country.getValues(values)));
            case 2 -> System.out.println(Country.getName("Kyrgyzstan", values));
            case 3 -> System.out.println(Country.getOrdinal(5, values));
        }
    }
}
