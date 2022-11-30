package praktika_21_lesson.task1;

public enum Country {
    KYRGYZSTAN,
    USA,
    RUSSIA,
    KAZAKHSTAN,
    UZBEKISTAN,
    TAJIKISTAN;



    public static Country[] getValues(Country [] countries){
        return countries;
    }

    public static Country  getOrdinal(int num, Country[] countries){

        for (Country country : countries) {
            if (country.ordinal() == num){
                return country;
            }
        }
        return null;
    }

    public static Country getName(String nsme, Country [] countries){
        for (Country country : countries) {
            if (country.name().equals(nsme.toUpperCase())){
                return country;
            }
        }
        return null;
    }
}
