package cc.somkiat.basicunittesting;

import cc.somkiat.basicunittesting.MyException.NameValidationException;


/**
 * Created by patcharaponjoksamut on 11/11/2017 AD.
 */

class NameValidation {

    public ValidationResult validate(String inputName) {
        try {
            validateNameIsNull(inputName);
            validateNameIsEmptyString(inputName);
        } catch (Exception e){
            return new ValidationResult(false, e.getMessage());
        }
        return new ValidationResult(true, null);
    }

    private void validateNameIsNull(String name) throws NameValidationException {
        if(name == null) {
            throw new NameValidationException("Name is Null");
        }
    }

    private void validateNameIsEmptyString(String name) throws NameValidationException {
        if(name.isEmpty()) {
            throw new NameValidationException("Name is Empty String");
        }
    }
}
