package com.pd.algorithms;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SearchWordInMatrixTest {

    @Test
    @DisplayName("Word does not exist")
    void checkExistsFalse() {
        SearchWordInMatrix searchWordInMatrix = new SearchWordInMatrix();
        char[][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        boolean result = searchWordInMatrix.exist(board, "ABZDC");
        assertFalse(result);
    }

    @Test
    @DisplayName("Word exists")
    void checkExistsTrue() {
        SearchWordInMatrix searchWordInMatrix = new SearchWordInMatrix();
        char[][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        boolean result = searchWordInMatrix.exist(board, "ABCCED");
        assertTrue(result);
    }
}
