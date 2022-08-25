package com.bl.exceptions;

import org.junit.jupiter.api.Test;

interface IValidation{
    public boolean name();

}
class ValidationTest {
    /*Validating first name, lastname, email, mobile number, password using lambda expressions*/
    @Test
    public void validateFirstName(){
    String fname = "Bhagavan";
    String lname = "Bhagavan";
    String email = "das@gmail.com";
    String mobile = "91 9010626122";
    String pwd = "Bhagavandas2@";

    //using Lambda expression
    IValidation d = () -> {
        System.out.println("First name: " + fname.matches("[A-Z]{1}[a-z]{3,}+$"));
        System.out.println("Last name: " + lname.matches("[A-Z]{1}[a-z]{3,}+$"));
        System.out.println("Email: " + email.matches("[a-z]{3,}(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).[a-z](.+)[com+]$"));
        System.out.println("Mobile : " + mobile.matches("[0-9]{2}\\s{1,}[0-9]{10}$"));
        System.out.println("Password: " + pwd.matches("[A-Z]{1}[a-z]{8,}[0-9]{1,}(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).$"));

        return false;
        /* if the input is valid, it returns true otherwise it returns false */
    };

            d.name();
}
}