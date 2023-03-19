import org.firmata4j.firmata.FirmataDevice;
import org.firmata4j.IODevice;
import org.firmata4j.I2CDevice;
import org.firmata4j.ssd1306.SSD1306;

import java.util.Timer;

public class Lab_G_Part_3 {
    static final byte I2C0 = 0x3C;

    public static void main(String[] args) {
        String myPort = "COM6";
        IODevice myGroveBoard = new FirmataDevice(myPort);

        try {
            myGroveBoard.start();
            myGroveBoard.ensureInitializationIsDone();

            I2CDevice i2cObject = myGroveBoard.getI2CDevice(I2C0);
            SSD1306 myOLED = new SSD1306(i2cObject, SSD1306.Size.SSD1306_128_64);

            myOLED.init();

            Timer myTimer = new Timer();

            var task = new OLEDTimerTask(myOLED);

            myTimer.schedule(task, 0, 1000);

        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }
}
