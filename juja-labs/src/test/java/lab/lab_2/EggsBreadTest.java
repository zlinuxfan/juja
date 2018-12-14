package lab.lab_2;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EggsBreadTest {

    @Test
    void printPurchases_false_false() {
        assertEquals("", EggsBread.printPurchases(false, false));
    }

    @Test
    void true_false() {
        assertEquals("eggs", EggsBread.printPurchases(true, false));
    }

    @Test
    void false_true() {
        assertEquals("bread", EggsBread.printPurchases(false, true));
    }

    @Test
    void true_true() {
        assertEquals("eggs,bread", EggsBread.printPurchases(true, true));
    }
}