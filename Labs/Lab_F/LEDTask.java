import org.firmata4j.Pin;
import java.util.TimerTask;

public class LEDTask extends TimerTask {
    private final Pin myPin;
    private final int myPeriod;

    LEDTask(Pin pin, int period) {
        myPin = pin;
        myPeriod = period;
    }

    @Override
    public void run() {
        try {
            myPin.setValue(1);
            System.out.println("LED is on.");
            Thread.sleep(myPeriod);

            myPin.setValue(0);
            System.out.println("LED is off.");
            Thread.sleep(myPeriod);
        } catch(Exception ex) {
            ex.printStackTrace();
        }

    }
}
