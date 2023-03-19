package Lab_E;

import java.io.*;
import java.io.FileReader;
import com.opencsv.CSVReader;

public class LabEPreLab3 {

    public static String myMethod(int row){

        try {
            FileReader myFile = new FileReader("C:\\Users\\shaun\\OneDrive\\Desktop\\sample.txt");
            CSVReader csvReader = new CSVReader(myFile, ',');

            String[] line = null;
            int counter = 0;
            String storeValue = null;

            while((line = csvReader.readNext()) != null){
                if(counter == row){
                    storeValue = line[2];
                    break;
                }
                counter++;
            }

            return storeValue;
        } catch (IOException ex){
            return "error found";
        }
    }
}
