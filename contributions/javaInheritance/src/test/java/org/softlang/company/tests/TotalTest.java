package org.softlang.company.tests;

import org.softlang.company.model.Company;

import static org.softlang.company.features.Total.*;
import static org.softlang.company.features.Parsing.*;

import static org.junit.Assert.*;
import org.junit.Test;

public class TotalTest {

    @Test
    public void testTotal() {
        Company c = readObject("inputs/sampleCompany.ser");
        double total = total(c);		
        assertEquals(399747, total, 0);
    }

}