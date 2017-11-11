package cc.somkiat.basicunittesting;

import org.junit.Test;

import cc.somkiat.basicunittesting.Model.ValidationResult;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;

/**
 * Created by patcharaponjoksamut on 11/11/2017 AD.
 */

public class NameValidationFailTest {

    @Test
    public void NameIsNull() {
        NameValidation nameValidation = new NameValidation();
        String inputName = null;
        ValidationResult result = nameValidation.validate(inputName);

        assertFalse(result.getResult());
        assertEquals("Name is Null", result.getErrorMessage());
    }

    @Test
    public void NameIsEmptyString() {
        NameValidation nameValidation = new NameValidation();
        String inputName = "";
        ValidationResult result = nameValidation.validate(inputName);

        assertFalse(result.getResult());
        assertEquals("Name is Empty String", result.getErrorMessage());
    }

    @Test
    public void NameContainNumber() {
        NameValidation nameValidation = new NameValidation();
        String inputName = "Smith112";
        ValidationResult result = nameValidation.validate(inputName);

        assertFalse(result.getResult());
        assertEquals("Name contain non Alphabet Characters", result.getErrorMessage());
    }

    @Test
    public void NameContainSpecialCharacter() {
        NameValidation nameValidation = new NameValidation();
        String inputName = "Smith##";
        ValidationResult result = nameValidation.validate(inputName);

        assertFalse(result.getResult());
        assertEquals("Name contain non Alphabet Characters", result.getErrorMessage());
    }

    @Test
    public void NameIsNonEnglish() {
        NameValidation nameValidation = new NameValidation();
        String inputName = "สมชาย หมายใจ";
        ValidationResult result = nameValidation.validate(inputName);

        assertFalse(result.getResult());
        assertEquals("Name contain non Alphabet Characters", result.getErrorMessage());
    }
}
