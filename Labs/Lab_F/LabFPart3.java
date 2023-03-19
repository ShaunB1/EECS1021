import org.firmata4j.Pin;
import org.firmata4j.IODevice;
import org.firmata4j.firmata.FirmataDevice;

import java.util.Timer;
import java.io.IOException;

public class LabFPart3 {
    public static void main(String[] args)
    throws IOException{
        String myPort = "COM6";
        IODevice myGroveBoard = new FirmataDevice(myPort);

        try {
            myGroveBoard.start();
            System.out.println("Board started.");
            myGroveBoard.ensureInitializationIsDone();

        } catch(Exception ex) {
            System.out.println("Couldn't read board.");
        }

        Pin myButton = myGroveBoard.getPin(4);
        myButton.setMode(Pin.Mode.OUTPUT);

        Timer myTimer = new Timer();

        var myTask = new LEDTask(myButton, 15000);

        myTimer.schedule(myTask, 0, 1000);
    }
}
