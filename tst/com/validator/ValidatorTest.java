package com.validator;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import com.validator.Validator;

public class ValidatorTest {

    private Validator validator = new Validator();

    @Test
    public void testValidator() {
        final String query = "3 + 2";
        final boolean result = validator.validate(query);
        assertTrue(result);
    }
}
