package com.bl.exceptions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestValidateUser {

    final String firstName = "^[A-Z]{1}[a-z]{3,}$";

    final String email = "[a-z]{3,}(.+)?[a-z](@)?[bl+](.+)[co+](.+)[a-z]{2}$";
    final String phoneNum = "[0-9]{2}\\s{1,}[0-9]{10}$";
    final String password = "[A-Z]{1}[a-z]{8,}[0-9]{1,}(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).$";

    public boolean isValidateName(String name) {

        Pattern pattern = Pattern.compile(firstName);
        Matcher match = pattern.matcher(name);
        return match.matches();
    }

    public boolean isValidateEmail(String e_mail) {

        Pattern pattern = Pattern.compile(email);
        Matcher match = pattern.matcher(e_mail);
        return match.matches();
    }

    public boolean isValidatePhoneNum(String phone) {

        Pattern pattern = Pattern.compile(phoneNum);
        Matcher match = pattern.matcher(phone);
        return match.matches();
    }

    public boolean isValidatePwd(String password) {

        Pattern pattern = Pattern.compile(password);
        Matcher match = pattern.matcher(password);
        return match.matches();
    }


}
