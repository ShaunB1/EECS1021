package Misc;

import java.util.Scanner;

public class ComputeAreaWithConsoleInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number for radius: ");
        double radius = input.nextDouble();
        final double PI = 3.141592654;
        double area = PI*radius*radius;
        System.out.println("Area for circle of radius " + radius + " is " + area);
    }
}
