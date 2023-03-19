import org.firmata4j.firmata.*;
import org.firmata4j.IODevice;

public class Lab_G_Part_0 {
    public static void main(String[] args) {
        String myPort = "COM6";
        IODevice myGroveBoard = new FirmataDevice(myPort);

        try {
            myGroveBoard.start();
            System.out.println("Board started.");

            myGroveBoard.ensureInitializationIsDone();

            myGroveBoard.stop();
            System.out.println("Board stopped.");

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
