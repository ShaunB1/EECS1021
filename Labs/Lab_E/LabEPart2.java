package Lab_E;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class LabEPart2 {
    public static void main(String[] args){
        try {
            // Initialize String object containing .csv file path
            String path = "C:\\Users\\shaun\\OneDrive\\Desktop\\Part2_CO2_DataLog_Modified_short.csv";

            // Instantiate File object
            File theAirQualityFile = new File(path);

            // Read all rows in .csv file
            List<String> fixedLengthList = Files.readAllLines(theAirQualityFile.toPath());

            // Store row values inside ArrayList
            ArrayList<String> listOfString = new ArrayList<String>(fixedLengthList);

            // Initialize variables to be used in the for loop
            Double valueSum = 0.0;
            String[] line;

            // For loop that iterated through each row in the .csv file and collects the CO2 values
            for(int i = 0; i < listOfString.size(); i++){
                line = listOfString.get(i).split(",");
                valueSum = valueSum + Double.parseDouble(line[4]);
            }

            // Print out average CO2 value (ppm)
            System.out.println("CO2 (ppm) Average Value: " + valueSum/listOfString.size());

        } catch (IOException ex){
            ex.printStackTrace();
        }
    }
}