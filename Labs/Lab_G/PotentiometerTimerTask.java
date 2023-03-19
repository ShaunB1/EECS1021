package Lab_G;

import java.util.TimerTask;

import org.firmata4j.Pin;
import org.firmata4j.ssd1306.SSD1306;
import org.firmata4j.ssd1306.MonochromeCanvas;

public class PotentiometerTimerTask extends TimerTask {
    static Pin myPin;
    private final SSD1306 myOLED;
    private final int i = 1;

    public PotentiometerTimerTask(SSD1306 aDisplayObject, Pin pin) {
        this.myPin = pin;
        myOLED = aDisplayObject;

    }

    @Override
    public void run() {
        System.out.println("Potentiometer Value: " + (double)myPin.getValue());
        double diffCheck = myPin.getValue();
        while(i == 1) {
            double value = (double)myPin.getValue();

            if(value != diffCheck) {
                System.out.println("Potentiometer Value: " + value);
            }
            diffCheck = value;
            myOLED.getCanvas().clear();
            myOLED.getCanvas().setTextsize(3);
            myOLED.getCanvas().drawString(0, 0, Double.toString(value));
            myOLED.getCanvas().drawHorizontalLine(0, 30, (int)value/10, MonochromeCanvas.Color.BRIGHT);
            myOLED.display();
        }
    }
}
