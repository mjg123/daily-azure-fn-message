package lol.gilliard;

import com.microsoft.azure.functions.ExecutionContext;
import com.microsoft.azure.functions.annotation.FunctionName;
import com.microsoft.azure.functions.annotation.TimerTrigger;

import java.io.IOException;

public class Function {


    @FunctionName("TimerTrigger-Java")
    public void run(
        @TimerTrigger(name = "keepAliveTrigger", schedule = "0 30 7 * * *") String timerInfo,
        final ExecutionContext context) throws IOException {

        String todaysMessage = new DailyMessage().getTodaysMessage();
        new TwilioSMSSender().sendMessage(todaysMessage);

        return;
    }
}
