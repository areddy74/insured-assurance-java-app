package com.insured;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class InsuredInsuranceTest {
    @Test
    public void testWelcomeMessage() {
        InsuredInsurance app = new InsuredInsurance();
        assertEquals("Welcome to Insured Assurance!", app.getWelcomeMessage());
    }
}
