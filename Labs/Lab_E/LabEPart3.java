package Lab_E;

import com.opencsv.CSVReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class LabEPart3 {
    public static void main(String[] args){
        try{
            FileReader myFile = new FileReader("C:\\Users\\shaun\\OneDrive\\Desktop\\single_waterstation1_data_jan25.csv");
            CSVReader csvReader = new CSVReader(myFile, ',');

            String[] oneLineRecord = null;

            while((oneLineRecord = csvReader.readNext()) != null){
                System.out.println(Arrays.toString(oneLineRecord));
            }

            csvReader.close();
            myFile.close();

        } catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
