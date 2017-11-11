package cc.somkiat.basicunittesting;

/**
 * Created by patcharaponjoksamut on 11/11/2017 AD.
 */

public class ValidationResult {

    private boolean result;
    private String errorMessage;

    public ValidationResult(boolean result, String errorMessage) {
        this.result = result;
        this.errorMessage = errorMessage;
    }

    public boolean getResult() {
        return result;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
