package lol.gilliard;

import org.apache.http.client.fluent.Request;

import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;

public class Wttr {

    public static class WttrResult{
        public final String weather;
        public final String moonPhase;
        public final String temperature;

        public WttrResult(String weather, String moonPhase, String temperature) {
            this.weather = weather;
            this.moonPhase = moonPhase;
            this.temperature = temperature;
        }
    }

    public WttrResult getTodaysWeather() throws IOException {

        String url = String.format("https://wttr.in/%s?format=%%25c,%%25m,%%25t&m",
            URLEncoder.encode(Config.WTTR_LOCATION, "UTF-8"));

        String[] response = Request
            .Get(URI.create(url))
            .execute()
            .returnContent()
            .asString()
            .split(",");

        return new WttrResult(response[0], response[1], response[2].trim());
    }
}