import org.firmata4j.firmata.*; // Maven import Firmata4j & SLF4j on macOS & Windows
import org.firmata4j.IODevice; // You also need to import JSSC in using Windows.

public class LabFPart0 {
    public static void main(String[] args) {
        String myPort = "COM6"; // The USB port name varies.
        IODevice myGroveBoard = new FirmataDevice(myPort); // Board object, using the name of a port
        try {
            myGroveBoard.start(); // start comms with board;
            System.out.println("Board started.");
            myGroveBoard.ensureInitializationIsDone(); // make sure connection is good to board.
            myGroveBoard.stop(); // finish with the board. Shut down the connection.
            System.out.println("Board stopped.");
        }
        catch (Exception ex){
            System.out.println("couldn't connect to board."); // message if the connection didn’t happen.
        }
    }
}