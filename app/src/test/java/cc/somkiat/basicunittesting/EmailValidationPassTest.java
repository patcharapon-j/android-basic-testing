package cc.somkiat.basicunittesting;

import org.junit.Test;

import cc.somkiat.basicunittesting.Model.ValidationResult;

import static junit.framework.Assert.assertTrue;

/**
 * Created by patcharaponjoksamut on 11/11/2017 AD.
 */

public class EmailValidationPassTest {

    @Test
    public void EmailStandart() {
        EmailValidation emailValidation = new EmailValidation();
        String inputEmail = "test@gmail.com";
        ValidationResult result = emailValidation.validate(inputEmail);

        assertTrue(result.getResult());
    }

    @Test
    public void EmailWithDot() {
        EmailValidation emailValidation = new EmailValidation();
        String inputEmail = "test.test@gmail.com";
        ValidationResult result = emailValidation.validate(inputEmail);

        assertTrue(result.getResult());
    }

    @Test
    public void EmailWithDotEnd() {
        EmailValidation emailValidation = new EmailValidation();
        String inputEmail = "test@gmail.co.th";
        ValidationResult result = emailValidation.validate(inputEmail);

        assertTrue(result.getResult());
    }

    @Test
    public void EmailWithStrangeEnd() {
        EmailValidation emailValidation = new EmailValidation();
        String inputEmail = "test@gmail.xyz";
        ValidationResult result = emailValidation.validate(inputEmail);

        assertTrue(result.getResult());
    }
}
