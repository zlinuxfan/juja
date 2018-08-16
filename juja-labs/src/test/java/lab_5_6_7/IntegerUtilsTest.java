package lab_5_6_7;

import org.junit.Assert;
import org.junit.Test;


public class IntegerUtilsTest {
    @Test
    public void rightShift() throws Exception {
        int data = 0b00100000_00000000_00000000_00000010;
        int expected = 0b00010000_00000000_00000000_00000001;

        Assert.assertEquals(expected, IntegerUtils.rightShift(data));

        data = 0b10000000_00000000_00000000_00000000;
        expected = 0b01000000_00000000_00000000_00000000;

        Assert.assertEquals(expected, IntegerUtils.rightShift(data));
    }

}