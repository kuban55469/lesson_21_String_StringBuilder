package praktika_21_lesson.task2.custome;

import praktika_21_lesson.task1.Country;
import praktika_21_lesson.task3.WordError;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;


public class Customer implements Service {
    private String name;
    private String surName;
    private Country country;
    private LocalDate yearOfB;
    private String email;

    public Customer() {
    }

    public Customer(String name, String surName, Country country, LocalDate yearOfB, String email) {
        this.name = name;
        this.surName = surName;
        this.country = country;
        this.yearOfB = yearOfB;
        if (email.contains("@")){
            this.email = email;
        }else {
            System.out.println("Error email");
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public LocalDate getYearOfB() {
        return yearOfB;
    }

    public void setYearOfB(LocalDate yearOfB) {
        this.yearOfB = yearOfB;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", country=" + country +
                ", yearOfB=" + yearOfB +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public int getAge(Customer customers) {
             return LocalDate.now().getYear() - yearOfB.getYear();
    }

    @Override
    public Customer[] getCountryy(Customer[] customers) {
        Scanner scanner = new Scanner(System.in);
        try {
            String country1 = scanner.nextLine();
            if (!country1.matches("[a-zA-Za-яА-Я]*")) {
                throw new WordError("San jazganga bolboit!");
            }
                int counter = 0;
                for (Customer customer : customers) {
                    if (customer.country.name().equals(country1.toUpperCase())) {
                        counter++;
                    }
                }

                int index = 0;
                Customer[] customers1 = new Customer[counter];
                for (Customer customer : customers) {
                    if (customer.country.name().equals(country1.toUpperCase())) {
                        customers1[index] = customer;
                        index++;
                    }
                }
                return customers1;
        }catch (WordError e){
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public Country[] sortCountry(Customer[] customers) {
        Country[] countries = new Country[customers.length];
        int index = 0;
        for (Customer customer : customers) {
            countries[index] = customer.country;
            index++;
        }
        Arrays.sort(countries);
        return countries;
    }

    @Override
    public Customer[] getAll(Customer[] customers) {
        for (int i = 0; i < customers.length; i++) {
            return customers;
        }
        return null;
    }
}
