package org.example;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

public class UtilitiesTest {
    @Test
    public void everyNthChar() throws Exception {
        Utilities utils = new Utilities();
        char[] output = utils.everyNthChar(new  char[] {'h', 'e', 'l', 'l', 'o'}, 2);
        assertArrayEquals(new char[] { 'e', 'l'}, output);
        char[] output2 = utils.everyNthChar(new  char[] {'h', 'e', 'l', 'l', 'o'}, 8);
        assertArrayEquals(new char[] {'h', 'e', 'l', 'l', 'o'}, output2);
    }

    @Test
    public void removePairs() throws Exception {
        Utilities util = new Utilities();
        assertEquals("ABCDEF", util.removePairs("AABCDDEFF"));
        assertEquals("ABCABDEF", util.removePairs("ABCCABDEEF"));
        assertNull("Did not get null returned when argument passed was null", util.removePairs(null));
        assertEquals("A", util.removePairs("A"));
        assertEquals("", util.removePairs(""));

    }

    @Test
    public void converter() throws Exception {
        Utilities util = new Utilities();
        assertEquals(300, util.converter(10, 5));

    }

    @Test
    public void nullIfOddLength() throws Exception {
        Utilities util = new Utilities();
        assertNull(util.nullIfOddLength("odd"));
        assertNotNull(util.nullIfOddLength("even"));
    }

}