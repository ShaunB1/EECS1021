package Lab_E;

import java.io.FileInputStream;
import java.io.IOException;

public class LabEPart1 {
    public static void main(String[] args)
    throws IOException {
        var myFileObject = new FileInputStream("Part1TextFile.txt");
        int myData = 0;

        while((myData = myFileObject.read()) != -1){
            System.out.print((char)myData);
        }
        myFileObject.close();
    }
}
