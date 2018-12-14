package lab.lab_9;

import org.junit.Assert;
import org.junit.Test;

public class ArrayFilterTest {

    @Test
    public void filterEven() {
        Assert.assertArrayEquals(
                new int[] {0},
                ArrayFilter.filterEven(new int[] {0})
        );
    }

    @Test
    public void filterEven_2() {
        Assert.assertArrayEquals(
                new int[] {2},
                ArrayFilter.filterEven(new int[] {2})
        );
    }

    @Test
    public void filterEven_3() {
        Assert.assertArrayEquals(
                new int[] {2,4,6,8,0,0},
                ArrayFilter.filterEven(new int[] {2,4,3,7,6,8})
        );
    }
}