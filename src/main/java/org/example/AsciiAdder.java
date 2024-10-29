package org.example;

public class AsciiAdder {
    public int sumAsciiCharacters(String string){

        //integer output = 0
        int output = 0;

        //iterate through the string
        //for every character in the string, get the ascii value of the character
        // - which just means casting it to int, and add to the output number
        // int asciiValue = (int) 'a';

        for (int i = 0; i < string.length(); i++) {
            int asciiValue = (int) string.charAt(i);
            output += asciiValue;
        }

        //return the output number
        return output;
    }
}
