package Lab_H;

import org.firmata4j.IODeviceEventListener;
import org.firmata4j.IOEvent;
import org.firmata4j.Pin;
import org.firmata4j.ssd1306.SSD1306;

public class PotentiometerListener implements IODeviceEventListener {
    private final Pin potPin;
    private final Pin buttonPin;
    private final SSD1306 myOLED;

    PotentiometerListener(Pin potPin, Pin buttonPin, SSD1306 display) {
        this.potPin = potPin;
        this.buttonPin = buttonPin;
        this.myOLED = display;
    }

    @Override
    public void onStart(IOEvent ioEvent) {

    }

    @Override
    public void onStop(IOEvent ioEvent) {

    }

    @Override
    public void onPinChange(IOEvent event) {
        if(event.getPin().getIndex() != buttonPin.getIndex()) {
            return;
        }

        try {
            if(buttonPin.getValue() == 1) {
                myOLED.getCanvas().clear();
                myOLED.getCanvas().setTextsize(4);
                myOLED.getCanvas().drawString(0, 0, Integer.toString((int)potPin.getValue()));
                myOLED.display();
            } else if(buttonPin.getValue() == 0) {
                myOLED.clear();
            }

        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void onMessageReceive(IOEvent ioEvent, String s) {

    }
}
