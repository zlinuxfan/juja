package lab_3;

public class DayMonth {
    public static String getMonthOfYear(int number) {
     String[] dayOfMonth = new String[]{
             "",
             "January",
             "February",
             "March",
             "April",
             "May",
             "June",
             "July",
             "August",
             "September",
             "October",
             "November",
             "December"
     };

        return number > 0 && number < 13 ? dayOfMonth[number] : "";
    }
}
