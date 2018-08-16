package lab_3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DayMonthTest {

    @Test
    void getMonthOfYear() {
        assertEquals(
                "January",
                DayMonth.getMonthOfYear(1));

        assertEquals(
                "May",
                DayMonth.getMonthOfYear(5));
    }

    @Test
    void getMounthOfYear_empty() {
        assertEquals(
                "",
                DayMonth.getMonthOfYear(0)
        );

        assertEquals(
                "",
                DayMonth.getMonthOfYear(-1)
        );

        assertEquals(
                "",
                DayMonth.getMonthOfYear(17)
        );
    }
}