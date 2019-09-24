package lol.gilliard;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.time.ZoneId;

public class Config {
    public static final ZoneId MY_TIMEZONE = ZoneId.of("Europe/London");
    public static final String WTTR_LOCATION = "Bath";
    public static final ObjectMapper MAPPER = new ObjectMapper();

    public static final String TWILIO_ACCOUNT_SID = "<ACCOUNT_SID>";
    public static final String TWILIO_AUTH_TOKEN = "<AUTH_TOKEN>";

    public static final String TWILIO_PHONE_NUMBER = "<YOUR TWILIO PHONE NUMBER>";
    public static final String MY_PHONE_NUMBER = "<YOUR MOBILE PHONE NUMBER>";

}
