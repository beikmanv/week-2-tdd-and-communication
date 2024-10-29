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



    @Test
    @DisplayName("Return sum of ascii characters when passing the string input containing a space")
    void sumAsciiCharacters_testSpaces() {
        // Arrange
        String inputString = "northcoders northcoders";
        int expectedOutput = 1195+1195+32;
        AsciiAdder asciiAdder = new AsciiAdder();

        // Act
        int actualOutput = asciiAdder.sumAsciiCharacters(inputString);

        // Assert
        assertEquals(expectedOutput, actualOutput);
    }



    @Test
    @DisplayName("Return sum of ascii characters when passing the string input containing special characters")
    void sumAsciiCharacters_testSpecialCharacters() {
        // Arrange
        String inputString = "northcoders©«";
        int expectedOutput = 1195 + 169 + 171;
        AsciiAdder asciiAdder = new AsciiAdder();

        // Act
        int actualOutput = asciiAdder.sumAsciiCharacters(inputString);

        // Assert
        assertEquals(expectedOutput, actualOutput);
    }




    @Test
    @DisplayName("Return sum of ascii characters when passing the string input containing non ascii characters")
    void sumAsciiCharacters_nonAsciiCharacters() {
        // Arrange
        String inputString = "northcoders人";
        int expectedOutput = 1195;
        AsciiAdder asciiAdder = new AsciiAdder();

        // Act
        int actualOutput = asciiAdder.sumAsciiCharacters(inputString);

        // Assert
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    @DisplayName("Return sum of ascii characters when passing the string input containing non ascii characters")
    void sumAsciiCharacters_nonAsciiCharacters2() {
        // Arrange
        String inputString = "Привет"; //6564
        int expectedOutput = 0;
        AsciiAdder asciiAdder = new AsciiAdder();

        // Act
        int actualOutput = asciiAdder.sumAsciiCharacters(inputString);

        // Assert
        assertEquals(expectedOutput, actualOutput);
    }



    @Test
    @DisplayName("Return sum of ascii characters when passing the string input containing empty string")
    void sumAsciiCharacters_emptyString() {
        // Arrange
        String inputString = "";
        int expectedOutput = 0;
        AsciiAdder asciiAdder = new AsciiAdder();

        // Act
        int actualOutput = asciiAdder.sumAsciiCharacters(inputString);

        // Assert
        assertEquals(expectedOutput, actualOutput);
    }


    @Test
    @DisplayName("Return sum of ascii characters when passing the string input containing non ascii characters")
    void sumAsciiCharacters_inputtingIntegers() {
        // Arrange
        int inputInt = 10;
        int expectedOutput = 97;
        AsciiAdder asciiAdder = new AsciiAdder();

        // Act
        int actualOutput = asciiAdder.sumAsciiCharacter(inputInt);

        // Assert
        assertEquals(expectedOutput, actualOutput);
    }
}