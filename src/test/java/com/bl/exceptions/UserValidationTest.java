package com.bl.exceptions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserValidationTest {

    //testing the given input is true or not using assertions
    @Test
    public void validFirstName() {
        UserValidation userValidation = new UserValidation();
        Assertions.assertTrue(userValidation.validFirstName("Bhagavan"));

    }

    //testing the given input is true or not using assertions
    @Test
    public void validPwd() {
        UserValidation userValidation = new UserValidation();
        Assertions.assertTrue(userValidation.validPassword("bhagavandas"));
    }

    //testing the given input is true or not using assertions
    @Test
    public void validPwdRule2() {
        UserValidation userValidation = new UserValidation();
        Assertions.assertTrue(userValidation.validPasswordRule2("Bhagavandas"));
    }

    //testing the given input is true or not using assertions
    @Test
    public void validPwdRule3() {
        UserValidation userValidation = new UserValidation();
        Assertions.assertTrue(userValidation.validPasswordRule3("Bhagavandas2"));
    }

    //testing the given input is true or not using assertions
    @Test
    public void validPwdRule4() {
        UserValidation userValidation = new UserValidation();
        Assertions.assertTrue(userValidation.validPasswordRule4("Bhagavandas2@"));
    }

}