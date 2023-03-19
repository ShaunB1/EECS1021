package Lab_D;

import Lab_D.LabDPart1;

import java.util.Random;

public class LabDPart2 {
    public static void main(String[] args){
        Random RandomNumber = new Random();

        boolean getAnswer = false;
        int upperBound = LabDPart1.UPPER_BOUND + 1;
        int lowerBound = 0;
        int counter = 1;

        int compGuess = RandomNumber.nextInt(upperBound - lowerBound) + lowerBound;

        while(!getAnswer){
            int compValue = RandomNumber.nextInt(upperBound - lowerBound) + lowerBound;

            System.out.println("\nAttempt " + counter + " --> Guess: " + compValue);

            if(compValue > compGuess){
                System.out.println("Guess > Answer");
                upperBound = compValue;
                System.out.println("Upper Bound: " + upperBound + " Lower Bound: " + lowerBound);
                counter++;
            } else if(compValue < compGuess){
                System.out.println("Guess < Answer");
                lowerBound = compValue;
                System.out.println("Upper Bound: " + upperBound + " Lower Bound: " + lowerBound);
                counter++;
            } else if(compValue == compGuess){
                System.out.println("\nCorrect! The value was " + compValue + "\nNumber of guesses: " + counter);
                getAnswer = true;
            }
        }
    }
}
