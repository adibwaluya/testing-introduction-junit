import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.After;

public class GradingScaleTest {

    @Test
    void Calculate() {
        GradingScale gradingScale = new GradingScale();
        assertEquals("A", gradingScale.calculateGrade(90));
    }
}