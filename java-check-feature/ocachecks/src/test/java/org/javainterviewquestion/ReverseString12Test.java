package org.javainterviewquestion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseString12Test {


    @Test
    void reverseStringThenSuccess() {
        String toReverse = "Hello";

        String result = ReverseString12.reverseString(toReverse);

        assertEquals("olleH",result );

    }

}
