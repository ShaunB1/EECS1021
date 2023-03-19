package Misc;

public class StringToInt{
    public static void main(String[] args) {
        int[] testInt = StringToArrayInt("5");
        System.out.println("The number is " + testInt);
    }

    public static int[] StringToArrayInt(String inputString) {
        int[] outputIntArray = {Integer.valueOf(inputString)};
        return outputIntArray;
    }
}