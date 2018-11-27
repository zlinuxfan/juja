package lab_11;

public class MathUtils {
    public static int lookFor(int max) {
        int answer = 0;
        if (max < 2) {
            return 0;
        }

        for (int a = 1; a <= max; a++) {
            for (int b = 1; b <= max; b++) {
                if (a * a + b * b <= max) {
                    answer += 1;
                } else {
                    break;
                }
            }
        }

        return answer;
    }
}
