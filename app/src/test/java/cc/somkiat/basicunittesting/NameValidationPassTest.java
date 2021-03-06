package cc.somkiat.basicunittesting;

import org.junit.Test;

import cc.somkiat.basicunittesting.Model.ValidationResult;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

/**
 * Created by patcharaponjoksamut on 11/11/2017 AD.
 */

public class NameValidationPassTest {

    @Test
    public void NameIsSingleCharacter() {
        NameValidation nameValidation = new NameValidation();
        String inputName = "S";
        ValidationResult result = nameValidation.validate(inputName);

        assertTrue(result.getResult());
    }

    @Test
    public void NameIsSingleWord() {
        NameValidation nameValidation = new NameValidation();
        String inputName = "Smith";
        ValidationResult result = nameValidation.validate(inputName);

        assertTrue(result.getResult());
    }

    @Test
    public void NameIsFullName() {
        NameValidation nameValidation = new NameValidation();
        String inputName = "John Smith";
        ValidationResult result = nameValidation.validate(inputName);

        assertTrue(result.getResult());
    }

    @Test
    public void NameisFullNameWithMiddleName() {
        NameValidation nameValidation = new NameValidation();
        String inputName = "John Regal Smith";
        ValidationResult result = nameValidation.validate(inputName);

        assertTrue(result.getResult());
    }
}
