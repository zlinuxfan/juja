package lab.lab14;

import org.junit.Test;

import static org.junit.Assert.*;

public class HardBubbleSorterTest {
    @Test
    public void sort() throws Exception {
        int arr[] = new int[]{1, 5, 9, 3, 6};

        HardBubbleSorter.sort(arr);

        assertArrayEquals(new int[]{1, 3, 5, 6, 9}, arr);
    }

    @Test
    public void sort_2() throws Exception {
        int arr[] = new int[]{2, 1, 5, 9, 3, 6, 0};

        HardBubbleSorter.sort(arr);

        assertArrayEquals(new int[]{0, 1, 2, 3, 5, 6, 9}, arr);
    }

    @Test
    public void sort_3() throws Exception {
        int arr[] = new int[]{9, 6, 5, 3, 2, 1, 0};

        HardBubbleSorter.sort(arr);

        assertArrayEquals(new int[]{0, 1, 2, 3, 5, 6, 9}, arr);
    }

}