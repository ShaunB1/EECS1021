package Lab_D;

import java.util.Random;
import java.util.Scanner;

public class LabDPart1 {
    public static final int UPPER_BOUND = 30;

    public static void main(String[] args){
        var RandomNumber = new Random();
        var scanObject = new Scanner(System.in);

        int guessInt = RandomNumber.nextInt(UPPER_BOUND+1);

        int counter = 1;
        Boolean userGuess = false;

        while(userGuess == false){
            System.out.print("Attempt " + counter + " --> Enter a Guess: ");
            int userNumber = scanObject.nextInt();

            if(userNumber == guessInt){
                System.out.println("Correct! Took " + counter + " guess(es)");
                userGuess = true;
            } else if(userNumber > guessInt){
                System.out.println("Guess is higher than answer \n");
                counter++;
            } else if(userNumber < guessInt){
                System.out.println("Guess is lower than answer \n");
                counter++;
            }
        }
    }
}
