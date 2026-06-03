package com.godwin.htuloginapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * DashboardActivity displays a simple welcome screen after login.
 */
public class DashboardActivity extends Activity {

    private TextView welcomeText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        welcomeText = findViewById(R.id.welcomeText);

        String indexNumber = getIntent().getStringExtra("INDEX_NUMBER");

        if (indexNumber == null || indexNumber.trim().isEmpty()) {
            indexNumber = "Student";
        }

        welcomeText.setText("Welcome, " + indexNumber);
    }
}
