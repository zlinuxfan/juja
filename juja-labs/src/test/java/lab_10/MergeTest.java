package lab_10;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MergeTest {

    @Test
    public void merge() {
        Assert.assertArrayEquals(
                new int[]{1, 2, 3, 7, 8, 9},
                Merge.merge(new int[]{1, 2, 3}, new int[]{7, 8, 9})
                );
    }

    @Test
    public void merge_1() {
        Assert.assertArrayEquals(
                new int[]{1, 2, 3, 4, 5, 6},
                Merge.merge(new int[]{1, 3, 5}, new int[]{2, 4, 6})
        );
    }

    @Test
    public void merge_2() {
        Assert.assertArrayEquals(
                new int[]{1},
                Merge.merge(new int[]{}, new int[]{1})
        );
    }
}