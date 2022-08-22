package com.bl.exceptions;

import org.junit.jupiter.api.Test;

class TestValidateUserTest {

    @Test
    public void firstNameHappy() {
        TestValidateUser testValidateUser = new TestValidateUser();
        boolean result = testValidateUser.isValidateName("Bhagavan");
       assertEquals(true, result);
    }

    @Test
    public void firstNameSad() {
        TestValidateUser testValidateUser = new TestValidateUser();
        boolean result = testValidateUser.isValidateName("bhagavan");
        assertEquals(false, result);
    }

    @Test
    public void phoneNumHappy() {
        TestValidateUser testValidateUser = new TestValidateUser();
        boolean result = testValidateUser.isValidatePhoneNum("91 9010626122");
        assertEquals(true, result);
    }

    @Test
    public void phoneNumSad() {
        TestValidateUser testValidateUser = new TestValidateUser();
        boolean result = testValidateUser.isValidatePhoneNum("919010626122");
        assertEquals(false, result);
    }

    @Test
    public void passwordHappy() {
        TestValidateUser testValidateUser = new TestValidateUser();
        boolean result = testValidateUser.isValidatePwd("Bhagavan2@");
        assertEquals(true, result);
    }

    @Test
    public void passwordSad() {
        TestValidateUser testValidateUser = new TestValidateUser();
        boolean result = testValidateUser.isValidatePwd("bhagavan2");
        assertEquals(false, result);
    }

    @Test
    public void emailHappy() {
        TestValidateUser testValidateUser = new TestValidateUser();
        boolean result = testValidateUser.isValidateEmail("das.xyz@bl.co.in");
        assertEquals(true, result);
    }

    @Test
    public void emailSad() {
        TestValidateUser testValidateUser = new TestValidateUser();
        boolean result = testValidateUser.isValidateEmail("dasyahoo.com");
        assertEquals(false, result);
    }

    private void assertEquals(boolean b, boolean result) {
    }

}