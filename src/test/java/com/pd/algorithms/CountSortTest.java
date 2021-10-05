package sorting;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CountSortTest {
    @Test
    @DisplayName("Non repeating positive elements in array ")
    void count_sort(){
        int[] arr={ 1, 3, 9, 6, 2, 4};
        CountSorting cs =new CountSorting();
        assertArrayEquals(new int[]{1, 2, 3, 4, 6, 9}, cs.countSort(arr.length, arr));
    }

    @Test
    @DisplayName("Repeating positive elements in array ")
    void count_sort_with_duplicate(){
        int[] arr={ 1, 3, 9, 1, 2, 3};
        CountSorting cs =new CountSorting();
        assertArrayEquals(new int[]{ 1, 1, 2, 3, 3, 9}, cs.countSort(arr.length, arr));
    }
}
