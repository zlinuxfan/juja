package lab_9;


public class ArrayFilter {
    public static int [] filterEven(int [] nums) {
        int[] answers = new int[nums.length];
        int counter = 0;
        for (int num : nums) {
            if (num % 2 == 0) {
                answers[counter++] = num;
            }
        }

        return answers;
    }
}
