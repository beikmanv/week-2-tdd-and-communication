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
}