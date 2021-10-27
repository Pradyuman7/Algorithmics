package com.pd.algorithms;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FindPhraseTest {

    @Test
    @DisplayName("3 count")
    void checkCountFor1() {
        FindPhrase fp = new FindPhrase();
        assertEquals(fp.timesFound("sssssssssppw", "sss"), 3);
    }

    @Test
    @DisplayName("0 count")
    void checkCountFor0() {
        FindPhrase fp = new FindPhrase();
        assertEquals(fp.timesFound("sssssssssppw", "xxx"), 0);
    }
}
