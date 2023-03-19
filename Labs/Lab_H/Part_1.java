package Lab_H;

import org.firmata4j.firmata.FirmataDevice;
import org.firmata4j.IODevice;
import org.firmata4j.Pin;

import static Lab_H.Pins.*;

public class Part_1 {
    public static void main(String[] args) {
        String myPort = "COM6";
        IODevice myBoard = new FirmataDevice(myPort);

        try {
            myBoard.start();
            myBoard.ensureInitializationIsDone();

            Pin myButton = myBoard.getPin(D6);
            myButton.setMode(Pin.Mode.INPUT);

            Pin myLED = myBoard.getPin(D4);
            myLED.setMode(Pin.Mode.OUTPUT);

            ButtonListener buttonListener = new ButtonListener(myLED, myButton);

            myBoard.addEventListener(buttonListener);

        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }
}
