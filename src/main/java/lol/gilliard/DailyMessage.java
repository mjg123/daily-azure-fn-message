package lol.gilliard;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DailyMessage {

    public static void main(String[] args) throws IOException {
        System.out.println(new DailyMessage().getTodaysMessage());
    }

    public String getTodaysMessage() throws IOException {
        LocalDate today = LocalDate.now(Config.MY_TIMEZONE);
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("EEEE, MMMM dd");
        String todaysDate = today.format(dateFormatter);

        Wttr.WttrResult wttr = new Wttr().getTodaysWeather();
        String affirmation = new Affirmation().getAffirmation();

        return String.format(
            "%s Good Morning %s 🌡%s\n\n" +
            "It's %s %s\n\n" +
            "%s\n\n" +
            "🌈 Have a Great Day 🌈",
            wttr.weather, wttr.weather, wttr.temperature,
            todaysDate, wttr.moonPhase,
            affirmation
        );
    }

}
