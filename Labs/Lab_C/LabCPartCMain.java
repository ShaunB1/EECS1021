package Lab_C;

import Lab_C.MathVector;

import java.util.Scanner;

public class LabCPartCMain {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // Action: MathVector.filled()
        System.out.println("How many elements do you want?");
        int userElements = input.nextInt();

        MathVector firstMethod = MathVector.filled(userElements, 0);
        System.out.println("Array with n number of elements: " + firstMethod);

        // Action: MathVector.random()
        MathVector secondMethod = MathVector.random(userElements, 0, 100);
        System.out.println("Array with n random elements: " + secondMethod);

        // Action: MathVector.parse()
        MathVector thirdMethod = MathVector.parse(Integer.toString(userElements));
        System.out.println("String version of user input: " + thirdMethod);

        // Action: MathVector.at()
        System.out.println("At index 3: " + secondMethod.at(3));

        // Action: MathVector.magnitude()
        System.out.println("Magnitude: " + secondMethod.magnitude());

        // Action: MathVector.add()
        System.out.println("Sum of array + array = " + secondMethod.add(secondMethod));

        // Action: MethodVector.toString()
        int[] userInt = {userElements};
        MathVector userVec = new MathVector(userInt);
        System.out.println("Another string version of user input: " + userVec.toString());
    }
}
