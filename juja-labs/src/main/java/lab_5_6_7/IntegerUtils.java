package lab_5_6_7;

public class IntegerUtils {
    public static int leftShift(int arg) {
        int lastBit = arg >>> 31;
        return (arg << 1) + lastBit;
    }

    public static int rightShift(int arg) {
        int lastBit = arg << 31;
        return (arg >>> 1) + lastBit;
    }
}
