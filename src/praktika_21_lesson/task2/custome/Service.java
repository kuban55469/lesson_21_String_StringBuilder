package praktika_21_lesson.task2.custome;

import praktika_21_lesson.task1.Country;

public interface Service {

    int getAge(Customer customers);
    Customer [] getCountryy(Customer[] customers);

    Country[] sortCountry(Customer[] customers);

    Customer[] getAll(Customer[] customers);


}
