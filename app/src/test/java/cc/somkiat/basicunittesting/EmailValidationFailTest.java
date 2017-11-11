package cc.somkiat.basicunittesting;

import org.junit.Test;

import cc.somkiat.basicunittesting.Model.ValidationResult;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;

/**
 * Created by patcharaponjoksamut on 11/11/2017 AD.
 */

public class EmailValidationFailTest {

    @Test
    public void EmailIsEmpty() {
        EmailValidation emailValidation = new EmailValidation();
        String inputEmail = "";
        ValidationResult result = emailValidation.validate(inputEmail);

        assertFalse(result.getResult());
        assertEquals("Email is Empty", result.getErrorMessage());
    }

    @Test
    public void EmailIsNull() {
        EmailValidation emailValidation = new EmailValidation();
        String inputEmail = null;
        ValidationResult result = emailValidation.validate(inputEmail);

        assertFalse(result.getResult());
        assertEquals("Email is Null", result.getErrorMessage());
    }

    @Test
    public void EmailIsRandomString() {
        EmailValidation emailValidation = new EmailValidation();
        String inputEmail = "asd.as>jff@kl";
        ValidationResult result = emailValidation.validate(inputEmail);

        assertFalse(result.getResult());
        assertEquals("Email is Invalid", result.getErrorMessage());
    }

    @Test
    public void EmailIsMissingName() {
        EmailValidation emailValidation = new EmailValidation();
        String inputEmail = "@gmail.com";
        ValidationResult result = emailValidation.validate(inputEmail);

        assertFalse(result.getResult());
        assertEquals("Email is Invalid", result.getErrorMessage());
    }
}
