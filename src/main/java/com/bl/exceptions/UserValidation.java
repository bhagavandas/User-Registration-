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
}
