import java.time.DayOfWeek;
import java.time.Month;
import java.time.OffsetDateTime;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        int anno = data.getYear();
        Month mese = data.getMonth();
        int giorno = data.getDayOfMonth();
        DayOfWeek giornoSettimana = data.getDayOfWeek();

        System.out.println(anno);
        System.out.println(mese);
        System.out.println(giorno);
        System.out.println(giornoSettimana);

    }
}
