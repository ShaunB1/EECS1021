package Misc;

import java.io.FileInputStream;
import java.io.IOException;

public class MyTextFileReader {

    public static void main(String[] args)
    throws IOException {
        var myFileObject = new FileInputStream("myTextFile.txt");
        int myData;

        while((myData = myFileObject.read()) != -1){
            System.out.print((char)myData);
        }
        myFileObject.close();
    }
}
