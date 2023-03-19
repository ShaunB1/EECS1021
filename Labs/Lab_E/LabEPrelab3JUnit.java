package Lab_E;

import static org.junit.Assert.*;  // needs to be static.

import Lab_E.LabEPreLab3;
import org.junit.Test;

public class LabEPrelab3JUnit {
    // the test
    @Test
    public void test1(){

        String StringOut = null;
        String[] ReferenceString = {"2022/02/18"," 8:21", " 950", " 20"," 29"};    // first line in https://www.eecs.yorku.ca/~drsmith/eecs1021/labE/DATALOG_clean_short.TXT
        String[] ReferenceString2 = {"2022/02/18"," 8:18", " 952", " 20", " 29"};    // line 3  in https://www.eecs.yorku.ca/~drsmith/eecs1021/labE/DATALOG_clean_short.TXT

        Integer useRow = 0;
        Integer useColumn = 2;
        Integer useAnotherRow = 3;

        // subtest 1
        System.out.println("[** Test 1, subtest 1 **]");
        StringOut= LabEPreLab3.myMethod( useRow);
        System.out.println("Checking: " + StringOut + " came out of row " + useRow + "  in the CSV file against " + ReferenceString[useColumn] + " that was expected.");
        System.out.println("Note: there is a space just before the number.");
        assertEquals(ReferenceString[2], StringOut);

        // subtest 2
        System.out.println("[** Test 1, subtest 2 **]");
        StringOut=LabEPreLab3.myMethod( useAnotherRow);
        System.out.println("Checking: " + StringOut + " came out of row " + useAnotherRow + "  in the CSV file against " + ReferenceString2[useColumn] + " that was expected.");
        System.out.println("Note: there is a space just before the number.");
        assertEquals(ReferenceString2[2], StringOut);

    }
}
