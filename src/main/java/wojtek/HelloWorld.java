package wojtek;

import java.time.LocalDate;
import java.time.LocalTime;

public class HelloWorld {
    public static void main(final String[] args) {
        LocalDate myObj1 = LocalDate.now();
        System.out.println("/n dzisiaj wieczorem jest:" + myObj1);
        Greetings greetings = new Greetings();
        LocalTime myObj2 = LocalTime.now();
        System.out.println("/n godzina:" + myObj2);
    }

}
