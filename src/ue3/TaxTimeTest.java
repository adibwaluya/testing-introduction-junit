package ue3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaxTimeTest {
    TaxTime taxTime;
    int familyMember0;
    int familyMember4;
    int familyMember100;
    int income0;
    int income1;
    int lowIncome;
    int mediumIncome;
    int highIncome;
    int minusTaxTotal;
    int normalTaxTotal;

    @BeforeEach
    void setUp() {
        taxTime = new TaxTime();
        income0 = -2;
        income1 = 1;
        lowIncome = 5000;
        mediumIncome = 25000;
        highIncome = 80000;
        normalTaxTotal = 50000;
        minusTaxTotal = -200;
    }

    @Test
    void familyAllIncome() {
        //Test negative/positive income
        assertEquals("Even in Berlin, no one has a negative income!", taxTime.checkIncome(income0));
        assertEquals("Correct income input", taxTime.checkIncome(income1));

        //Test family member
        assertEquals("Did you forget to count yourself?", taxTime.checkFamilyMember(0));
        assertEquals("Valid input", taxTime.checkFamilyMember(2));

        //Test taxTotal lowIncome
        assertEquals("You have low income. Your tax is: 400.0", taxTime.checkComputeTaxTotal(lowIncome));
        //Test taxTotal mediumIncome
        assertEquals("You have medium income. Your tax is: 3700.0", taxTime.checkComputeTaxTotal(mediumIncome));
        //Test taxTotal HighIncome
        assertEquals("You have high income. Your tax is: 12100.0", taxTime.checkComputeTaxTotal(highIncome));

        assertEquals(normalTaxTotal, taxTime.checkNegativeTaxTotal(normalTaxTotal));
        assertEquals(0, taxTime.checkNegativeTaxTotal(minusTaxTotal));

    }
}