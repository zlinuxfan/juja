package lab15;

import org.junit.Test;

import static org.junit.Assert.*;

public class SelectionSorterTest {
    @Test
    public void sort() throws Exception {
        int arr[] = new int[] {5,4,9,1,2,7,3};

        SelectionSorter.sort(arr);

        assertArrayEquals(new int[] {1,2,3,4,5,7,9}, arr);
    }
}