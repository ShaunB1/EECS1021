package Misc;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args){
        String stringOne = "1.0, 2.0, 3.0";
        String stringTwo = "4.0, 5.0, 6.0";
        Double myTotal = 0.0;

        var myArrayList = new ArrayList<String>();

        myArrayList.add(stringOne);
        myArrayList.add(stringTwo);

        myTotal = Double.parseDouble(myArrayList.get(0).split(",")[2]);
        myTotal = myTotal + Double.parseDouble(myArrayList.get(1).split(",")[2]);

        System.out.println(myArrayList);
        System.out.println(myArrayList.get(0).split(",")[2]);
        System.out.println(myArrayList.get(1).split(",")[2]);
        System.out.println("Total: " + myTotal);
    }
}
