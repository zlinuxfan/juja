package lab_8;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayInverterTest {

    @Test
    public void invert_5() {
        Assert.assertArrayEquals(
                new int[] {5,4,3,2,1},
                ArrayInverter.invert(new int[] {1,2,3,4,5})
        );
    }

    @Test
    public void invert_2() {
        Assert.assertArrayEquals(
                new int[] {1,0},
                ArrayInverter.invert(new int[] {0,1})
        );
    }
}