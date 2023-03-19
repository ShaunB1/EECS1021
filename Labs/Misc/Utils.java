package Misc;

public class Utils {
    /**
     * Determines if {@code target} is within {@code [lowerBound, upperBound)}
     * @param target the number to test
     * @param lowerBound the lower bound of the range
     * @param upperBound the upper bound of the range
     * @return {@code true} if {@code target} is within {@code [lowerBound, upperBound)}; {@code false} otherwise
     *
     * @apiNote see https://edabit.com/challenge/fvhabpSbe4vjWS9rP
     */
    public static boolean withinRange(int target, int lowerBound, int upperBound) {

        /* ---------------------------------------------
         * Dear student:
         * To make this work
         *   1. Erase line 22.
         *   2. Uncomment line 21
         * |||||||||||||||||||||||||||||||||||||||||||||
         * vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv */

        if((target >= lowerBound) & (target <= upperBound))
        {
            System.out.println("the value " + target + " in bounds.");
            return true;
        }
        else
        {
            System.out.println("the value " + target + " is out of bounds.");
            return false;
        }
    }
}