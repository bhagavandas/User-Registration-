package com.bl.exceptions;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(Parameterized.class)
public class ValidateEmailsTest {
    private final String email;
    private final boolean expectedResult;

    public ValidateEmailsTest(String email, boolean expectedResult) {
        this.email = email;

        this.expectedResult = expectedResult;
    }
@Parameterized.Parameters
    public static Collection input(){
        return Arrays.asList(new Object[][]{
                {"das@yahoo.com", true},{"abc100@yahoo.com", true},{"abc-100@abc.net", true},
                {"abc123@.com", false}, {"abc()*@gmail.com", false}, {"abc-100@yahoo.com", true}
        });
    }
@Test
    public void testUserValidationTest(){
    ValidateEmails validateEmails = new ValidateEmails();
    assertEquals(expectedResult, validateEmails.validEmail(email));
}
}