package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AsciiAdderTest {

    @Test
    @DisplayName("Return sum of ascii characters when passing the string input")
    void sumAsciiCharacters() {
        // Arrange
        String inputString = "northcoders";
        int expectedOutput = 1195;
        AsciiAdder asciiAdder = new AsciiAdder();

        // Act
        int actualOutput = asciiAdder.sumAsciiCharacters(inputString);

        // Assert
        assertEquals(expectedOutput, actualOutput);
    }
}