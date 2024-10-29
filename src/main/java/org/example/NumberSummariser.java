package org.example;
import java.util.Arrays;


public class NumberSummariser {

    public int sumMiddleNumbers(int[] array) {

        /*
        Using Test-Driven Development, create a class which has a method to sum all the numbers
        of a given array, except for the lowest and highest elements.
        */

        // 1. Find the smallest and the biggest number (Array method?).
        int minNumber = Arrays.stream(array).min().getAsInt();//50
        int maxNumber = Arrays.stream(array).max().getAsInt();//50
        // Check if the Arrays Stream method works:
        // System.out.println(String.valueOf(minNumber) + String.valueOf(maxNumber));

        // 2. Add up all the numbers of the array.
        int sumOfAllNumbers = Arrays.stream(array).sum();

        // 3. (Sum of all numbers) - (sum of the largest and the smallest).
        return sumOfAllNumbers - minNumber - maxNumber; //50,50,50,50 --> 100


    }
}
