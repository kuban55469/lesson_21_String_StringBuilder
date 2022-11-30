package praktika_21_lesson.task2;

import praktika_21_lesson.task1.Country;
import praktika_21_lesson.task2.custome.Customer;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //getWrite();
        //getRider();

        Customer customer = new Customer();
        Customer customer4 = new Customer("Akyl","Daniarov", Country.KYRGYZSTAN, LocalDate.of(1997,10,01),"kuban@gmail.com");
        Customer customer2 = new Customer("Janysh","Akbalaev", Country.RUSSIA, LocalDate.of(1999,11,23),"janysh@gmail.com");
        Customer customer3 = new Customer("Asan","Ysonov", Country.TAJIKISTAN, LocalDate.of(2000,12,15),"asan@gmail.com");
        Customer customer1 = new Customer("Kuban","Kelsiinbekov", Country.KYRGYZSTAN, LocalDate.of(2000,12,10),"kuban@gmail.com");
        Customer customer5 = new Customer("Janysh","Akbalaev", Country.RUSSIA, LocalDate.of(1999,11,23),"janysh@gmail.com");
        Customer[] customers = {customer1,customer2,customer3,customer4,customer5};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Metod tandanyz: '1', '2', '3', '4' ");
        try {
            int n = scanner.nextInt();
            switch (n) {
                case 1:
                    for (Customer customerr : customers) {
                        System.out.println(customerr.getAge(customer) + " " + customerr.getName());
                    }
                    break;
                case 2:
                    System.out.println("Введите страну: ");
                    System.out.println(Arrays.toString(customer.getCountryy(customers)));
                    break;
                case 3:
                    System.out.println(Arrays.toString(customer.sortCountry(customers)));
                    break;
                case 4:
                    System.out.println(Arrays.toString(customer.getAll(customers)));
                    break;
                default:
                    System.out.println("Tuura san jazynyz!!");
            }
        }catch (InputMismatchException e){
            System.out.println("San jazynys suranych!!!!");
        }
    }

    public static void getRider(){
        try (FileReader fileReader = new FileReader("task.txt")) {
            Scanner scanner = new Scanner(fileReader);
            while (scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
        }catch (IOException e){
            e.printStackTrace();
        }

    }
    public static void getWrite(){
        try(FileWriter fileWriter = new FileWriter("task.txt")) {
            fileWriter.write("""
                    Customer деген класс тузунуз.Полерерин толтурунуз аты, фамилиясы,туулган олкосу,туулган жылы,почтасы болсун.
                    Дагы бир service деген интерфейс ачып аны анын ичине 4 метод жазыныз.
                    1-кардардын жашын кайтаруучу метод жазыныз,2-мамлекети окшош кардарларды кайтарыныз,3-кардарлардын мамлекетин сорттоп чыгарыныз,4-баардык кардарларды кайтаруучу метод жазыныз.
                    Ал интерфейсти Customer клласына impliments кылып методдорго логикасын жазыныз.Mainдан жазган логиканызды иштетиниз""");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
