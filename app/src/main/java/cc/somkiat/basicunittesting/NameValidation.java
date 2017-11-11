package cc.somkiat.basicunittesting;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

import cc.somkiat.basicunittesting.MyException.NameIsNullException;


/**
 * Created by patcharaponjoksamut on 11/11/2017 AD.
 */

class NameValidation {

    public Boolean validate(String inputName) {
        try {
            validateNameIsNull(inputName);
        } catch (Exception e){
            return false;
        }

        return true;
    }

    private void validateNameIsNull(String name) throws NameIsNullException {
        if(name == null) {
            throw new NameIsNullException("Name is Null");
        }
    }
}
