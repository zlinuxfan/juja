package lab.lab_11;

import org.junit.Assert;
import org.junit.Test;

public class MathUtilsTest {

    @Test
    public void lookFor_0() {
        Assert.assertEquals(
                MathUtils.lookFor(0),
                0
        );
    }

    @Test
    public void lookFor_1() {
        Assert.assertEquals(
                MathUtils.lookFor(1),
                0
        );
    }

    @Test
    public void lookFor_2() {
        Assert.assertEquals(
                1,
                MathUtils.lookFor(2)
        );
    }

    @Test
    public void lookFor_14() {
        Assert.assertEquals(
                8,
                MathUtils.lookFor(14)
        );
    }
}