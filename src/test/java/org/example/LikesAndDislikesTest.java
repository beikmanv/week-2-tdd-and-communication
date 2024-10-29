package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LikesAndDislikesTest {

    @Test
    @DisplayName("Returns the correct reaction enum when passed an array or reaction enums")
    void evaluateLikesAndDislikes() {
        //arrange
        LikesAndDislikes likesAndDislikes = new LikesAndDislikes();
        Reaction expectedResult = Reaction.DISLIKE;
        Reaction[] reactionArray = {Reaction.DISLIKE};


        //act
        Reaction actualResult = likesAndDislikes.evaluateLikesAndDislikes(reactionArray);

        //assert
        assertEquals(expectedResult, actualResult);
    }
}