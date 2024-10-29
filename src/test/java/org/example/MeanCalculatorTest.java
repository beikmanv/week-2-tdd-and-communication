package org.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MeanCalculatorTest {

    static MeanCalculator meanCalculator;
    @BeforeAll
    static void setup(){
        meanCalculator = new MeanCalculator();
    }

    @Test
    @DisplayName("Tests whether the MeanCalculator.calculateMean() method returns " +
            "the mean value from an input array of integers")
    void testCalculateMean_returnsMeanValueFromInputArray() {
        //Arrange
        int[] input = {1,2,3,4};
        float expectedResult = 2.5f;

        //Act
        float actualResult = meanCalculator.calculateMean(input);

        //Assert
        assertEquals(expectedResult, actualResult);

    }

    @Test
    @DisplayName("Tests whether the MeanCalculator.calculateMean() method returns " +
            "the mean value from an input array of integers")
    void testCalculateMean_returnsMeanValueGivenNegativeNumbers() {
        //Arrange
        int[] input = {1,2,-3,4};
        float expectedResult = 1f;

        //Act
        float actualResult = meanCalculator.calculateMean(input);

        //Assert
        assertEquals(expectedResult, actualResult);

    }

//    @Test
//    @DisplayName()


    //test with Integer.MAX_INT

    //empty array

    //invalid input

    //all the numbers are the same

    //string input? assert exception?




}