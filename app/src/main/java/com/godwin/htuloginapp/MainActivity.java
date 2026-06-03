package com.godwin.htuloginapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * MainActivity controls the login screen.
 * This project uses simple validation for school project demonstration.
 */
public class MainActivity extends Activity {

    private EditText indexNumberInput;
    private EditText passwordInput;
    private TextView errorText;
    private Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        indexNumberInput = findViewById(R.id.indexNumberInput);
        passwordInput = findViewById(R.id.passwordInput);
        errorText = findViewById(R.id.errorText);
        loginButton = findViewById(R.id.loginButton);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                handleLogin();
            }
        });
    }

    private void handleLogin() {
        String indexNumber = indexNumberInput.getText().toString().trim();
        String password = passwordInput.getText().toString().trim();

        errorText.setVisibility(View.GONE);

        if (TextUtils.isEmpty(indexNumber)) {
            showError("Please enter your index number.");
            indexNumberInput.requestFocus();
            return;
        }

        if (TextUtils.isEmpty(password)) {
            showError("Please enter your password.");
            passwordInput.requestFocus();
            return;
        }

        if (password.length() < 4) {
            showError("Password must be at least 4 characters.");
            passwordInput.requestFocus();
            return;
        }

        Toast.makeText(this, "Login successful", Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(MainActivity.this, DashboardActivity.class);
        intent.putExtra("INDEX_NUMBER", indexNumber);
        startActivity(intent);
    }

    private void showError(String message) {
        errorText.setText(message);
        errorText.setVisibility(View.VISIBLE);
    }
}
