package lab_5;

public class IntegerUtils {
    public static int leftShift(int arg) {
        int lastBit = arg >>> 31;
        return (arg << 1) + lastBit;
    }
}
