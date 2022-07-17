package ue1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AbsolutValueCheckerTest {

    int negativeValue;
    int positiveValue;

    AbsolutValueChecker absolutValueChecker;

    @BeforeEach
    void setValue() {
        absolutValueChecker = new AbsolutValueChecker();
        this.positiveValue = 5;
        this.negativeValue = -5;
    }

    // Assert true for valid value (>0)
    @Test
    void positiveAbsolutIntChecker() {
        // 5 == 5
        assertTrue(absolutValueChecker.absolutIntChecker(this.positiveValue) == positiveValue, "This value should be positive");
        // 5 == -5
        assertFalse(absolutValueChecker.absolutIntChecker(this.positiveValue) == negativeValue, "This value should be negative");
    }

    @Test
    void negativeAbsolutIntChecker() {
        // 5 != -5
        assertTrue(absolutValueChecker.absolutIntChecker(this.negativeValue) != negativeValue, "This value should be positive!");
        // -5 == 5
        assertFalse(absolutValueChecker.absolutIntChecker(this.negativeValue) == negativeValue, "This value should be positive!");
    }
}