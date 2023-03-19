package Lab_G;

import org.firmata4j.ssd1306.SSD1306;

import java.util.TimerTask;

public class NameTask extends TimerTask {
    private int counter = 10;
    private final SSD1306 myOLED;

    public NameTask(SSD1306 aDisplayObject) {
        myOLED = aDisplayObject;
    }

    @Override
    public void run() {
        while(counter <= 3) {
            myOLED.getCanvas().clear();
            myOLED.getCanvas().setTextsize(2);

            myOLED.getCanvas().drawString(0, 0, "Shaun");
            try {
                myOLED.display();
                Thread.sleep(1000);
                myOLED.clear();
            } catch(Exception ex) {
                ex.printStackTrace();
            }

            myOLED.getCanvas().drawString(0, 0, "Bautista");
            try {
                myOLED.display();
                Thread.sleep(1000);
                myOLED.clear();
            } catch(Exception ex) {
                ex.printStackTrace();
            }

            myOLED.getCanvas().drawString(0, 0, "218750935");
            try {
                myOLED.display();
                Thread.sleep(1000);
                myOLED.clear();
            } catch(Exception ex) {
                ex.printStackTrace();
            }
            counter++;
        }
        counter = 0;
    }
}
