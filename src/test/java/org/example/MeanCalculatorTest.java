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
    void testCalculateMean_inputNormalArray() {
        //Arrange
        int[] input = {1,2,3,4};
        double expectedResult = 2.5f;

        //Act
        double actualResult = meanCalculator.calculateMean(input);

        //Assert
        assertEquals(expectedResult, actualResult);

    }

    @Test
    @DisplayName("Tests whether the MeanCalculator.calculateMean() method returns " +
            "the mean value from an input array of integers")
    void testCalculateMean_inputNegativeNumbers() {
        //Arrange
        int[] input = {1,2,-3,4};
        float expectedResult = 1f;

        //Act
        double actualResult = meanCalculator.calculateMean(input);

        //Assert
        assertEquals(expectedResult, actualResult);

    }

    @Test
    @DisplayName("Test mean calculator works with an array including Integer.MAX_VALUE")
    public void testMeanCalculator_inputLargeInt(){

        //arrange
        int[] input = {1,2,3,500000000};
        double expectedResult = 125000001.5;

        //Act
        double actualResult = meanCalculator.calculateMean(input);

        //Assert
        assertEquals(expectedResult,actualResult);

    }

    @Test
    @DisplayName("Test mean calculator works with an array including Integer.MAX_VALUE")
    public void testMeanCalculator_inputMaxInt(){

        //arrange
        int[] input = {Integer.MAX_VALUE, 1,2,3};
        double expectedResult = 536870913.25;

        //Act
        double actualResult = meanCalculator.calculateMean(input);

        //Assert
        assertEquals(expectedResult,actualResult);

    }

    //empty array


    @Test
    @DisplayName("Test mean calculator works with an empty array")
    public void testMeanCalculator_inputEmptyArray(){

        //arrange
        int[] input = {};
        double expectedResult = 0;

        //Act
        double actualResult = meanCalculator.calculateMean(input);

        //Assert
        assertEquals(expectedResult,actualResult);

    }

    //all the numbers are the same
    @Test
    @DisplayName("Test mean calculator works if all numbers are the same")
    public void testMeanCalculator_inputArrayWithSameNumbers(){

        //arrange
        int[] input = {2,2,2,2};
        double expectedResult = 2;

        //Act
        double actualResult = meanCalculator.calculateMean(input);

        //Assert
        assertEquals(expectedResult,actualResult);

    }

}