package com.bl.exceptions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateEmails {
    //validating the email has 3 mandatory parts (abc, bl, co)
    public boolean validEmail(String email) {
        Pattern pattern = Pattern.compile("[a-z]{3,}(@)?[a-z](.+)[a-z]$");
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

}
