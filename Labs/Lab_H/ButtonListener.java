package Lab_H;

import org.firmata4j.IODeviceEventListener;
import org.firmata4j.IOEvent;
import org.firmata4j.Pin;

public class ButtonListener implements IODeviceEventListener {
    private final Pin ledPin;
    private final Pin buttonPin;

    ButtonListener(Pin ledPin, Pin buttonPin) {
        this.buttonPin = buttonPin;
        this.ledPin = ledPin;
    }

    @Override
    public void onPinChange(IOEvent event) {
        if(event.getPin().getIndex() != buttonPin.getIndex()) {
            return;
        }
        boolean inverted = false;

        int[] switches = {0, 1};
        if(inverted == true) {
            switches[0] = 1;
            switches[1] = 0;
        }

        try {
            if(this.buttonPin.getValue() == switches[0]) {
                ledPin.setValue(0);
            } else if(this.buttonPin.getValue() == switches[1]) {
                ledPin.setValue(1);
            }
        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void onStart(IOEvent event) {

    }

    @Override
    public void onStop(IOEvent event) {

    }

    @Override
    public void onMessageReceive(IOEvent event, String message) {

    }
}
