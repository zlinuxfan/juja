package lab_8;

public class ArrayInverter {
    public static int[] invert(int[] arr) {
        for (int k = arr.length-1; k >= arr.length / 2; k--) {
            int tmp = arr[k];
            arr[k] = arr[arr.length - k - 1];
            arr[arr.length - k -1] = tmp;
        }

        return arr;
    }
}
