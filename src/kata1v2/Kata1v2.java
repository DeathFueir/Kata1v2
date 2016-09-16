package kata1v2;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Kata1v2 {

    public static void main(String[] args) {
        Calendar date;
        date = GregorianCalendar.getInstance();
        date.set(1996,6,29);
        
        Person a = new Person("Sergio", date);
        System.out.println("El nombre de la persona es "+a.getName()+" y su edad es "+a.getAge()+ " años.");
        
    }
}
