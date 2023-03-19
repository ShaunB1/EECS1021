import org.firmata4j.IODevice;
import org.firmata4j.firmata.FirmataDevice;
import org.firmata4j.ssd1306.SSD1306;
import org.firmata4j.I2CDevice;

public class Lab_G_Part_1 {
    public static void main(String[] args) {
        String myPort = "COM6";
        IODevice myGroveBoard = new FirmataDevice(myPort);

        try {
            myGroveBoard.start();
            myGroveBoard.ensureInitializationIsDone();

            I2CDevice i2cObject = myGroveBoard.getI2CDevice((byte) 0x3C);
            SSD1306 myOLED = new SSD1306(i2cObject, SSD1306.Size.SSD1306_128_64);

            myOLED.init(); // Initialize the OLED object

            myOLED.getCanvas().setTextsize(4);
            myOLED.getCanvas().write("Shaun");

            myOLED.display();

            Thread.sleep(2000);

            myGroveBoard.stop();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
