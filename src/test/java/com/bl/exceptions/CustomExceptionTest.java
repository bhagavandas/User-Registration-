package com.bl.exceptions;


import org.junit.jupiter.api.Test;



class CustomExceptionTest {
    @Test
    public void validFirstName() throws CustomInvalidException {
        CustomException customException = new CustomException();
        if (customException.validFirstName("Bhagavan")) {
            System.out.println("Valid");

        } else {
            throw new CustomInvalidException("inValid first name");
        }
    }

    @Test
    public void validLastName() throws CustomInvalidException {
        CustomException customException = new CustomException();
        if (customException.validLastName("Bhagavan")) {
            System.out.println("Valid");
        } else {
            throw new CustomInvalidException("invalid last name");
        }
    }

    @Test
    public void validEmail() throws CustomInvalidException {
        CustomException customException = new CustomException();
        if (customException.validEmail("das.xyz@yahoo.com")) {
            System.out.println("Valid");
        } else {
           throw new CustomInvalidException("invalid email");
        }
    }

    @Test
    public void validMobile() throws CustomInvalidException {
        CustomException customException = new CustomException();
        if (customException.validMobile("91 9010626122")) {
            System.out.println("Valid");
        } else {
            throw new CustomInvalidException("invalid mobile number");
        }
    }

    @Test
    public void validPassword() throws CustomInvalidException {
        CustomException customException = new CustomException();
        if (customException.validPassword("Bhagavan2@")) {
            System.out.println("Valid");
        } else {
             throw new CustomInvalidException("invalid mobile number");
        }
    }
}