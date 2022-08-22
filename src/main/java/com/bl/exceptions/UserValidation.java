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
}
