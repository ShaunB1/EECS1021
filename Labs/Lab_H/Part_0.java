package Lab_H;

import org.firmata4j.firmata.FirmataDevice;
import org.firmata4j.IODevice;

public class Part_0 {
    public static void main(String[] args) {
        String myPort = "COM6";
        IODevice myBoard = new FirmataDevice(myPort);

        try {
            myBoard.start();
            System.out.println("Board started.");
            myBoard.ensureInitializationIsDone();
            myBoard.stop();
            System.out.println("Board stopped.");

        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }
}
