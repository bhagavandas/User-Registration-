package com.bl.exceptions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CustomException {
    final String firstName = "^[A-Z]{1}[a-z]{3,}$";
    final String lastName = "^[A-Z]{1}[a-z]{3,}$";
    final String email = "[a-z]{3,}(.+)?[a-z](@)[a-z](.+)(.com+)$";
    final String phoneNum = "[0-9]{2}\\s{1,}[0-9]{10}$";
    final String password = "[A-Z]{1}[a-z]{8,}[0-9]{1,}(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).$";

    public boolean validFirstName(String first_name) {

            Pattern pattern = Pattern.compile(firstName);
            Matcher match = pattern.matcher(first_name);
            return match.matches();
        }

    public boolean validLastName(String last_name) {

        Pattern pattern = Pattern.compile(lastName);
        Matcher match = pattern.matcher(last_name);
        return match.matches();
    }

    public boolean validEmail(String e_mail) {

        Pattern pattern = Pattern.compile(email);
        Matcher match = pattern.matcher(e_mail);
        return match.matches();
    }

    public boolean validMobile(String mobile) {

        Pattern pattern = Pattern.compile(phoneNum);
        Matcher match = pattern.matcher(mobile);
        return match.matches();
    }

    public boolean validPassword(String pwd) {

        Pattern pattern = Pattern.compile(password);
        Matcher match = pattern.matcher(pwd);
        return match.matches();
    }
}
