package Lab_H;

import org.firmata4j.I2CDevice;
import org.firmata4j.IODevice;
import org.firmata4j.firmata.FirmataDevice;
import org.firmata4j.Pin;
import org.firmata4j.ssd1306.SSD1306;

import static Lab_H.Pins.*;

public class Part_2 {
    public static void main(String[] args) {
        String myPort = "COM6";
        IODevice myBoard = new FirmataDevice(myPort);

        try {
            myBoard.start();
            myBoard.ensureInitializationIsDone();

            Pin potentiometerObject = myBoard.getPin(14);

            Pin buttonObject = myBoard.getPin(6);
            buttonObject.setMode(Pin.Mode.INPUT);

            I2CDevice i2cObject = myBoard.getI2CDevice(I2C0);

            SSD1306 myOLED = new SSD1306(i2cObject, SSD1306.Size.SSD1306_128_64);
            myOLED.init();

            PotentiometerListener potListener = new PotentiometerListener(potentiometerObject, buttonObject, myOLED);

            myBoard.addEventListener(potListener);

        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }
}
