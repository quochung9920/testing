package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

@TestInstance(Lifecycle.PER_CLASS)
public class UtilitiesTestParameterized {

    Utilities util = new Utilities();

    @BeforeAll
    public void setup() {
        util = new Utilities();
    }

    @ParameterizedTest  
    @CsvSource({
            "ABCDEFF, ABCDEF",
            "AB88EFFG, AB8EFG",
            "112233445566, 123456",
            "A, A"
    })
    public void removePairs(String input, String output) throws Exception {
        assertEquals(output, util.removePairs(input));
    }
}