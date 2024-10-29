package org.example;

import java.util.Arrays;

public class MeanCalculator {

    public double calculateMean(int[] array){

        if(array.length == 0) return 0;

        Arrays.sort(array);
        if(array[0] == array[array.length-1]){
            System.out.println("Running if statement for identical array");
            return array[0];
        }

        long sumOfAllNumbers = Arrays.stream(array).sum();
        return (double)sumOfAllNumbers/(double)array.length;
    }
}
