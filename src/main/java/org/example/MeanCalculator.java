package org.example;

import java.util.Arrays;

public class MeanCalculator {

    public float calculateMean(int[] array){

        int sumOfAllNumbers = Arrays.stream(array).sum();

        return (float)sumOfAllNumbers/(float)array.length;

        //if they're all the same, mean = array[0].

    }
}
