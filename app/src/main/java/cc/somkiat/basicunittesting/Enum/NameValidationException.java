package cc.somkiat.basicunittesting.Enum;

/**
 * Created by patcharaponjoksamut on 11/11/2017 AD.
 */

public enum NameValidationException {
    NAME_IS_NULL("Name is Null");

    private String message;

    NameValidationException(String message) {
        this.message = message;
    }

    public String message() {
        return this.message;
    }
}
