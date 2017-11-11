package cc.somkiat.basicunittesting;

import org.junit.Test;

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
}
