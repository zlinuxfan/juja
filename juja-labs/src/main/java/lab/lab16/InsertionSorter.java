package lab.lab16;

import java.util.Arrays;

public class InsertionSorter {
    public static void sort(int[] arr) {
        for (int k = 1; k < arr.length; k++) {
            int newElement = arr[k];
            int index;

            index = Arrays.binarySearch(arr, 0, k, newElement);
            if (index < 0) {
                index = -(index) - 1;
            }

            System.arraycopy(arr, index, arr, index + 1, k - index);

            arr[index] = newElement;
        }
    }
}
