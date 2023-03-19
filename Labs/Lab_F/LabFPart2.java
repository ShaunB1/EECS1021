package Lab_F;

import org.firmata4j.Pin;
import org.firmata4j.firmata.FirmataDevice;
import org.firmata4j.IODevice;

import java.util.Timer;
import java.io.IOException;

public class LabFPart2 {
    public static void main(String[] args)
    throws IOException {
        String myPort = "COM6";
        IODevice myGroveBoard = new FirmataDevice(myPort);

        try {
            myGroveBoard.start();
            System.out.println("Board started.");
            myGroveBoard.ensureInitializationIsDone();
        } catch(Exception ex) {
            System.out.println("Couldn't connect to board.");
        }
        Pin myButton = myGroveBoard.getPin(6);
        myButton.setMode(Pin.Mode.INPUT);

        Timer myTimer = new Timer();

        var task = new ButtonTask(myButton);

        myTimer.schedule(task, 0, 1000);
    }
}
