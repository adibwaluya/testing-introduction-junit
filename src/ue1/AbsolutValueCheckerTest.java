package ue1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AbsolutValueCheckerTest {

    int validValue = 0;
    int invalidValue = 0;
    int negativeValue = -1;
    int positiveValue = 1;

    AbsolutValueChecker absolutValueChecker;

    @BeforeEach
    void setValue() {
        absolutValueChecker = new AbsolutValueChecker();
        this.validValue = 5;
        this.invalidValue = -5;
    }

    // Assert true for valid value (>0)
    @Test
    void validAbsolutIntChecker() {
        // 5 > -1
        assertTrue(absolutValueChecker.absolutIntChecker(this.validValue) > negativeValue, "This value is valid");
        // 5 < 1
        assertFalse(absolutValueChecker.absolutIntChecker(this.validValue) < positiveValue, "This value is invalid!");
    }

    @Test
    void invalidAbsolutIntChecker() {
        // -5 < -1
        assertTrue(absolutValueChecker.absolutIntChecker(this.invalidValue) <= negativeValue, "This value is invalid!");
        // -5 >= 1
        assertFalse(absolutValueChecker.absolutIntChecker(this.invalidValue) >= positiveValue, "This value is invalid!");
    }
}