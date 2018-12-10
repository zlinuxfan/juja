package lab.lab_5_6_7;


public class IntegerUtils {
    public static int leftShift(int arg) {
        int lastBit = arg >>> 31;
        return (arg << 1) + lastBit;
    }

    public static int rightShift(int arg) {
        int lastBit = arg << 31;
        return (arg >>> 1) + lastBit;
    }

    public static byte swapBits(byte b, int i, int j) {
        byte first = (byte) ((b >> i) & 1);
        byte second = (byte) ((b >> j) & 1);

        if (first != second) {
            b = (byte) (b ^ ((1 << i) | (1 << j)));
        }

        return b;
    }

    private static byte revertBit(byte b, int i) {

        return (byte) (b ^ 1 << i);
    }

    private static void printBinaryString(byte b) {
        System.out.println(String.format(
                "%8s",
                Integer.toBinaryString(b)
        ).replace(' ', '0'));
    }
}
