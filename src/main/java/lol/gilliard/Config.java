package lol.gilliard;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.time.ZoneId;

public class Config {
    public static final ZoneId MY_TIMEZONE = ZoneId.of("Europe/London");
    public static final String WTTR_LOCATION = "Bath";
    public static final ObjectMapper MAPPER = new ObjectMapper();
}
