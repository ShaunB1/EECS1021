package Misc;

import java.util.Scanner;

public class ComputeArea2 {

    public static void main(String[] args){
        System.out.println("Enter a radius values: ");
        Scanner input = new Scanner(System.in);
        double radius = input.nextDouble();
        final double PI = 3.141592654;

        if (radius>=0){
            double area = PI*radius*radius;
            System.out.println("Area is " + area);
        }

        else {
            System.out.println("Error: Negative radius");
        }
    }
}
