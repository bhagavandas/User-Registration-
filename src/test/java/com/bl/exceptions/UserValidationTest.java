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
    public void validLastName() {
        UserValidation userValidation = new UserValidation();
        Assertions.assertTrue(userValidation.validLastName("Bhagavan"));

    }

}