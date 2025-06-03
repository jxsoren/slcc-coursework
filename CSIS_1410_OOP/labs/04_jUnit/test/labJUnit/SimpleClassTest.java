package labJUnit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SimpleClassTest {
    // Test 1
    @Test
    void isLeapYear_YearIsMultipleOf4ButNotOf100_True() {
        assertTrue(SimpleClass.isLeapYear(2024));
    }

    // Test 2
    @Test
    void isLeapYear_YearIsMultipleOf100ButNotOf400_False() {
        assertFalse(SimpleClass.isLeapYear(1900));
    }

    // Test 3
    @Test
    void isLeapYear_YearIsMultipleOf400_True() {
        assertTrue(SimpleClass.isLeapYear(2000), "Years that can be exactly divided by 400, should be leap years.");
    }

    // Test 4
    @Test
    void isLeapYear_YearIsNotMultipleOf4_False() {
        assertFalse(SimpleClass.isLeapYear(2021));
    }

    // Test 5
    @Test
    void isLeapYear_YearIsZero_ThrowsIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> {
            SimpleClass.isLeapYear(0);
        });
    }

    // Test 6
    @Test
    void isLeapYear_YearIsNegative_ThrowsIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> {
            SimpleClass.isLeapYear(-400);
        });
    }

}