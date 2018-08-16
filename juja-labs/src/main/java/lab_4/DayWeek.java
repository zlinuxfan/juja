package lab_4;

public class DayWeek {
    public static String getDayOfTheWeek(int dayNum){
        String[] dayOfMonth = new String[]{
                "",
                "Monday",
                "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday",
                "Saturday",
                "Sunday"
        };

        return dayNum > 0 && dayNum < 8 ? dayOfMonth[dayNum] : "";
    }
}
