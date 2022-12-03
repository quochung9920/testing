package org.example;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


public class UtilitiesTest {
    private Utilities util;

    @BeforeAll
    public void setup() {
        util = new Utilities();
    }

    @Test
    public void everyNthChar() throws Exception {
        char[] output = util.everyNthChar(new char[] { 'h', 'e', 'l', 'l', 'o' }, 2);
        assertArrayEquals(new char[] { 'e', 'l' }, output);
        char[] output2 = util.everyNthChar(new char[] { 'h', 'e', 'l', 'l', 'o' }, 8);
        assertArrayEquals(new char[] { 'h', 'e', 'l', 'l', 'o' }, output2);
    }

    @Test
    public void removePairs() throws Exception {
        assertEquals("ABCDEF", util.removePairs("AABCDDEFF"));
        assertEquals("ABCABDEF", util.removePairs("ABCCABDEEF"));
        assertNull("Did not get null returned when argument passed was null", util.removePairs(null));
        assertEquals("A", util.removePairs("A"));
        assertEquals("", util.removePairs(""));

    }

    @Test
    public void converter() throws Exception {
        assertEquals(300, util.converter(10, 5));
    }

    @Test
    public void converter_arithmeticException(){
        assertThrows(ArithmeticException.class, () -> util.converter(10, 0));
    }

    @Test
    public void nullIfOddLength() throws Exception {
        assertNull(util.nullIfOddLength("odd"));
        assertNotNull(util.nullIfOddLength("even"));
    }

}