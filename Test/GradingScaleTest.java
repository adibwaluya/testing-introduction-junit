import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GradingScaleTest {

    @Test
    static void Calculate() {
        GradingScale gradingScale = new GradingScale();
        assertEquals("A", gradingScale.calculateGrade(90));
        assertEquals("B", gradingScale.calculateGrade(83));
        assertEquals("C", gradingScale.calculateGrade(65));
        assertEquals("D", gradingScale.calculateGrade(51));
        assertEquals("D", gradingScale.calculateGrade(43));

        assertEquals(297.6, gradingScale.calculateAvg());


    }

}