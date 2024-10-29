package org.example;

public class LikesAndDislikes {

    /*
    * Northcoders have introduced a like/dislike system for their lectures.
    * Students can hit like or dislike at the end of each lecture. To avoid students accidentally
    *  hitting the dislike button (why would they ever do that?!), the interface supports clicking buttons again to undo the press.

       Using TDD, write a method that will take a sequence of button presses and determine the overall outcome. (You can choose the input format:
       *  perhaps an enum for LIKE/DISLIKE, perhaps Strings...)

       Any two presses of the same button cancel out, so DISLIKE/DISLIKE is NEUTRAL.
       * That means that DISLIKE/DISLIKE/LIKE is ultimately a LIKE.

       If the user has actively pressed both buttons, that also cancels out, so an uncancelled
       * LIKE plus an uncancelled DISLIKE is also NEUTRAL. For example, LIKE/LIKE/LIKE/DISLIKE/DISLIKE/DISLIKE would be NEUTRAL.


    *
    * */

    public Reaction evaluateLikesAndDislikes(Reaction[] input){

        return Reaction.LIKE;
    }

}
