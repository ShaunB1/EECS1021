package Lab_F;

import org.firmata4j.firmata.*;
import org.firmata4j.IODevice;
import org.firmata4j.Pin;
import java.io.IOException;

public class LabFPart1 {
    public static void main(String[] args)
    throws IOException
    {
        String myPort = "COM6";
        IODevice myGroveBoard = new FirmataDevice(myPort);

        try {
            myGroveBoard.start();
            System.out.println("Board started.");
            myGroveBoard.ensureInitializationIsDone();
        } catch(Exception ex) {
            System.out.println("Couldn't connect to board.");
        } finally {
            var myLED = myGroveBoard.getPin(4);
            myLED.setMode(Pin.Mode.OUTPUT);

            for(int i=1; i <= 6; i++) {
                myLED.setValue(1);
                try {
                    Thread.sleep(2000);
                } catch(Exception ex) {
                    System.out.println("Sleep error.");
                }
                myLED.setValue(0);
                try {
                    Thread.sleep(2000);
                } catch(Exception ex) {
                    System.out.println("Sleep error.");
                }
            }

            myGroveBoard.stop();
            System.out.println("Board stopped.");
        }
    }
}
