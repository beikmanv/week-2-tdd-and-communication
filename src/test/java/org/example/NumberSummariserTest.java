package org.example;

import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

class NumberSummariserTest {

    @org.junit.jupiter.api.Test
    @DisplayName("Returning integer sum of all numbers in " +
            "input array excluding the lowest and the highest")
    void sumMiddleNumbers() {
        // Arrange
        int[] array = {10, 20, 30, 40};
        int expectedResult = 50;

        // Act
        NumberSummariser numberSummariser = new NumberSummariser();
        int actualResult = numberSummariser.sumMiddleNumbers(array);

        // Assert
        assertEquals(expectedResult, actualResult);
    }


    @org.junit.jupiter.api.Test
    @DisplayName("Returning integer sum of all numbers in " +
            "input array excluding the lowest and the highest")
    void sumMiddleNumbers_ifInputtedAllTheSameNumber() {
        // Arrange
        int[] array = {50, 50, 50, 50};
        int expectedResult = 100; //this passes, therefore arrays.stream().max() will
        // return even if all the numbers in the array are the same

        // Act
        NumberSummariser numberSummariser = new NumberSummariser();
        int actualResult = numberSummariser.sumMiddleNumbers(array);

        // Assert
        assertEquals(expectedResult, actualResult);
    }




    //all the numbers are the same -- what's gonna happen?
    //explore possible answer to this in the seminar?

}