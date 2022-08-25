package com.bl.exceptions;


import org.junit.jupiter.api.Test;



class CustomExceptionTest {
    //validating the firstname throwing custom exception
    @Test
    public void validFirstName() throws CustomInvalidException {
        CustomException customException = new CustomException();
        if (customException.validFirstName("Bhagavan")) {
            System.out.println("Valid");

        } else {
            throw new CustomInvalidException("inValid first name");
        }
    }


//validating the lastname throwing custom exception
    @Test
    public void validLastName() throws CustomInvalidException {
        CustomException customException = new CustomException();
        if (customException.validLastName("Bhagavan")) {
            System.out.println("Valid");
        } else {
            throw new CustomInvalidException("invalid last name");
        }
    }


    //validating the email throwing custom exception
    @Test
    public void validEmail() throws CustomInvalidException {
        CustomException customException = new CustomException();
        if (customException.validEmail("das.xyz@yahoo.com")) {
            System.out.println("Valid");
        } else {
           throw new CustomInvalidException("invalid email");
        }
    }

    //validating the mobile number throwing custom exception
    @Test
    public void validMobile() throws CustomInvalidException {
        CustomException customException = new CustomException();
        if (customException.validMobile("91 9010626122")) {
            System.out.println("Valid");
        } else {
            throw new CustomInvalidException("invalid mobile number");
        }
    }


    //validating the password throwing custom exception
    @Test
    public void validPassword() throws CustomInvalidException {
        CustomException customException = new CustomException();
        if (customException.validPassword("bhagavan2@")) {
            System.out.println("Valid");
        } else {
             throw new CustomInvalidException("invalid mobile number");
        }
    }
}