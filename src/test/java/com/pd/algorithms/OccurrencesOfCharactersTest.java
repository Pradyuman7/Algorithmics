package com.pd.algorithms;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class OccurrencesOfCharactersTest {
    
    @Test
    @DisplayName("findNumOccurencesOfCharacter Test")
    void occurrencesOfCharactersTest() {
        OccurrencesOfCharacters oc = new OccurrencesOfCharacters("somess");
        assertEquals(oc.findNumOccurencesOfCharacter('s'), 3);
        assertEquals(oc.findNumOccurencesOfCharacter('e'), 1);
        assertEquals(oc.findNumOccurencesOfCharacter('x'), 0);
    }
}