package Lab_E;

import com.opencsv.CSVReader;
import java.io.FileReader;
import java.io.IOException;

public class LabEPart4 {
    public static void main(String[] args){
        try{
            FileReader myFile = new FileReader("C:\\Users\\shaun\\OneDrive\\Desktop\\ON_02HC024_daily_hydrometric_MODIFIED.csv");
            CSVReader csvReader = new CSVReader(myFile, ',');

            String[] line = null;
            double sum = 0.0;
            int counter = 0;

            while((line = csvReader.readNext()) != null){
                double discharge = Double.parseDouble(line[7]);
                sum = sum + discharge;
                counter++;
            }

            System.out.println("Total Data Points: " + counter + "\nDischarge Rate Avg: " + sum/counter);

        } catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
