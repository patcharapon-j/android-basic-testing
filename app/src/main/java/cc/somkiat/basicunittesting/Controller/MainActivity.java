package cc.somkiat.basicunittesting.Controller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import cc.somkiat.basicunittesting.EmailValidation;
import cc.somkiat.basicunittesting.Model.ValidationResult;
import cc.somkiat.basicunittesting.NameValidation;
import cc.somkiat.basicunittesting.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onSaveClick(View view) {
        EditText nameInput = findViewById(R.id.userNameInput);
        EditText emailInput = findViewById(R.id.emailInput);

        NameValidation nameValidation = new NameValidation();
        EmailValidation emailValidation = new EmailValidation();

        ValidationResult nameValidationResult = nameValidation.validate(nameInput.getText().toString());
        ValidationResult emailValidationrResult = emailValidation.validate(emailInput.getText().toString());

        if(!nameValidationResult.getResult()) {
            Toast.makeText(this, nameValidationResult.getErrorMessage(), Toast.LENGTH_SHORT).show();
        } else if (!emailValidationrResult.getResult()) {
            Toast.makeText(this, emailValidationrResult.getErrorMessage(), Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Save Successful", Toast.LENGTH_SHORT).show();
        }
    }

    public void onRevertClick(View view) {
        EditText nameInput = findViewById(R.id.userNameInput);
        EditText emailInput = findViewById(R.id.emailInput);

        nameInput.setText(null);
        emailInput.setText(null);
    }
}
