package ue2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GradingScaleTest {

    GradingScale gradingScale;
    double total;
    int count;
    int stopLoop;

    @BeforeEach
    void setUp() {
        gradingScale = new GradingScale();
        total = 240.0;
        count = 3;
        stopLoop = -1;
    }

    @Test
    void calculateGrade() {
        assertEquals("A, grade: " + 1.3, gradingScale.calculateGrade(90));
        assertEquals("B, grade: " + 2.0, gradingScale.calculateGrade(83));
        assertEquals("C, grade: " + 3.0, gradingScale.calculateGrade(65));
        assertEquals("D, grade: " + 4.0, gradingScale.calculateGrade(51));
        assertEquals("F, grade: " + 5.0, gradingScale.calculateGrade(43));
    }

    @Test
    void calculateAvg() {
        assertEquals(80, gradingScale.calculateAvg(stopLoop, total, count));
    }
}