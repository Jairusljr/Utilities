package org.utils.stringutils;

import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.utils.exceptions.InvalidStringInputException;

class StringParserTest {

    // methodToTest_input_expectedOutput
    @Test
    void splitString_oneSeparator_twoParts() throws InvalidStringInputException {
        StringParser sp = new StringParser();
        String inputString = "Hello | World!";
        String separator = "\\|";
        List<String> stringParts = sp.splitString(inputString, separator);
        assertEquals(2,stringParts.size());
    }

    // failure
    @Test
    void splitString_oneSeparator_null() {
        StringParser sp = new StringParser();
        String inputString = null;
        String separator = "\\|";

        assertThrows(InvalidStringInputException.class,
                () -> sp.splitString(inputString, separator));
    }
}