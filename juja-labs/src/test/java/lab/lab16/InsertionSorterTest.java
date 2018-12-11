package lab.lab16;

import org.junit.Test;

import static org.junit.Assert.*;

public class InsertionSorterTest {
    @Test
    public void sort() throws Exception {
        int[] arr = new int[] {5,7,1,2,9};
        InsertionSorter.sort(arr);

        assertArrayEquals(new int[] {1,2,5,7,9}, arr);
    }

}