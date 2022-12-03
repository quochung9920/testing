package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

/**
 * Created by timbuchalka on 28/11/16.
 */
public class UtilitiesTest {
    @Test
    public void everyNthChar() throws Exception {
        fail("This test has not been implemented");
    }

    @Test
    public void removePairs() throws Exception {
        Utilities util = new Utilities();
        assertEquals("ABCDEF", util.removePairs("AABCDDEFF"));
        assertEquals("ABCABDEF", util.removePairs("ABCCABDEEF"));
    }

    @Test
    public void converter() throws Exception {
        fail("This test has not been implemented");
    }

    @Test
    public void nullIfOddLength() throws Exception {
        fail("This test has not been implemented");
    }

}