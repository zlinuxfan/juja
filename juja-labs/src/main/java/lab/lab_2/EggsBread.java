package lab.lab_2;

public class EggsBread {
    public static String printPurchases(boolean hasEggs, boolean hasBread) {
        String answer = "";

        if (hasEggs) {
            answer = "eggs";
            if (hasBread) {
                answer += ",bread";
            }
        } else {
            if (hasBread) {
                answer = "bread";
            }
        }

        return String.format("%s",
                answer);
    }
}