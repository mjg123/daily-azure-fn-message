package lol.gilliard;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DailyMessage {

    public static void main(String[] args) {
        System.out.println(new DailyMessage().getTodaysMessage());
    }

    public String getTodaysMessage(){
        LocalDate today = LocalDate.now(Config.MY_TIMEZONE);
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("EEEE, MMMM dd");
        String todaysDate = today.format(dateFormatter);

        return String.format(
            "Good Morning!\n\n" +
            "It's %s",
            todaysDate
        );
    }

}
