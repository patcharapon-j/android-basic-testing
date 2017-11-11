package cc.somkiat.basicunittesting;

import org.junit.Test;

import static junit.framework.Assert.assertFalse;

/**
 * Created by patcharaponjoksamut on 11/11/2017 AD.
 */

public class NameValidationFailTest {

    @Test
    public void NameIsNull() {
        NameValidation nameValidation = new NameValidation();
        String inputName = null;
        Boolean result = nameValidation.validate(inputName);
        assertFalse("Name is NULL must return FALSE", result);
    }

}
