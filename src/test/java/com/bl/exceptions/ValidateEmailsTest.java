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
                {"abc123@.com", false}, {"abc()*@gmail.com", false}, {"abc-100@yahoo.com", true},
                {"abc111@abc.com", true}, {"abc-100@abc.net", true}, {"abc.100@abc.com.au", true},
                {"abc@1.com", true}, {"abc@gmail.com.com", true}, {"abc+100@gmail.com", true}, {"abc@abc@gmail.com", false},
                {"abc..2002@gmail.com", false},{"abc()*@gmail.com", false}, {".abc@abc.com", false},
                {"abc123@.com.com", false}, {"abc123@.com", false}, {"abc123@gmail.a", false},
                {"abc@.com.my", false}, {"abc@%*.com", false}
        });
    }
@Test
    public void testUserValidationTest(){
    ValidateEmails validateEmails = new ValidateEmails();
    assertEquals(expectedResult, validateEmails.validEmail(email));
}
}