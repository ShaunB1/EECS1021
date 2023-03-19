import org.firmata4j.ssd1306.SSD1306;

import java.util.TimerTask;

public class OLEDTimerTask extends TimerTask {
    private int counter = 10;
    private final SSD1306 myOLED;

    public OLEDTimerTask(SSD1306 aDisplayObject) {
        myOLED = aDisplayObject;
    }

    @Override
    public void run() {
        while(counter >= 0) {
            myOLED.getCanvas().clear();
            myOLED.getCanvas().setTextsize(4);
            myOLED.getCanvas().drawString(0, 0, Integer.toString(counter));
            myOLED.display();
            try {
                Thread.sleep(1000);
            } catch(Exception ex) {
                ex.printStackTrace();
            }
            counter--;
        }
        counter = 10;
    }
}
