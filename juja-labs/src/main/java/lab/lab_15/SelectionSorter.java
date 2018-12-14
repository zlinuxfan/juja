package lab.lab_15;

public class SelectionSorter {
    public static void sort(int[] arr) {
        int minValue;
        int indexMinValue;


        for (int barrier = 0; barrier < arr.length - 1; barrier++) {
            minValue = arr[barrier];
            indexMinValue = 1;

            for (int index = barrier + 1; index < arr.length; index++) {
                if (arr[index] < minValue) {
                    minValue = arr[index];
                    indexMinValue= index;
                }
            }

            if (barrier < indexMinValue) {
                int tmp = arr[indexMinValue];
                arr[indexMinValue] = arr[barrier];
                arr[barrier] = tmp;
            }
        }
    }
}
