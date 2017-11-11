package cc.somkiat.basicunittesting;

import cc.somkiat.basicunittesting.Model.ValidationResult;

/**
 * Created by patcharaponjoksamut on 11/11/2017 AD.
 */

public class EmailValidation {

    public ValidationResult validate(String inputName) {
        try {

        } catch (Exception e){
            return new ValidationResult(false, e.getMessage());
        }

        return new ValidationResult(true, null);
    }

}
