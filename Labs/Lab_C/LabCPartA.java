package Lab_C;

import java.util.Scanner;

public class LabCPartA {
    /**
     * Continuously reads binary numbers from the user and prints the running sum in binary.
     *
     * An input of 101, 11, 1010, 11 will yield outputs of 101, 1000, 10010, and 10101
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useRadix(2);

        int runningSum = 0;

        int i = 1;
        while(i==1){
            System.out.print("Enter a binary number: ");
            int userInput = input.nextInt();

            if(userInput==0) {
                break;
            }

            runningSum = runningSum + userInput;
            System.out.println("Running Sum: " + Integer.toBinaryString(runningSum));
        }
    }
}