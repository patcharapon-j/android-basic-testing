package cc.somkiat.basicunittesting;

import org.apache.commons.validator.routines.EmailValidator;

import cc.somkiat.basicunittesting.Model.ValidationResult;
import cc.somkiat.basicunittesting.MyException.EmailValidationException;

/**
 * Created by patcharaponjoksamut on 11/11/2017 AD.
 */

public class EmailValidation {

    public ValidationResult validate(String email) {
        try {

            validateEmailIsNull(email);
            validateEmailIsEmpty(email);
            validateEmailIsValid(email);


        } catch (Exception e){
            return new ValidationResult(false, e.getMessage());
        }

        return new ValidationResult(true, null);
    }

    private void validateEmailIsEmpty(String email) throws EmailValidationException {
        if(email.isEmpty()) {
            throw new EmailValidationException(("Email is Empty"));
        }
    }

    private void validateEmailIsNull(String email) throws EmailValidationException {
        if(email == null) {
            throw new EmailValidationException("Email is Null");
        }
    }

    private void validateEmailIsValid(String email) throws EmailValidationException {
        if(!EmailValidator.getInstance().isValid(email)) {
            throw new EmailValidationException("Email is Invalid");
        }
    }

}
