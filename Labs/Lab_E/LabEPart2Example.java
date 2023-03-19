package Lab_E;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class LabEPart2Example {
    public static void main(String[] args){
        String csvString = "apples, oranges, pears plums";
        String[] elements = csvString.split(",");

        List<String> fixedLengthList = Arrays.asList(elements);
        ArrayList<String> listOfString = new ArrayList<String>(fixedLengthList);

        System.out.println("List from comma separated string: " + listOfString);
        System.out.println("Size of ArrayList: " + listOfString.size());
    }
}
