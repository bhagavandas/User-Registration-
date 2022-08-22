package com.bl.exceptions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidation {

    //validating the first name has one Caps and minimum 3 characters
    public boolean validFirstName(String fName) {
        Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{3,}$");
        Matcher matcher = pattern.matcher(fName);
        return matcher.matches();
    }

    //validating the last name has one Caps and minimum 3 characters
    public boolean validLastName(String lastName) {
        Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{3,}$");
        Matcher matcher = pattern.matcher(lastName);
        return matcher.matches();
    }

    //validating the email has 3 mandatory parts (abc, bl, co)
    public boolean validEmail(String email) {
        Pattern pattern = Pattern.compile("[abc+](.+)?[a-z](@)?[bl+](.+)[co+](.+)[a-z]{2}$");
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    //validating the Mobile has country code followed by space and 10 digit number
    public boolean validMobile(String mobile) {
        Pattern pattern = Pattern.compile("[0-9]{2}\\s{1,}[0-9]{10}$");
        Matcher matcher = pattern.matcher(mobile);
        return matcher.matches();
    }

    // validating the password that has minimum 8 characters
    public boolean validPassword(String pwd) {
        Pattern pattern = Pattern.compile("[a-z]{8,}$");

        Matcher matcher = pattern.matcher(pwd);
        return matcher.matches();
    }

    // validating the password that has minimum 8 characters and one uppercase
    public boolean validPasswordRule2(String pwd) {
        Pattern pattern = Pattern.compile("[A-Z]{1}[a-z]{8,}$");
        //Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{3,}+$");
        Matcher matcher = pattern.matcher(pwd);
        return matcher.matches();
    }
}
