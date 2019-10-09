package wojtek;
import java.time.LocalDate;
import java.time.LocalTime;

public class HelloWorld {
    public static void main(final String [] args) {
        Greetings greetings = new Greetings();


        LocalDate myObj1 = LocalDate.now();
        System.out.println("/n dzisiaj jest:"+myObj1);

        LocalTime myObj2 = LocalTime.now();
        System.out.println("/n godzina:"+myObj2);
    }

}
