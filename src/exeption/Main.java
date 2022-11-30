package exeption;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            String name = scanner.nextLine();
            if (!name.matches("[a-zA-Za-яА-Я]*")) {
                throw new MuExc("at san bolboit");
            }
            System.out.println("Age");
            int age = scanner.nextInt();
            if (age<0){
                throw  new MuExc("jash bukva bolboit");
            }
        }catch (MuExc e){
            System.out.println(e.getMessage());
        }catch (InputMismatchException e){
            e.printStackTrace();
        }

    }
}
